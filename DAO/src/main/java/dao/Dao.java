/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author g.guzman
 * @param <T> Entidad genérica
 */
public abstract class Dao <T, K>{
    
    public abstract void create(T entity) throws DaoException;
    public abstract T read(K id) throws DaoException;
    public abstract void update(T entity) throws DaoException;
    public abstract void delete(K id) throws DaoException;
    
    public abstract boolean exist(K id) throws DaoException;
    public abstract List<T> findAll(boolean isOnlyActive) throws DaoException;
    public abstract void close() throws DaoException;

}
