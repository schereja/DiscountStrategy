/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public abstract class CustomerStrategy {
    private String customerId;
    private String customerName;
    private String CUSTOMER_ID_ERROR = "Please enter a valid ID";
    private String CUSTOMER_NAME_ERROR = "Please enter a valid name";
    /**
     * Sets the customer ID
     * 
     * @param customerId 
     * @throws IllegalArgumentException
     */
    public void setCustomerId(String customerId) {
        if (customerId.length() != 5 || customerId != null){
            this.customerId = customerId;
        } else throw new IllegalArgumentException(CUSTOMER_ID_ERROR);
       
    }
    /**
     * Sets the customer name
     * 
     * 
     * @param customerName 
     * @throws IllegalArgumentException
     */
    public void setCustomerName(String customerName) {
        if (customerName != null || customerName.length() <2){
            this.customerName = customerName;
        } else throw new IllegalArgumentException(CUSTOMER_NAME_ERROR);
        
    }
    /**
     * Gets customer name 
     * 
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }
    /**
     * Gets customer ID
     * 
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }
}
