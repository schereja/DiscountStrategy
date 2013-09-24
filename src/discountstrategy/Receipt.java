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
    private ReceiptStrategy[] lineItems;
    private String customerName;
    
    public Receipt(String customerId){
        customer = new CustomerDatabase(customerId);
        System.out.println(customer.getName(customerId));
        lineItems = new LineItem[0];
        
    }
    @Override
    public double getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReceipt() {
       return "hello world";
    }

    @Override
    public final void addItem(String productId, int qty) {
        ReceiptStrategy newItem = new LineItem(productId, 2);
        ReceiptStrategy[] tempArray = new ReceiptStrategy[lineItems.length+ 1];
        for(int i = 0;i<lineItems.length; i++){
            tempArray[i] = lineItems[i];
        }
        tempArray[tempArray.length - 1] = newItem;
        
        lineItems = tempArray;
                
        
    }
    public String getCustomer(String customerId){
        this.customerName = customer.getName(customerId);
        return customer.getName(customerId);
    }
    
}
