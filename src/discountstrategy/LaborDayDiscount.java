/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public final class LaborDayDiscount extends DiscountStrategy{
    private double discountRate = 0.05;
    private String DISCOUNT_RATE_ERROR = "Please enter a discount greater the or equal to 0";
         /*********
          * Constructor for discount.
          * *******
          * @param rate 
          */
    public LaborDayDiscount(double rate){
        setDiscountRate(rate);
    }
    /************
     * Gets the discount rate.
     * **********
     * @return discountRate
     */
    @Override
    public double getProductDiscountRate() {
        return discountRate;
    }
    /************
     * Gets the discount amount.
     * **********
     * 
     * 
     * @param productPrice
     * @param prodQty
     * @return productprice-(product*discountrate)*prodqty
     */
    @Override
    public double getProductDiscountAmt(double productPrice, int prodQty) {
        return (productPrice - (productPrice * discountRate))* prodQty;
    }
    /***********
     *Sets the discount rate and does validation 
     * *********
     * 
     * @param discountRate 
     */
    @Override
    public void setDiscountRate(double discountRate) {
     if(discountRate<0){
            throw new IllegalArgumentException(DISCOUNT_RATE_ERROR);
        } else this.discountRate = discountRate;
    }
   
}
