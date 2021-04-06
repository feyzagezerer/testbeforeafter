/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazılımproje;

import java.beans.Statement;
import java.util.concurrent.TimeoutException;
import org.junit.rules.TestRule;
import org.junit.runner.Description;

/**
 *
 * @author feyza
 */
public class BenimKuralim implements TestRule {
    @Override
    public Statement apply(Statement base, Descripton description){
        return new Statement(){
            @Override
            public void evaluate() throws Throwable{
                long baslangic = System.currentTimeMillis();
                try{
                    base.evaluate();
                    
                }
                catch(Throwable th){
                    throw new TimeoutException("süre çok fazla");
                }
                finally{
                    long sure= (System.currentTimeMillis()-baslangic)/1000;
                    System.out.printf("performan test(0-100 hizlanma:&s saniye &n",sure);
                    if(sure>3) throw new TimeoutException("süre çok fazla");
                }
            }
        };
    }

    @Override
    public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement base, Description description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
