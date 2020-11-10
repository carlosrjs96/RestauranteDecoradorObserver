/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public interface IOrdenable {
    
    public void addFood(Food food);
    
    public void removeFood(int code);
    
    public int getNumberOrder();
    
    public String getCliente();
    
    public String getDescription();
    
    public double getPrice();
    
    public ArrayList<Food> getOrderList();    
}
