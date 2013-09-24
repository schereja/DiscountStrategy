/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class QtyDiscount implements DiscountStrategy{
    private double discountRate = .05;
    
    public QtyDiscount(int qty, double unitPrice){
        
    }
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountPercent) {
        
        this.discountRate = discountPercent/100;
    }

    @Override
    public double calculateProductDiscount(double price) {
      return price * discountRate;
    }
    
}
