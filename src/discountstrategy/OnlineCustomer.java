/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class OnlineCustomer extends CustomerStrategy{
    
    public OnlineCustomer(String customerId, String customerName){
        setCustomerId(customerId);
        setCustomerName(customerName);
    }
}
