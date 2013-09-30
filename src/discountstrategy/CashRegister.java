/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public final class CashRegister {
  private Receipt invoice;
  /**
   * Basic Constructor, keeping in for later if adding more at later date.
   * 
   * 
   */
  public CashRegister(){
  }
  /********
   * Begins a new sale with a customer.
   * ******
   * @param customerId 
   */
  public void startNewSale(String customerId){
      invoice = new Receipt(customerId);
  }
  /********
   * Adds items to the line items
   * ******
   * 
   * @param productId
   * @param qty 
   */
  public void addNewLineItem(String productId, int qty){
      invoice.addItem(productId, qty);
      
  }
  /*********
   * Ends the sale and gets the receipt.
   * *******
   * 
   * 
   */
  public final void endSale(){
    invoice.getReceipt();
  }
}
