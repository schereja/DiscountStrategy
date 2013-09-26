/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class LineItem extends ProductStrategy{ 
    private ProductDatabase product;
    private String productID;
    private String productName;
    private String productDescription;
    private int qty;
    private double productPrice;
     private double productPriceAfterDiscount;
 
    public LineItem(String productId, int qty){
        setProductId(productId);
        setQty(qty);
        product = new ProductDatabase(productId);
    }

    public double getProductPriceAfterDiscount(String productID) {
       this.productPriceAfterDiscount = product.calculateProductPrice(productID, productPrice);
       return productPriceAfterDiscount;
    }



    @Override
    public String getProductName(String productID) {
        this.productName = product.getName(productID);
        
        //if (productID == product.getProductName(productID)){
        //    System.out.println("help");
       // }
        return productName;
    }
    @Override
    public String getProductDescription(String productID) {
        this.productName = product.getProductDescription(productID);
        
        //if (productID == product.getProductName(productID)){
        //    System.out.println("help");
       // }
        return productName;
    }
    @Override
    public double getProductPrice(String productID){
        this.productPrice = product.getProductPrice(productID);
        return productPrice;
                
        
    }
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
   
}
