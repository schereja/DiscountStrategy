/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

/**
 *
 * @author schereja
 */
public class ProductDatabase {
    private ProductInformation product;
    
    private ProductInformation[] products = {
        new ClothingProduct("A1011", "Big Bang Shirt", "Shirt with Big Bang Theory on it.", 12.00, new LaborDayDiscount()),
        new ClothingProduct("A1011", "Shorts", "Adult Shorts", 25.00, new FlatRateDiscount()),
        new ClothingProduct("A1011", "Diamond Tie", "Tie with Diamonds", 10.00, new LaborDayDiscount()),
        new ClothingProduct("A1011", "Big Bang Shirt", "Shirt with Big Bang Theory on it,", 12.00, new FlatRateDiscount())
        };
}
