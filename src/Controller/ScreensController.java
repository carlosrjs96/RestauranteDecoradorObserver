/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Kitchen;
import Model.OrderManager;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carlos
 */
public class ScreensController implements ActionListener{
    OrderManager orderManager;
    ScreensView view;
    Kitchen kitchen;
    public ScreensController(OrderManager _orderManager, ScreensView view) {
        this.orderManager = _orderManager;
        this.view = view;
        this.kitchen = new Kitchen(_orderManager);
        this.orderManager.addObserver(kitchen);
        __init__();
    }
    
    public void __init__(){
        view.btnKitchen.addActionListener(this);
        view.btnOrder.addActionListener(this);
    };
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.btnKitchen)) { 
            KitchenView pantalla = new KitchenView();
            KitchenController controlador = new KitchenController(this.orderManager, pantalla, this.kitchen);
            this.kitchen.addObserver(controlador);
            pantalla.setVisible(true);
        } else if (e.getSource().equals(view.btnOrder)) {
            OrderView pantalla = new OrderView();
            OrderController controlador = new OrderController(this.orderManager, pantalla);
            pantalla.setVisible(true);
        }
    }
}
