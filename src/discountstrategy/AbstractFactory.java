/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public abstract class AbstractFactory {
    public static enum Outputs {
        CONSOLE, GUI
    }
    
    public static OutputStrategy getOutputInstance(Outputs outputType){
        OutputStrategy out = OutputFactory.getInstance().getOutput(outputType);
        return out;
    }
}
