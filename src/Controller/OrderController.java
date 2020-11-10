/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AddFood;
import Model.FoodFactory;
import Model.IOrdenable;
import Model.MenuFood;
import Model.Order;
import Model.OrderManager;
import Model.RemoveFood;
import View.OrderView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class OrderController implements ActionListener{
    OrderManager orderManager;
    OrderView view;
    IOrdenable orden;
    FoodFactory factory;
    //OrderController(this.orderManager, pantalla){

    public OrderController(OrderManager orderManager, OrderView view) {
        this.orderManager = orderManager;
        this.view = view;
        this.factory = new FoodFactory();
        __init__();
        loadMenu();
        disableComponents();
    }
    
    public void __init__(){
        view.Combo1Btn.addActionListener(this);
        view.Combo2Btn.addActionListener(this);
        view.Combo3Btn.addActionListener(this);
        view.Combo4Btn.addActionListener(this);
        view.Combo5Btn.addActionListener(this);
        view.Combo6Btn.addActionListener(this);
        view.Combo7Btn.addActionListener(this);
        view.Combo8Btn.addActionListener(this);
        view.Combo9Btn.addActionListener(this);
        view.Combo10Btn.addActionListener(this);
        view.Side1Btn.addActionListener(this);
        view.Side2Btn.addActionListener(this);
        view.Side3Btn.addActionListener(this);
        view.Side4Btn.addActionListener(this);
        view.Side5Btn.addActionListener(this);
        view.Side6Btn.addActionListener(this);
        view.Side7Btn.addActionListener(this);
        view.Side8Btn.addActionListener(this);
        view.Side9Btn.addActionListener(this);
        view.Side10Btn.addActionListener(this);
        
        view.BtnCreateOrder1.addActionListener(this);
        view.BtnDeleteLine.addActionListener(this);
        view.BtnExit.addActionListener(this);
        view.BtnNewOrder.addActionListener(this);
    };
    
    public void loadMenu(){
        //String img = ".\\src\\Images\\h-mcdonalds-2-Cheeseburger-Extra-Value-Meals.jpg";
        //ImageIcon icon = new ImageIcon(".\\src\\Images\\h-mcdonalds-2-Cheeseburger-Extra-Value-Meals.jpg");
        //ImageIcon icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(70, 70, 0));
        //view.Combo1Btn.setIcon(icon);
        
        view.Combo1Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.CHEESEBURGEREXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo2Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.BIGMACEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo3Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.CHICKENMCNUGGETS10PIECEEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo4Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.DOUBLEQUARTERPOUNDERWITHCHEESEEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo5Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.EGGMCMUFFINEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo6Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.FILETOFISHEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo7Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.HAPPYBOX.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo8Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.PREMIUMCRISPYCHICKENCLASSICEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo9Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.QUARTERPOUNDERWITHCHEESEEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Combo10Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.SAUSAGEMCMUFFINWITHEGGEXTRAVALUEMEALS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        
        view.Side1Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.APPLESLICES.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side2Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.BAKEDHOTAPPLEPIE.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side3Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.BIGMAC.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side4Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.CHEESEBURGER.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side5Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.CHICKENMCNUGGETS4PC.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side6Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.CHOCOLATECHIPCOOKIE.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side7Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.CHOCOLATEMCCAFESHAKEMEDIUM.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side8Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.COCACOLACLASSICSMALL.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side9Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.DONUTSTICKS.getImage()).getImage().getScaledInstance(70, 70, 0)));
        view.Side10Btn.setIcon(new ImageIcon(new ImageIcon(MenuFood.VANILLAMCCAFESHAKEMEDIUM.getImage()).getImage().getScaledInstance(70, 70, 0)));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.BtnCreateOrder1)) {
            this.orderManager.addOrder(this.orden);
            view.TxtClientName.setText("");
            disableComponents();
        }else if (e.getSource().equals(view.BtnDeleteLine)) {
            try {
                int line = Integer.parseInt(view.lineTxt.getText());
                if(line >= 0 && line <= this.orden.getOrderList().size()-1){
                    orden = new RemoveFood(line, orden);
                    updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
                }else{
                   JOptionPane.showMessageDialog(this.view, "The number is out of range", "Warning",JOptionPane.WARNING_MESSAGE);
                }
                
            } catch (NumberFormatException nfe) {
               System.out.println( nfe);
               JOptionPane.showMessageDialog(this.view, "Only number", "Warning",JOptionPane.WARNING_MESSAGE);
            }
           
        }else if (e.getSource().equals(view.BtnExit)) {
           this.view.dispose();
        } else if (e.getSource().equals(view.BtnNewOrder)) {
            if (!"".equals(view.TxtClientName.getText())) {
                this.orden = new Order(this.orderManager.getCounter(), view.TxtClientName.getText());
                view.TextAreaOrderView.setText("");
                
                enableComponents();
            } else {
                JOptionPane.showMessageDialog(this.view, "Enter the customer's name", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } else if (e.getSource().equals(view.Combo1Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.CHEESEBURGEREXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo2Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.BIGMACEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo3Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.CHICKENMCNUGGETS10PIECEEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo4Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.DOUBLEQUARTERPOUNDERWITHCHEESEEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo5Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.EGGMCMUFFINEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo6Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.FILETOFISHEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo7Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.HAPPYBOX),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo8Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.PREMIUMCRISPYCHICKENCLASSICEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo9Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.QUARTERPOUNDERWITHCHEESEEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Combo10Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.SAUSAGEMCMUFFINWITHEGGEXTRAVALUEMEALS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side1Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.APPLESLICES),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side2Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.BAKEDHOTAPPLEPIE),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side3Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.BIGMAC),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side4Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.CHEESEBURGER),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side5Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.CHICKENMCNUGGETS4PC),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side6Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.CHOCOLATECHIPCOOKIE),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side7Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.CHOCOLATEMCCAFESHAKEMEDIUM),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side8Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.COCACOLACLASSICSMALL),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side9Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.DONUTSTICKS),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }else if (e.getSource().equals(view.Side10Btn)) {
           orden = new AddFood(factory.getInstance(MenuFood.VANILLAMCCAFESHAKEMEDIUM),orden);
           updateTextArea(orden.getDescription()+"\n ===> TOTAL = "+orden.getPrice()+"\n");
        }
        
    }
    
    public void updateTextArea(String text){
        view.TextAreaOrderView.setText("");
        view.TextAreaOrderView.setText(text);
    }
    
    public void disableComponents(){
        view.Combo1Btn.setEnabled(false);
        view.Combo2Btn.setEnabled(false);
        view.Combo3Btn.setEnabled(false);
        view.Combo4Btn.setEnabled(false);
        view.Combo5Btn.setEnabled(false);
        view.Combo6Btn.setEnabled(false);
        view.Combo7Btn.setEnabled(false);
        view.Combo8Btn.setEnabled(false);
        view.Combo9Btn.setEnabled(false);
        view.Combo10Btn.setEnabled(false);
        view.Side1Btn.setEnabled(false);
        view.Side2Btn.setEnabled(false);
        view.Side3Btn.setEnabled(false);
        view.Side4Btn.setEnabled(false);
        view.Side5Btn.setEnabled(false);
        view.Side6Btn.setEnabled(false);
        view.Side7Btn.setEnabled(false);
        view.Side8Btn.setEnabled(false);
        view.Side9Btn.setEnabled(false);
        view.Side10Btn.setEnabled(false);
        
        view.BtnCreateOrder1.setEnabled(false);
        view.BtnDeleteLine.setEnabled(false);
        view.TextAreaOrderView.setEnabled(false);
        view.lineTxt.setEnabled(false);
    }
    
    public void enableComponents(){
        view.Combo1Btn.setEnabled(true);
        view.Combo2Btn.setEnabled(true);
        view.Combo3Btn.setEnabled(true);
        view.Combo4Btn.setEnabled(true);
        view.Combo5Btn.setEnabled(true);
        view.Combo6Btn.setEnabled(true);
        view.Combo7Btn.setEnabled(true);
        view.Combo8Btn.setEnabled(true);
        view.Combo9Btn.setEnabled(true);
        view.Combo10Btn.setEnabled(true);
        view.Side1Btn.setEnabled(true);
        view.Side2Btn.setEnabled(true);
        view.Side3Btn.setEnabled(true);
        view.Side4Btn.setEnabled(true);
        view.Side5Btn.setEnabled(true);
        view.Side6Btn.setEnabled(true);
        view.Side7Btn.setEnabled(true);
        view.Side8Btn.setEnabled(true);
        view.Side9Btn.setEnabled(true);
        view.Side10Btn.setEnabled(true);
        
        view.BtnCreateOrder1.setEnabled(true);
        view.BtnDeleteLine.setEnabled(true);
        view.TextAreaOrderView.setEnabled(true);
        view.lineTxt.setEnabled(true);
    }

    private void Catch(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
