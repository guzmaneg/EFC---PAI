/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author g.guzman
 */
public class MiCalendario extends GregorianCalendar {

    public MiCalendario(int dia, int mes, int anio) throws MiCalendarioException {
        super(anio, mes-1, dia);
        
        setLenient(false); // evitar la permisividad
        
        try {
            get(Calendar.MONTH);
        }
        catch (IllegalArgumentException ex) {
            throw new MiCalendarioException("Fecha incorrecta ("+ex.getMessage()+")");
        }
    }

    public MiCalendario(Date sqlDate) {
        setTimeInMillis(sqlDate.getTime());
    }

    public MiCalendario(Calendar cal) {
        setTimeInMillis(cal.getTimeInMillis());
    }
    
    
    public int getDia() {
        return get(DAY_OF_MONTH);
    }
            
    public int getMes() {
        return get(MONTH)+1;
    }
    
    public int getAnio() {
        return get(YEAR);
    }
    
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", getDia(), getMes(), getAnio());
    }

    public Date toSqlDate() {
        return new Date(this.getTimeInMillis());
    }
    
    
}
