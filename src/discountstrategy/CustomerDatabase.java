/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public final class CustomerDatabase implements DatabaseStrategy{
    private String customerName;
    private String customerId;
    private String GET_NAME_ERROR = "Please enter valid customer ID.";
     private CustomerInformation[] customers = {
        new OnlineCustomer("C1011", "Lynn"),
        new OnlineCustomer("C1012", "John"),
        new OnlineCustomer("C1013", "Jill"),
        new OnlineCustomer("C1014", "Jack")
        };
    public CustomerDatabase(String customerId){
        setId(customerId);
    }
    @Override
    public String getId() {
        return customerId;
    }

    @Override
    public String getName(String customerId) {
        String custName = null;
        for(int i =0;i<customers.length; i++){
            if (customers[i].getCustomerId() == null ? customerId == null : customers[i].getCustomerId().equals(customerId)){
                custName = customers[i].getCustomerName();
            }else return GET_NAME_ERROR;
        }
        return custName;
    }

    @Override
    public void setId(String id) {
        this.customerId = id;
    }

    @Override
    public void setName(String name) {
        this.customerName = name;
    }
    /**
     * 
     * 
     * Need to Implement a way to delete out of database
     * @param Id 
     */
    @Override
    public void removeFromDatabase(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
