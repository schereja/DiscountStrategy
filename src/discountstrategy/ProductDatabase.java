/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class ProductDatabase extends ProductStrategy implements DatabaseStrategy{
    private String productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private double productPriceAfterdiscount;
    private DiscountStrategy discountapplied;
    
    public ProductDatabase(String productId){
        setId(productId);
    }
    private ProductStrategy[] products = {
        new ClothingProduct("P1011", "Big Bang Shirt", "Shirt with Big Bang Theory on it.", 12.00, new LaborDayDiscount(.05)),
        new ClothingProduct("P1012", "Shorts", "Adult Shorts", 25.00, new FlatRateDiscount(.05)),
        new ClothingProduct("P1013", "Diamond Tie", "Tie with Diamonds", 10.00, new LaborDayDiscount(.05)),
        new ClothingProduct("P1014", "Nike Shoes", "Nike Shoes", 12.00, new FlatRateDiscount(.05))
        };

    public DiscountStrategy getDiscountApplied(String id) {
        DiscountStrategy productDiscountApplied = null;
        
        for(int i = 0; i< products.length; i++){
            if (productId.equals(products[i].getProductId())){
                productDiscountApplied = products[i].getProductApplied(productId);
                
            }
        }
        return productDiscountApplied;
    }
    
    @Override
    public double getProductPrice(String id){
        double prodPrice = 0;
        for(int i = 0; i< products.length; i++){
            if (productId.equals(products[i].getProductId())){
                prodPrice = products[i].getProductPrice(id);
             
            }
        }
        return prodPrice;
    }
    @Override
    public String getProductDescription(String id){
        String prodDesc = null;
        for(int i = 0; i< products.length; i++){
            if (productId.equals(products[i].getProductId())){
                prodDesc = products[i].getProductDescription(id);
             
            }
        }
        return prodDesc;
    }
    
    /*********
     * Get the product ID that was set
     * *******
     * 
     * @return productID
     */
    @Override
    public String getId() {
        return this.productId;
    }
    /********
     * Gets the name of the product based on product ID
     * ******
     * @param id
     * @return prodName
     */
    @Override
    public String getName(String id) {
       String prodName = null;
        for(int i = 0; i< products.length; i++){
            if (productId.equals(products[i].getProductId())){
                prodName = products[i].getProductName(id);
            }
        }
        return prodName;
    }
    
    /********
     * Sets the ID of the product
     * ******
     * 
     * @param id 
     */
    @Override
    public void setId(String id) {
        this.productId = id;
    }
    /********
     * Sets the name of the product
     * ******
     * @param name 
     */
    @Override
    public void setName(String name) {
        this.productName = name;
    }
    /********
     * Remove product from database
     * ******
     * ToDo: Need to code way to remove from database
     * 
     * @param Id 
     * 
     */
    @Override
    public void removeFromDatabase(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
