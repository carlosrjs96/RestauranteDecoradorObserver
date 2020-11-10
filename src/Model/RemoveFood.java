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
public class RemoveFood extends OrdenableDecorator{
    Food food;
    int line;
    public RemoveFood(int line, IOrdenable ordenable) {
        super(ordenable);
        this.line = line;
        this.food = getOrderList().get(line);
        this.removeFood(line);
        this.getPrice();
    }
    
    @Override
    public void addFood(Food food) {
        this.getOrdenable().getOrderList().add(this.food);
    }
    
    @Override
    public void removeFood(int code) {
        this.getOrdenable().getOrderList().remove(code);
    }

    @Override
    public String getDescription() {
        return this.getOrdenable().getDescription().replace("=================================="+"\n"+"-Item: "+this.getOrdenable().getOrderList().indexOf(this.food)+"\n"+"-Name: "+ food.getName() +"\n"+"-Description: "+ food.getDescription()+"\n"+"-Type: "+ food.getFoodType()+"\n"+"-Price: "+ food.getPrice()+"\n","");
    }

    @Override
    public double getPrice() {
        return this.getOrdenable().getPrice() - this.food.getPrice();
    }
    
    /*public double getPrice(int _line) {
        return this.getOrdenable().getPrice() - getOrderList().get(_line).getPrice();
    }*/
    

    @Override
    public ArrayList<Food> getOrderList() {
        return this.getOrdenable().getOrderList();
    }
}
