/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Carlos
 */
public class FoodFactory {
    
    FoodType foodType;
    MenuFood menuFood;

    public Food getInstance( MenuFood menuFood) {
       if(menuFood.getFoodType() == foodType.COMBO){
           return new Combo(menuFood);
       }
       if(menuFood.getFoodType() == FoodType.SIDE){
           return new Sides(menuFood);
       }
       System.out.println("NO FOOD TYPE");
       return null; //To change body of generated methods, choose Tools | Templates.
    
    }
}
