/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class CashRegister {
  private double totalSales;
  private Receipt invoice;
  public CashRegister(){
      setTotalSales(0.00);
  }
  public void startNewSale(String customerId){
      invoice = new Receipt(customerId);
 
  }
  
  public void addNewLineItem(String productId, int qty){
      invoice.addItem(productId, qty);
      
  }
  
  public final void endSale(){
    
  }
  
  public final void printInvoice(){
      invoice.getReceipt();
      
  }
   public void setTotalSales(double totalSales){
       this.totalSales = totalSales;
   }
}
