/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class ProductDatabase implements DatabaseStrategy{
    private String productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private DiscountStrategy discountapplied;
    
    public ProductDatabase(String productId){
        setId(productId);
    }
    private ProductInformation[] products = {
        new ClothingProduct("P1011", "Big Bang Shirt", "Shirt with Big Bang Theory on it.", 12.00, new LaborDayDiscount()),
        new ClothingProduct("P1012", "Shorts", "Adult Shorts", 25.00, new FlatRateDiscount()),
        new ClothingProduct("P1013", "Diamond Tie", "Tie with Diamonds", 10.00, new LaborDayDiscount()),
        new ClothingProduct("P1014", "Nike Shoes", "Nike Shoes", 12.00, new FlatRateDiscount())
        };
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
                prodName = products[i].getProductName();
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
