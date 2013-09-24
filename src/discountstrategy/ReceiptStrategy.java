/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public interface ReceiptStrategy {
    public abstract double getTotal();
    
    public String getReceipt();
    
    public abstract void addItem(String productId, int qty);
}
