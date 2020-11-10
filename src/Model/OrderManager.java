/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.ArrayList;
import java.util.Observable;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Carlos
 */
public class OrderManager extends Observable{
    private ArrayList<IOrdenable> ordenableList; 
    private static OrderManager orderManager;
    private int counter;
    private OrderManager() {
        ordenableList = new ArrayList<IOrdenable>();
        counter = 0;
    }
    
    public static OrderManager getInstance(){
        if (orderManager == null){
            orderManager = new OrderManager();
        }
        return orderManager;
    }
    
    public void addOrder(IOrdenable ordenable){
        this.ordenableList.add(ordenable);
        setChanged();
        notifyObservers(this);
        //counter++;
        //notifyObservers(this.ordenableList);
        //notifyObservers();
    };
    
    public void removeOrder(IOrdenable ordenable){
        this.printInvoice(this.ordenableList.indexOf(ordenable));
        this.ordenableList.remove(ordenable);
        setChanged();
        notifyObservers(this);
        //notifyObservers(this.ordenableList);
        //notifyObservers();
    };
    
    public void removeOrder(int lineOrdenable){
        
        this.printInvoice(lineOrdenable);
        this.ordenableList.remove(lineOrdenable);
        setChanged();
        notifyObservers(this);
        //notifyObservers(this.ordenableList);
        //notifyObservers();
    };
    
    public ArrayList<IOrdenable> getOrdenableList() {
        return this.ordenableList;
    }

    public void setOrdenableList(ArrayList<IOrdenable> ordenableList) {
        this.ordenableList = ordenableList;
    }
    
    public void printInvoice(int line) {
        Calendar currentDate = Calendar.getInstance(); //Get the current date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss"); //format it as per your requirement
        String dateNow = formatter.format(currentDate.getTime());
        try {
            PrintWriter writer = new PrintWriter(".//Invoice "+dateNow+".txt", "UTF-8");
            writer.println("************* INVOICE *************");
            writer.println("No: "+this.ordenableList.get(line).getNumberOrder());
            writer.println("Client: "+this.ordenableList.get(line).getCliente());
            writer.println("\n List of Products: ");
            writer.println(this.ordenableList.get(line).getDescription());
            writer.println("==================================");
            writer.println("\n ===> TOTAL = "+this.ordenableList.get(line).getPrice());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static OrderManager getOrderManager() {
        return orderManager;
    }

    public static void setOrderManager(OrderManager orderManager) {
        OrderManager.orderManager = orderManager;
    }

    public int getCounter() {
        this.counter++;
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    

}
