/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class OnlineCustomer extends CustomerInformation{
    private String customerId;
    private String customerName;
    
    public OnlineCustomer(String customerId, String customerName){
        setCustomerId(customerId);
        setCustomerName(customerName);
    }
  
    
    
}
