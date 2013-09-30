/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public final class ProductDatabase extends ProductStrategy implements DatabaseStrategy{
   private String productId;
    private String productName;
    private int MIN_NAME_LENGTH = 2;
    private String NAME_LENGTH_ERROR = "Please enter a product name longer then 2 characters";
    private String ID_LENGTH_ERROR = "Please enter an ID in the format of PXXXX.";
    public ProductDatabase(String productId){
        setId(productId);
    }
    private ProductStrategy[] products = {
        new ClothingProduct("P1011", "Shirt", "Big Bang", 12.00, new LaborDayDiscount(.05)),
        new ClothingProduct("P1012", "Shorts", "Adult shorts", 25.00, new FlatRateDiscount(.05)),
        new ClothingProduct("P1013", "Tie", "Diamonds", 10.00, new LaborDayDiscount(.05)),
        new ClothingProduct("P1014", "Show", "Nike Shoes", 12.00, new FlatRateDiscount(.05))
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
        if(id== null || id.length() != 5){
            throw new IllegalArgumentException(ID_LENGTH_ERROR);
        }else this.productId = id;
    }
    /********
     * Sets the name of the product
     * ******
     * @param name 
     */
    @Override
    public void setName(String name) {
        if(name == null || name.length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException(NAME_LENGTH_ERROR);
        } else this.productName = name;
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
