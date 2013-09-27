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
    private double totalSales;
    private double totalSalesAfterDiscount;
    private String BUSINESS_NAME="Kohls";
    private String BUSINESS_ADDRESS="5";
    private String drawLINE="___________________________________________________________________________________\n";
    public Receipt(String customerId){
        this.customer = new CustomerDatabase(customerId);
        lineItems = new LineItem[0];
        this.totalSales = 0.0;
    }
    @Override
    public double getTotal() {
        return totalSales;
    }

    @Override
    public String getReceipt() {
        StringBuilder invoiceOutput = new StringBuilder();
        invoiceOutput.append(BUSINESS_NAME).append("\n").append(BUSINESS_ADDRESS).append("\n").append(drawLINE);
        invoiceOutput.append("Thank you ").append(getCustomer(customerName)).append(" for shopping at ").append(BUSINESS_NAME).append("\n");
        invoiceOutput.append("ID\t Name\t\t     Description \t   Unit Price:\tQTY:\tPrice After Discount:\n");
        for(int i = 0; i <= lineItems.length - 1; i++){
            String prodID, prodName, prodDesc;
            double prodPrice, prodDiscountPrice;
            int prodQty;
            prodID = lineItems[i].getProductId();
            prodName = lineItems[i].getProductName(prodID);
            prodPrice = lineItems[i].getProductPrice(prodID);
            prodDesc = lineItems[i].getProductDescription(prodID);
            prodQty = lineItems[i].getQty();
            prodDiscountPrice = lineItems[i].getProductPriceAfterDiscount(prodID);
     
             invoiceOutput.append(prodID).append("  \t ").append(prodName).append(" \t  ").append(prodDesc).append(" \t  ").append(prodPrice).append("\t ").append(prodQty).append(" ").append(prodDiscountPrice).append("\n");
            this.totalSales += (prodPrice*prodQty);
            this.totalSalesAfterDiscount += prodDiscountPrice;
                    
        }
        invoiceOutput.append(drawLINE).append("\t\t\t\t\t\t\t\tTotal: ").append(getTotal());
        System.out.println(invoiceOutput);
        System.out.println("\t\t\t\t\t\t\t\tYou saved: " + (getTotal()-this.totalSalesAfterDiscount));
        System.out.println("\t\t\t\t\t\t\t\tTotal After Discount: " + totalSalesAfterDiscount);
       return invoiceOutput.toString();
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
