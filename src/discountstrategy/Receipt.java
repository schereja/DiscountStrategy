/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class Receipt implements ReceiptStrategy{
    private CustomerDatabase customer;
    private LineItem[] lineItems;
    private String customerName;
    public Receipt(String customerId){
        customer = new CustomerDatabase(customerId);
        System.out.println(customer.getName(customerId));
        
    }
    @Override
    public double getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReceipt() {
        System.out.println(lineItems[1]);
        return customerName;
    }

    @Override
    public void addItem(String productId, int qty) {
      ProductDatabase product =  new ProductDatabase(productId);
        lineItems[1].setProduct(product);
        
        
                
    }
    public String getCustomer(String customerId){
        this.customerName = customer.getName(customerId);
        return customer.getName(customerId);
    }
    
}
