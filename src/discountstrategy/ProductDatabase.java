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
    
    private ProductInformation[] products = {
        new ClothingProduct("P1011", "Big Bang Shirt", "Shirt with Big Bang Theory on it.", 12.00, new LaborDayDiscount()),
        new ClothingProduct("P1012", "Shorts", "Adult Shorts", 25.00, new FlatRateDiscount()),
        new ClothingProduct("P1013", "Diamond Tie", "Tie with Diamonds", 10.00, new LaborDayDiscount()),
        new ClothingProduct("P1014", "Nike Shoes", "Nike Shoes", 12.00, new FlatRateDiscount())
        };

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFromDatabase(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
