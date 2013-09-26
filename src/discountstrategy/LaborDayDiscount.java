/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class LaborDayDiscount extends DiscountStrategy{
      private double discountRate = 0.05;
    public LaborDayDiscount(double productPrice) {
        double priceAfterDiscount = productPrice - (productPrice* discountRate);
        setProductPrice(priceAfterDiscount);
    }
}
