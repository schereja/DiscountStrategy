/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author schereja
 */
public class OutputFactory extends AbstractFactory{
    private static OutputFactory instance;
    
    private OutputFactory(){
    }
    
    public static OutputFactory getInstance(){
        if(instance ==null){
            instance = new OutputFactory();
        }
        return instance;
    }
    public OutputStrategy getOutput(AbstractFactory.Outputs readerType){
        OutputStrategy out = null;
        switch(readerType){
            case CONSOLE:
                out = new ConsoleOutput();
        }
        return out;
    }
}
