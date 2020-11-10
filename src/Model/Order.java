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

public class Order implements IOrdenable{
    
    private int numberOrder;
    private String cliente = "";
    private String description;
    private ArrayList<Food> orderList;
    private double price ;

    public Order(int numberOrder, String cliente) {
        this.numberOrder = numberOrder;
        this.cliente = cliente;
        this.description = "";
        this.orderList = new ArrayList<Food>();
        this.price = 0;
    }
    

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public ArrayList<Food> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Food> orderList) {
        this.orderList = orderList;
    }

    @Override
    public void addFood(Food food) {
        this.orderList.add(food);
       // this.price += food.price;
    }

    @Override
    public void removeFood(int line) {
        this.orderList.remove(line);
   //this.price += this.orderList.remove(line).price;
    }
    
    @Override
    public String getDescription() {
        /*this.description = "";
        for (int i = 0; i < this.orderList.size(); i++) {
            this.description =  "\n"+"======================"+"\n"+"-Name: "+ this.orderList.get(i).name +"\n"+"-Description: "+ this.orderList.get(i).description ;
        }*/
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
