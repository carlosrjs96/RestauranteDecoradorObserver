/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.KitchenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;

/**
 *
 * @author Carlos
 */
public class KitchenController implements ActionListener ,Observer{
    OrderManager orderManager ;
    KitchenView view;
    Kitchen kitchen;
    
    KitchenController(OrderManager _orderManager,KitchenView view, Kitchen kitchen){
    this.orderManager= _orderManager;
    this.view = view;
    this.kitchen = kitchen;
    __init__();
    mostrarPedidos();
    }
    
    public void __init__(){
        this.view.btnFaturar.addActionListener(this);
        this.view.btnExit.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(view.btnFaturar)) {
                int num = this.view.jListOrdenes.getSelectedIndex();
                System.out.println("Linea :"+num);
                if(num>=0){
                    orderManager.removeOrder(num);
                }    
                    
                mostrarPedidos();
                //kitchen.getOrdenableList().remove(num);
                //this.view.jListOrdenes.remove(num);
        }
        if (e.getSource().equals(view.btnExit)) {
                this.view.dispose();
        }
    }
    
    public void mostrarPedidos() {
        DefaultListModel<String> model = new DefaultListModel<>();
        if (kitchen.getOrdenableList().size() > 0) {
            for (IOrdenable o : kitchen.getOrdenableList()) {
                String pedido = "No: " + o.getNumberOrder() + " Client: " + o.getCliente() + " ";
                for (Food f : o.getOrderList()) {
                    pedido += " **** PRODUCT:" + f.getName();
                }
                model.addElement(pedido);
            }
            this.view.jListOrdenes.setModel(model);
        }
        

        this.view.jListOrdenes.setModel(model);
    }

    @Override
    public void update(Observable o, Object arg) {
        mostrarPedidos();
    }
}
