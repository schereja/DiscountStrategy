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
    public double calculateProductPrice(String productId, double qty){
       product = new ProductDatabase(productId);
       System.out.println(product.getDiscountApplied(productId).getDiscountRate());
       return 2;
   
    }

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
    public void setDiscountRate(double discountPercent){
        
    }
}
