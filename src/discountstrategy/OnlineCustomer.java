/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class OnlineCustomer implements CustomerInformation{
    private String customerId;
    private String customerName;
    
    public OnlineCustomer(String customerId, String customerName){
        setCustomerId(customerId);
        setCustomerName(customerName);
    }
    @Override
    public void setCustomerId(String customerId) {
       this.customerId = customerId;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCustomerId() {
        return customerId;
    }
    
}
