/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class LineItem{ 
    private ProductDatabase product;
    public LineItem(String productId, String productName, double productPrice){
        
    }

    public ProductDatabase getProduct() {
        return product;
    }

    public void setProduct(ProductDatabase product) {
        this.product = product;
    }
    
    
}
