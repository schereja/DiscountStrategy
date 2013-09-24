/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class ClothingProduct implements ProductStrategy{
    private double productPrice;
    private String productDescription;
    private String productName;
    private String productId;
    private DiscountStrategy discountStrategy;
    public ClothingProduct(String productId, String productName, 
            String productDescription, double productPrice, DiscountStrategy 
                    discountApplied
            ){
        setProductId(productId);
        setProductName(productName);
        setProductDescription(productDescription);
        setProductPrice(productPrice);
        setProductDiscount(discountApplied);
               
    }
    @Override
    public void setProductPrice(double productPrice) {
        //Need to add in validation
       this.productPrice = productPrice;
    }

    @Override
    public void setProductDescription(String productDescription) {
        //Need to add in validation
        this.productDescription = productDescription;
    }

    @Override
    public void setProductName(String productName) {
               //Need to add in validation
        this.productName = productName;
    }
    @Override
    public void setProductId(String productId){
        this.productId = productId;
    }
    @Override
    public void setProductDiscount(DiscountStrategy discountApplied){
        this.discountStrategy = discountApplied;
    }
    @Override
    public DiscountStrategy getProductDiscount() {
        return discountStrategy;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String getProductDescription() {
        return productDescription;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public double calculateProductPrice(double qty) {
        return discountStrategy.calculateProductDiscount(productPrice)* qty;
    }
    
}
