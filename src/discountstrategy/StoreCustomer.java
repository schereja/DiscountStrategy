/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class StoreCustomer extends CustomerStrategy{
    /**
     * Constructor to make sure an ID and name is set
     * 
     * @param customerId
     * @param customerName 
     */
     public StoreCustomer(String customerId, String customerName){
        setCustomerId(customerId);
        setCustomerName(customerName);
    }
}
