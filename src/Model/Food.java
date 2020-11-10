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
public class Food {
    String code;
    String name;
    MenuFood foodEnum;
    FoodType foodType;
    String description;
    double price;
    String image;

    public Food(MenuFood foodEnum) {
        this.code = foodEnum.code;
        this.name = foodEnum.name;
        this.foodEnum = foodEnum;
        this.foodType = foodEnum.foodType;
        this.price = foodEnum.price;
        this.image = foodEnum.image;
        this.description = foodEnum.description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuFood getFoodEnum() {
        return foodEnum;
    }

    public void setFoodEnum(MenuFood foodEnum) {
        this.foodEnum = foodEnum;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
}
