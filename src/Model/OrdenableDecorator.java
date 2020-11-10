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
public class OrdenableDecorator implements IOrdenable {
    
    private IOrdenable ordenable;

    public OrdenableDecorator(IOrdenable ordenable) {
        this.ordenable = ordenable;
    }

    public IOrdenable getOrdenable() {
        return ordenable;
    }

    public void setOrdenable(IOrdenable ordenable) {
        this.ordenable = ordenable;
    }

    @Override
    public void addFood(Food food) {
        this.ordenable.addFood(food);
        //this.ordenable.addFood(food);
    }

    @Override
    public void removeFood(int code) {
        this.ordenable.removeFood(code);
        //this.ordenable.removeFood(code);
    }

    @Override
    public String getDescription() {
        return this.ordenable.getDescription();
    }

    @Override
    public double getPrice() {
        return this.ordenable.getPrice();
    }

    @Override
    public ArrayList<Food> getOrderList() {
        return this.ordenable.getOrderList();
    }

    @Override
    public String getCliente() {
        return this.ordenable.getCliente();
    }
    @Override
    public int getNumberOrder(){
        return this.ordenable.getNumberOrder();
    }
    
}
