/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public interface DiscountStrategy {
 
    public abstract double calculateProductDiscount(double price);
    public double getDiscountRate();
    public void setDiscountRate(double discountPercent);
}
