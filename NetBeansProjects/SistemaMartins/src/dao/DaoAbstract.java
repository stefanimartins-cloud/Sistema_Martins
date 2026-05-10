/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 * Crud 
 * @author u10047649100
 */
public abstract class DaoAbstract {
    public abstract void insert(Object object);
    public abstract void update (Object object);
    public abstract void dalete(Object object);
    public abstract Object list (int id);
    public abstract Object listAll ();
}
