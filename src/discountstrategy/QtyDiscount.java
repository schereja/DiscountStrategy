/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class QtyDiscount extends DiscountStrategy{
    private double discountRate = .05;
    public QtyDiscount(int qty, double unitPrice){
        setQty(qty);
        setProductPrice(unitPrice);
        
    }
}
