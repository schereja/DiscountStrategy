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
    
    public CashRegister(){
        setTotalSales(0.0);
    }
    public void beginNewSale(){
        
        //Go to customer database to pass customer account number
        
        //create receipt from what bought
        
        //add LineItems to the receipt.
        
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
}
