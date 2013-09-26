/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public abstract class DiscountStrategy{
    
    private double productPrice;
    private double discountRate;
    private double qty;
    private ProductDatabase product;
    
     /**
     * Calculates the product price after discount
     * 
     * 
     * @param productId
     * @param qty 
     */
    public double calculateProductPrice(String productId, double qty){
       product = new ProductDatabase(productId);
        System.out.println(product.getProductDiscount(productId).getDiscountRate());
       
       
       return 0.0;
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
