/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.*;
import Controller.*;

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderManager orderManager = OrderManager.getInstance();
        
        ScreensView pantalla = new ScreensView();
        
        ScreensController controlador = new ScreensController(orderManager, pantalla);
        
        pantalla.setVisible(true);
        
        
        
        
        /*FoodFactory factory = new FoodFactory();
        IOrdenable orden = new Order(1, "Carlos");
        
        orden = new AddFood(factory.getInstance(MenuFood.HAPPYBOX),orden);
        orden = new AddFood(factory.getInstance(MenuFood.BAKEDHOTAPPLEPIE),orden);
        orden = new AddFood(factory.getInstance(MenuFood.BIGMAC),orden);
        orden = new AddFood(factory.getInstance(MenuFood.COCACOLACLASSICSMALL),orden);
        //orden = new RemoveFood(0,orden);
        orden = new RemoveFood(0,orden);
        //orden = new RemoveFood(0,orden);
        //orden = new RemoveFood(0,orden);
        //orden = new AddFood(factory.getInstance(MenuFood.CHICKENMCNUGGETS4PC),orden);
        
        System.out.println("ORDER LIST: "+orden.getDescription());
        System.out.println("\n ===> TOTAL = "+orden.getPrice()+"\n");
        System.out.println("food: "+orden.getOrderList().size());
        
        OrderManager orderManager = OrderManager.getInstance();
        
        Kitchen kitchen = new Kitchen(orderManager);
        
        orderManager.addObserver(kitchen);
        
        orderManager.addOrder(orden);
        orderManager.addOrder(orden);
        //orderManager.addOrder(orden);
        //orderManager.addOrder(orden);
        //orderManager.addOrder(orden);
        orderManager.printInvoice(0);
        
        
        System.out.println("OrdenableList :  OrderManager Size="+orderManager.getOrdenableList().size());
        //System.out.println("Actualizado : Size="+kitchen.getOrdenableList().size());
        //kitchen.getOrdenableList().remove(0);
        kitchen.getOrderManager().removeOrder(0);
        System.out.println("OrdenableList :  OrderManager Size="+orderManager.getOrdenableList().size());
        
         
        */ 
         /*String descri = "";
        
        for (int i = 0; i < orden.getOrderList().size(); i++) {
            descri +=  "\n"+"========= LINE "+i+" ============="+"\n"
                    +"-Name: "+ orden.getOrderList().get(i).getName()+"\n"
                    +"-Description: "+ orden.getOrderList().get(i).getDescription()+"\n"
                    +"-Price: "+ orden.getOrderList().get(i).price;
        }
        descri +=  "\n"+"==> TOTAL = "+orden.getPrice();
        
        System.out.println("************ ORDER LIST ************");
        System.out.println(descri);*/
        // TODO code application logic here
        
    }
    
}
