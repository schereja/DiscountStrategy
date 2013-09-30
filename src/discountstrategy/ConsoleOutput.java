/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public final class ConsoleOutput extends OutputStrategy{
    private String data;
    private String INPUT_DATA_ERROR = "Please check your data from the receipt";
    /**
     * Constructor that gets the data from the receipt and outputs it to the console.
     * 
     * @param data 
     * @throws IllegalArgumentException if data invalid or less then 1 character
     */
    public ConsoleOutput(String data){
        if(data ==null || data.length() <1){
            throw new  IllegalArgumentException(INPUT_DATA_ERROR);
        } else {
            this.data = data;
            displayReceipt();
        }
    }
    /**
     * Displays the output from the receipt.
     * 
     */
    @Override
    public void displayReceipt() {
        System.out.println(data);
    }
    
}
