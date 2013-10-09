/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author schereja
 */
public class Receipt implements ReceiptStrategy{
    private String data;
    private Calendar calendar = Calendar.getInstance();
    private OutputStrategy outputInvoice = AbstractFactory.getOutputInstance(AbstractFactory.Outputs.CONSOLE);
    private String format = "M/d/yyyy hh:mm:ss a";
    private SimpleDateFormat formattedDate = new SimpleDateFormat(format);
    private CustomerDatabase customer;
    private LineItem[] lineItems;
    private String customerName;
    private double totalSales;
    private double totalSalesAfterDiscount;
    private String BUSINESS_NAME="Kohls";
    private String BUSINESS_ADDRESS="5555 w Main St\nGermantown, WI";
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
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        StringBuilder invoiceOutput = new StringBuilder();
        invoiceOutput.append(BUSINESS_NAME).append("\n").append(BUSINESS_ADDRESS).append("\n").append(drawLINE);
        invoiceOutput.append("Thank you ").append(getCustomer(customerName)).append(" for shopping at ").append(BUSINESS_NAME).append("\n").append(formattedDate.format(calendar.getTime())).append("\n");
        invoiceOutput.append(drawLINE);
        invoiceOutput.append("ID\tName\t\tDescription\tUnit Price:\tQTY:\tDiscount Price:\n");
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
            invoiceOutput.append(prodID).append("\t").append(prodName).append("\t\t").append(prodDesc).append("\t    ").append(nf.format(prodPrice)).append("\t ").append(prodQty).append("\t\t").append(nf.format(prodDiscountPrice)).append("\n");
            this.totalSales += (prodPrice*prodQty);
            this.totalSalesAfterDiscount += prodDiscountPrice;
                    
        }
        invoiceOutput.append(drawLINE).append("\t\t\t\t\t\t\tTotal:\t\t").append(nf.format(getTotal())).append("\n");
        invoiceOutput.append("\t\t\t\t\t\t\tYou saved:\t").append(nf.format(getTotal()-this.totalSalesAfterDiscount)).append("\n");
        invoiceOutput.append("\t\t\t\t\t\t\tTotal Due:\t").append(nf.format(totalSalesAfterDiscount));
        this.data = invoiceOutput.toString();
       return data;
    }

    @Override
    public final void addItem(String productId, int qty) {
        LineItem newItem = new LineItem(productId, qty);
        LineItem[] tempArray = new LineItem[lineItems.length+ 1];
        System.arraycopy(lineItems, 0, tempArray, 0, lineItems.length);
        tempArray[tempArray.length - 1] = newItem;
        
        lineItems = tempArray;
                  
    }
    public String getCustomer(String customerId){
        this.customerName = customer.getName(customerId);
        return customer.getName(customerId);
    }
    public void printReceipt(){
      outputInvoice.setData(data);
      outputInvoice.displayReceipt();
    }
    
}
