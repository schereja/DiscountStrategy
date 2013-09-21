/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class FlatRateDiscount implements DiscountStrategy{
    private double discountRate = 0.05;
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountPercent) {
        
        this.discountRate = discountPercent/100;
    }
    
}
