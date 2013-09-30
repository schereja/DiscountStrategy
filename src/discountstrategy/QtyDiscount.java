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
    private String DISCOUNT_RATE_ERROR = "Please enter a rate between 0 and 1";
    private int MIN_QTY;
    public QtyDiscount(int qty, double unitPrice){
        setQty(qty);
        setProductPrice(unitPrice);
        
    }
    /**
     * Gives the discount rate.
     * 
     * @return discountRate
     */
    @Override
    public double getProductDiscountRate() {
        return discountRate;
    }
    /**
     * Returns discount if above MIN_QTY.
     * 
     * @param productPrice
     * @param prodQty
     * @return productPrice (Depends if above MIN_QTY)
     */
    @Override
    public double getProductDiscountAmt(double productPrice, int prodQty) {
        if(prodQty >=MIN_QTY){
            return (productPrice - (productPrice * discountRate))* prodQty;
        } else return productPrice;
    }
    /**
     * Sets the discount rate
     * 
     * @param discountRate
     * @throws IllegalArgumentException
     */
    @Override
    public void setDiscountRate(double discountRate) {
        if(discountRate < 0 || discountRate > 1){
            throw new IllegalArgumentException(DISCOUNT_RATE_ERROR);
        } else this.discountRate = discountRate;
    }
}
