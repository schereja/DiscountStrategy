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
    private double discountRate;
    private double qty;
    private ProductDatabase product;
    private double productPriceAfterDiscount;
    
     /**
     * Calculates the product price after discount
     * 
     * 
     * @param productId
     * @param qty 
     */
    public abstract double getProductDiscountRate();
    public abstract double getProductDiscountAmt(double productPrice, int prodQty);
    public abstract void setDiscountRate(double discountRate);

    public double getProductPriceAfterDiscount() {
        return productPriceAfterDiscount;
    }

    public void setProductPriceAfterDiscount(double productPriceAfterDiscount) {
        this.productPriceAfterDiscount = productPriceAfterDiscount;
    }
    
    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
    
   
    public double getDiscountRate(){
    
        return discountRate;
    }
}
