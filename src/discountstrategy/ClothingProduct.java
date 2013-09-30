/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class ClothingProduct extends ProductStrategy{
    /**
     * Used for a clothing product, later could add more that this would do.
     * 
     * @param productId
     * @param productName
     * @param productDescription
     * @param productPrice
     * @param discountApplied 
     */
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
    
    
}
