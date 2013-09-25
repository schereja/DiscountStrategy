/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public interface ProductStrategy {
    
    public void calculateProductPrice(String productId, double qty);
    //Setters for the products
    public void setProductPrice(double productPrice);
    public void setProductDescription(String productDescription);
    public void setProductName(String productName);
    //This would not likely be used with a true database that would set the Id
    public void setProductId(String productId);
    public void setProductDiscount(DiscountStrategy discountApplied);
    
    //Getters for products
    public DiscountStrategy getProductDiscount();
    public double getProductPrice();
    public String getProductDescription();
    public String getProductName();
    public String getProductId();
}
