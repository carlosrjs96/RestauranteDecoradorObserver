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
public enum MenuFood {

    //****COMBO****
    
    CHEESEBURGEREXTRAVALUEMEALS("1", "2-Cheeseburger-Extra-Value-Meals", FoodType.COMBO, "2-Cheeseburger-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-2-Cheeseburger-Extra-Value-Meals.jpg", 2000),
    BIGMACEXTRAVALUEMEALS("2", "Big-Mac-Extra-Value-Meals", FoodType.COMBO, "Big-Mac-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Big-Mac-Extra-Value-Meals.jpg", 2000),
    CHICKENMCNUGGETS10PIECEEXTRAVALUEMEALS("3", "Chicken-McNuggets-10-piece-Extra-Value-Meals", FoodType.COMBO, "Chicken-McNuggets-10-piece-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Chicken-McNuggets-10-piece-Extra-Value-Meals.jpg", 2000),
    DOUBLEQUARTERPOUNDERWITHCHEESEEXTRAVALUEMEALS("4", "Double-Quarter-Pounder-with-Cheese-Extra-Value-Meals", FoodType.COMBO, "Double-Quarter-Pounder-with-Cheese-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Double-Quarter-Pounder-with-Cheese-Extra-Value-Meals.jpg", 2000),
    EGGMCMUFFINEXTRAVALUEMEALS("5", "Egg-McMuffin-Extra-Value-Meals", FoodType.COMBO, "Egg-McMuffin-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Egg-McMuffin-Extra-Value-Meals.jpg", 2000),
    FILETOFISHEXTRAVALUEMEALS("6", "Filet-O-Fish-Extra-Value-Meals", FoodType.COMBO, "Filet-O-Fish-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Filet-O-Fish-Extra-Value-Meals.jpg", 2000),
    HAPPYBOX("7", "Happy Sharing Box", FoodType.COMBO, "Happy Sharing Box", ".\\src\\Images\\h-mcdonalds-Hamburger.jpg", 2500),
    PREMIUMCRISPYCHICKENCLASSICEXTRAVALUEMEALS("8", "Premium-Crispy-Chicken-Classic-Extra-Value-Meals", FoodType.COMBO, "Premium-Crispy-Chicken-Classic-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Premium-Crispy-Chicken-Classic-Extra-Value-Meals.jpg", 2000),
    QUARTERPOUNDERWITHCHEESEEXTRAVALUEMEALS("9", "Quarter-Pounder-with-Cheese-Extra-Value-Meals", FoodType.COMBO, "Quarter-Pounder-with-Cheese-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Quarter-Pounder-with-Cheese-Extra-Value-Meals.jpg", 2000),
    SAUSAGEMCMUFFINWITHEGGEXTRAVALUEMEALS("10", "Sausage-McMuffin-with-Egg-Extra-Value-Meals", FoodType.COMBO, "Sausage-McMuffin-with-Egg-Extra-Value-Meals", ".\\src\\Images\\h-mcdonalds-Sausage-McMuffin-with-Egg-Extra-Value-Meals.jpg", 2000),
    
    //****SIDES****
    
    APPLESLICES("11", "Apple-Slices", FoodType.SIDE, "Apple-Slices", ".\\src\\Images\\t-mcdonalds-Apple-Slices.jpg", 900),
    BAKEDHOTAPPLEPIE("12", "Baked-Hot-Apple-Pie", FoodType.SIDE, "Baked-Hot-Apple-Pie", ".\\src\\Images\\t-mcdonalds-Baked-Hot-Apple-Pie.jpg", 900),
    BIGMAC("13", "Big-Mac", FoodType.SIDE, "Big-Mac", ".\\src\\Images\\t-mcdonalds-Big-Mac.jpg", 1500),
    CHEESEBURGER("14", "Cheeseburger", FoodType.SIDE, "Cheeseburger", ".\\src\\Images\\t-mcdonalds-Cheeseburger.jpg", 1250),
    CHICKENMCNUGGETS4PC("15", "Chicken-McNuggets-4pc", FoodType.SIDE, "Chicken-McNuggets-4pc", ".\\src\\Images\\t-mcdonalds-Chicken-McNuggets-4pc.jpg", 950),
    CHOCOLATECHIPCOOKIE("16", "Chocolate-Chip-Cookie", FoodType.SIDE, "Chocolate-Chip-Cookie", ".\\src\\Images\\t-mcdonalds-Chocolate-Chip-Cookie.jpg", 900),
    CHOCOLATEMCCAFESHAKEMEDIUM("17", "Chocolate-McCafe-Shake-Medium", FoodType.SIDE, "Chocolate-McCafe-Shake-Medium", ".\\src\\Images\\t-mcdonalds-Chocolate-McCafe-Shake-Medium.jpg", 900),
    COCACOLACLASSICSMALL("18", "Coca-Cola-Classic-Small", FoodType.SIDE, "Coca-Cola-Classic-Small", ".\\src\\Images\\t-mcdonalds-Coca-Cola-Classic-Small.jpg", 900),
    DONUTSTICKS("19", "donut-sticks", FoodType.SIDE, "donut-sticks", ".\\src\\Images\\t-mcdonalds-donut-sticks.jpg", 900),
    //DOUBLECHEESEBURGER("20", "", FoodType.SIDE, "", "t-mcdonalds-Double-Cheeseburger.jpeg", 900),
    VANILLAMCCAFESHAKEMEDIUM("21", "Vanilla-McCafe-Shake-Medium", FoodType.SIDE, "Vanilla-McCafe-Shake-Medium", ".\\src\\Images\\t-mcdonalds-Vanilla-McCafe-Shake-Medium.jpg", 900);
    /*DOUBLEQUARTERPOUNDERWITHCHEESE("", "", FoodType.SIDE, "", "t-mcdonalds-Double-Quarter-Pounder-with-Cheese.jpeg", 900),
    EGGMCMUFFIN("", "", FoodType.SIDE, "", "t-mcdonalds-Egg-McMuffin.jpeg", 900),
    FANTAORANGE("", "", FoodType.SIDE, "", "t-mcdonalds-fanta-orange.jpeg", 900),
    FILETOFISH("", "", FoodType.SIDE, "", "t-mcdonalds-Filet-O-Fish.jpeg", 900),
    FRIESSMALL("", "", FoodType.SIDE, "", "t-mcdonalds-fries-small.jpeg", 900),
    HAMBURGER("", "", FoodType.SIDE, "", "t-mcdonalds-Hamburger.jpeg", 900),
    HOTFUDGESUNDAE("", "", FoodType.SIDE, "", "t-mcdonalds-Hot-Fudge-Sundae.jpeg", 900),
    MCCHICKEN("", "", FoodType.SIDE, "", "t-mcdonalds-McChicken.jpeg", 900),
    MCDOUBLE("", "", FoodType.SIDE, "", "t-mcdonalds-McDouble.jpeg", 900),
    MCFLURRYWITHMMSCHOCOLATECANDIES12FLOZCUP("", "", FoodType.SIDE, "", "t-mcdonalds-McFlurry-with-MMS-Chocolate-Candies-12floz-cup.jpeg", 900),
    MCFLURRYWITHOREOCOOKIES12FLOZCUP("", "", FoodType.SIDE, "", "t-mcdonalds-McFlurry-with-OREO-Cookies-12floz-cup.jpeg", 900),
    PREMIUMBUTTERMILKCRISPYCHICKENDELUXESANDWICH("", "", FoodType.SIDE, "", "t-mcdonalds-Premium-Buttermilk-Crispy-Chicken-Deluxe-Sandwich.jpeg", 900),
    QPCBACON("", "", FoodType.SIDE, "", "t-mcdonalds-qpc-bacon.jpeg", 900),
    QPCDELUXEBURGER("", "", FoodType.SIDE, "", "t-mcdonalds-qpc-deluxe-burger.jpeg", 900),
    QUARTERPOUNDERWITHCHEESE("", "", FoodType.SIDE, "", "t-mcdonalds-Quarter-Pounder-with-Cheese.jpeg", 900),
    SAUSAGEMCMUFFIN("", "", FoodType.SIDE, "", "t-mcdonalds-Sausage-McMuffin.jpeg", 900),
    SPRITESMALL("", "", FoodType.SIDE, "", "t-mcdonalds-Sprite-Small.jpeg", 900),
    STRAWBERRYMCCAFESHAKEMEDIUM("", "", FoodType.SIDE, "", "t-mcdonalds-Strawberry-McCafe-Shake-Medium.jpeg", 900),
    //VANILLAMCCAFESHAKEMEDIUM("", "", FoodType.SIDE, "", "t-mcdonalds-Vanilla-McCafe-Shake-Medium.jpeg", 900),
    VANILLAREDUCEDFATICECREAMCONE("", "", FoodType.SIDE, "", "t-mcdonalds-Vanilla-Reduced-Fat-Ice-Cream-Cone.jpeg", 900);*/

    String code;
    String name;
    FoodType foodType;
    String description;
    String image;
    double price;

    private MenuFood(String code, String name, FoodType foodType, String description, String image, double price) {
        this.code = code;
        this.name = name;
        this.foodType = foodType;
        this.description = description;
        this.image = image;
        this.price = price;
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
