/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public interface CustomerInformation {
    //Setters for the customer
    public void setCustomerId(String customerId);
    public void setCustomerName(String customerName);
    
    //Getters for products
    public String getCustomerName();
    public String getCustomerId();
}
