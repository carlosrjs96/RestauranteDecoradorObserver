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
public class AddFood extends OrdenableDecorator{
    Food food;
    int line;
    public AddFood(Food food, IOrdenable ordenable) {
        super(ordenable);
        this.food = food;
        this.addFood(food);
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
        return this.getOrdenable().getDescription().concat("=================================="+"\n"+"-Item: "+this.getOrdenable().getOrderList().indexOf(this.food)+"\n"+"-Name: "+ food.getName() +"\n"+"-Description: "+ food.getDescription()+"\n"+"-Type: "+ food.getFoodType()+"\n"+"-Price: "+ food.getPrice()+"\n");
    }

    @Override
    public double getPrice() {
        return this.getOrdenable().getPrice()+food.getPrice();
    }

    @Override
    public ArrayList<Food> getOrderList() {
        return this.getOrdenable().getOrderList();
    }
}
