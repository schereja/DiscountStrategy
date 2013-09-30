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
    private int qty;
    private double productPrice;
    private DiscountStrategy productDiscountAmount;
    private String QTY_ERROR = "Please enter a QTY.";
 /**
  * Constructor that takes a item id and a qty to create a line item
  * 
  * @param productId
  * @param qty
  * @throws IllegalArgumentException
  */
    public LineItem(String productId, int qty){
        setProductId(productId);
        setQty(qty);
        product = new ProductDatabase(productId);
    }
    /**
     * Gets the discount amount
     * 
     * 
     * @return 
     */
    @Override
    public double getProductPriceAfterDiscount(String productID) {
       productDiscountAmount = product.getDiscountApplied(productID);    
       return productDiscountAmount.getProductDiscountAmt(productPrice, qty);
    }
    /**
     * Get the product name
     * 
     * 
     * @param productID
     * @return productName
     */
    @Override
    public String getProductName(String productID) {
        this.productName = product.getName(productID);
        return productName;
    }
    /**
     * Gets product description
     * 
     * @param productID
     * @return productName
     */
    @Override
    public String getProductDescription(String productID) {
        this.productName = product.getProductDescription(productID);
        return productName;
    }
    /**
     * Gets product price
     * 
     * @param productID
     * @return productPrice
     */
    @Override
    public double getProductPrice(String productID){
        this.productPrice = product.getProductPrice(productID);
        return productPrice;
                
        
    }
    /**
     * Gets the qty from the input
     * 
     * @return qty
     */
    public int getQty() {
        return qty;
    }
    /**
     * Sets the qty for the line item
     * 
     * 
     * @param qty 
     * @throws IllegalArgumentException
     */
    public void setQty(int qty) {
        if(qty<0){
            throw new IllegalArgumentException(QTY_ERROR);
        } else this.qty = qty;
    }
   
}
