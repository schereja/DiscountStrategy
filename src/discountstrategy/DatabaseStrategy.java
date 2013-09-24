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
  //Getters
  public abstract String getId();
  public abstract String getName(String id);
  //Setters
  public abstract void setId(String id);
  public abstract void setName(String name);
  //Method to remove based on ID
  public abstract void removeFromDatabase(String Id);
}
