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
    private ProductStrategy product;
    private double totalSales;
    
    public Receipt(String customerId){
        customer = new CustomerDatabase(customerId);
        System.out.println(customer.getName(customerId));
        lineItems = new LineItem[0];
        totalSales = 0.0;
    }
    @Override
    public double getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReceipt() {
        String invoiceOutput = null;
        System.out.println("ID\t Name\t\t     Description \t\t    Unit Price:\tQTY:\tPrice After Discount:");
        for(int i = 0; i <= lineItems.length - 1; i++){
            String prodID, prodName, prodDesc;
            double prodPrice, prodDiscount;
            int prodQty;
            prodID = lineItems[i].getProductId();
            prodName = lineItems[i].getProductName(prodID);
            prodPrice = lineItems[i].getProductPrice(prodID);
            prodDesc = lineItems[i].getProductDescription(prodID);
            prodQty = lineItems[i].getQty();
            prodDiscount = lineItems[i].getProductPriceAfterDiscount(prodID);
     
            System.out.println(prodID + "  \t " + prodName + " \t  " + prodDesc + " \t  " + prodPrice + "\t " + prodQty + " " +prodDiscount);
            totalSales += prodPrice;
            
                    
        }
        System.out.println("\t\t\t\t\t\t\t\t" + totalSales);
       return invoiceOutput;
    }

    @Override
    public final void addItem(String productId, int qty) {
        LineItem newItem = new LineItem(productId, qty);
        LineItem[] tempArray = new LineItem[lineItems.length+ 1];
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
