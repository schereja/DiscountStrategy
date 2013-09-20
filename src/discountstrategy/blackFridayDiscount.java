/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class blackFridayDiscount implements DiscountStrategy{
    private double discountRate;
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountPercent) {
        
    }
    
}
