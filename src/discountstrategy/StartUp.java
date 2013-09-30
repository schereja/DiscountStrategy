/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;


/**
 *
 * @author schereja
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.startNewSale("C1014");
        
        
        cr.addNewLineItem("P1011", 2);
        cr.addNewLineItem("P1012", 3);
        cr.addNewLineItem("P1013", 5);
        cr.addNewLineItem("P1014", 10);
        cr.endSale();
        /*
        cr.printInvoice();*/
    }
}
