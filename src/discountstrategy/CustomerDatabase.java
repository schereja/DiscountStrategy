/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public final class CustomerDatabase implements DatabaseStrategy,CustomerInformation{
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
        System.out.println(customerId);
       
        String custName = null;
        for(int i =0;i<customers.length; i++){
            if (customerId.equals(customers[i].getCustomerId())){
                custName = customers[i].getCustomerName();
            } 
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

    @Override
    public void setCustomerId(String customerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCustomerName(String customerName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCustomerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCustomerId() {
        String id = null;
    for(int i= 1;i<customers.length; i++){
        id = customers[i].getCustomerId();
        }
    return id;
    }
    
}
