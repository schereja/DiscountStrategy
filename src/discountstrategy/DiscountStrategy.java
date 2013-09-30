/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public abstract class DiscountStrategy extends ProductStrategy{
    
    private double productPrice;
    private double qty;
    private String QTY_ERROR = "Please enter a QTY above 0";
    private String PRODUCT_PRICE_ERROR = "Please enter a valid price above 0";
    public abstract double getProductDiscountRate();
    public abstract double getProductDiscountAmt(double productPrice, int prodQty);
    public abstract void setDiscountRate(double discountRate);
    /**
     * Sets the price of the product
     * 
     * @param productPrice
     * @throws IllegalArgumentException
     */
    @Override
    public void setProductPrice(double productPrice) {
        if(productPrice >= 0){
            this.productPrice = productPrice;
        } else throw new IllegalArgumentException(PRODUCT_PRICE_ERROR);
        
    }
    /**
     * Gets the qty of the item that was imputed.
     * 
     * 
     * @return qty
     */
    public double getQty() {
        return qty;
    }
    /**
     * Sets the qty of the item
     * 
     * @param qty 
     * @throws IllegalArgumentException
     */
    public void setQty(int qty) {
        if(qty > 0){
            this.qty = qty;
        } else throw new IllegalArgumentException(QTY_ERROR);
        
        
    }
    
   
}
