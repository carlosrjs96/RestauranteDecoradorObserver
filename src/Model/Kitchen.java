/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author Carlos
 */
public class Kitchen  extends Observable implements Observer{
    private OrderManager orderManager; 
    private ArrayList<IOrdenable> ordenableList; 

    public Kitchen(OrderManager _orderManager) {
        orderManager= _orderManager;
        ordenableList=_orderManager.getOrdenableList();
    }
    /*@Override
    public void update(Observable o, Object _ordenableList) {
        this.ordenableList = (ArrayList<IOrdenable>)_ordenableList;
        System.out.println("ordenableList : Kitchen  Actualizado Size="+this.ordenableList.size());
        //System.out.println("Actualizado");
    }*/
    
    @Override
    public void update(Observable o, Object _orderManager) {
        this.orderManager = (OrderManager)_orderManager;
        this.ordenableList= this.orderManager.getOrdenableList();
        System.out.println("ordenableList : Kitchen  Actualizado Size="+this.orderManager.getOrdenableList().size());
        //System.out.println("Actualizado");
        setChanged();
        notifyObservers();
    }
       
    
    public ArrayList<IOrdenable> getOrdenableList() {
        return ordenableList;
    }

    public void setOrdenableList(ArrayList<IOrdenable> ordenableList) {
        this.ordenableList = ordenableList;
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }
    
    
}
