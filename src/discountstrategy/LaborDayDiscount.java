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
      private double productPrice;
    public LaborDayDiscount(double productPrice){
        setProductPrice(productPrice);
    }
    public double getDiscountAmount(double price){
        return price * discountRate;
    }
      @Override
    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }
}
