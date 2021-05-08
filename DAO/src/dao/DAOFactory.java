/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gguzm
 */
public class DAOFactory {
    
    public static final String TIPO_DAO = "TIPO_DAO";
    public static final String TIPO_DAO_TXT = "TXT";
    
    private static DAOFactory instance;
    
    private DAOFactory() {
    }
    
    public static DAOFactory getIntance() {
        if (instance==null) {
            instance = new DAOFactory();
        }
        return instance;
    }

    public DAO createDAO(Map<String, String> config) throws DAOFactoryException {
        try {
            String tipoDAO = config.get(TIPO_DAO);
            switch (tipoDAO) {
                case TIPO_DAO_TXT:
                    String filename = config.get("FILE_NAME");
                    return new AlumnoDAOTXT(filename);
                case "SQL":
                    return new AlumnoDAOSQL();
                default:
                    throw new DAOFactoryException("Tipo de DAO NO implementado");
            }
        } catch (DAOException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOFactoryException("Error al crear el DAO");
        }
    }
}
