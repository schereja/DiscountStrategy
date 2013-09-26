/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public abstract class ProductStrategy {
    private ProductDatabase product;
    private String productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private double productPriceAfterDiscount;
    private DiscountStrategy discountAppled;
    
   
    /*********
     * Sets the product price to a different amount
     * *******
     * 
     * @param productPrice 
     * @throws Error when the price isn't valid and above 0
     */
    public void setProductPrice(double productPrice){
        if(productPrice > 1000 || productPrice < 0){
            throw new IllegalArgumentException("Please enter a valid product price.");
        }
        this.productPrice = productPrice;
    }
    /*********
     * Sets the product description
     * *******
     *
     * @param productDescription 
     * @throws Error when product description is not longer then 5 characters
     */
    public void setProductDescription(String productDescription){
        if(productDescription == null || productDescription.length() < 5){
            throw new IllegalArgumentException("Please enter a valid product "
                                                + "description longer "
                                                + "then 5 characters"); 
        }
        this.productDescription = productDescription;
    }
    /**********
     * Sets the product name
     * ********
     * 
     * @param productName 
     * @throws Error when product name is shorter then 3 characters
     */
    public void setProductName(String productName){
        if(productName == null || productName.length() < 3){
            throw new IllegalArgumentException("Please enter a valid product name longer then 3 characters.");
        }
        this.productName = productName;
    }
   /***********
    * Sets the product ID
    * *********
    * ToDo:  Add validation for only format of PXXXX
    * 
    * @param productId 
    * @throws Error when product id is less or greater then 4
    */
    public void setProductId(String productId){
        if(productId ==null){
            throw new IllegalArgumentException("Please enter a valid ID, use PXXXX as format.");
        }
            this.productId = productId;
    }
    /***********
     * Sets the product discount type
     * *********
     * 
     * @param discountApplied 
     * @throws Error when there is no discount applied, must be something even no discount
     */
    public void setProductDiscount(DiscountStrategy discountApplied){
        if(discountApplied == null){
            throw new IllegalArgumentException("Please enter a valid discount.");
        }
        this.discountAppled = discountApplied;
    }
    
 
    public DiscountStrategy getProductDiscount(String id){
        return discountAppled;
    }
    public double getProductPrice(String id){
        return productPrice;
        
    }
    public String getProductDescription(String id){
        return productDescription;
    }
   public String getProductName(String id) {
       return productName;
    }
    public String getProductId(){
        return productId;
        
    }
}
