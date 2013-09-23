/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public interface DatabaseStrategy {
  public String getId();
  public String getName();
  public void setId(String id);
  public void setName(String name);
  public void addToDatabase(String productId, String productName, String productDescription, double productPrice, DiscountStrategy discount);
  public void removeFromDatabase();
}
