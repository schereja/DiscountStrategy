/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class QtyDiscount extends DiscountStrategy{
    private double discountRate = .05;
    public QtyDiscount(int qty, double unitPrice){
        setQty(qty);
        setProductPrice(unitPrice);
        
    }

    @Override
    public double getProductDiscountRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getProductDiscountAmt(double productPrice, int prodQty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDiscountRate(double discountRate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
