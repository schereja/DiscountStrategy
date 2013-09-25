/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class ClothingProduct extends ProductInformation{
    
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
