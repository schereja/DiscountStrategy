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
    /**
     * Gets the total for the receipt
     * 
     * @return gets the total from receipt
     */
    public abstract double getTotal();
    /**
     * gets the receipt
     * 
     * @return 
     */
    public String getReceipt();
    /**
     * Adds items to the receipt based on ID and qty.
     * 
     * @param productId
     * @param qty 
     */
    public abstract void addItem(String productId, int qty);
}
