/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class FlatRateDiscount extends DiscountStrategy{
         private double discountRate = 0.05;
    public FlatRateDiscount(double rate){
        setDiscountRate(rate);
    }

    @Override
    public double getProductDiscountRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getProductDiscountAmt(double productPrice, int prodQty) {
        return (productPrice - (productPrice * discountRate))* prodQty;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
   
    

}
