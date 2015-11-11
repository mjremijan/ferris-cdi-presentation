package org.ferris.cdi.research.interceptor;

import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ExceptionRetryExample {
    @Inject    
    protected Logger log;
    
    private static int cnt = 1;    
    
    @ExceptionRetry
    public void superImportant() {
        log.debug("Trying superImportant()...");
        if (cnt <= 3) {
            throw new RuntimeException(
                String.format("Super important failed on try #%d",cnt++));
        }
        cnt = 1;
        log.debug("SUCCESS!");
    }
    
    @ExceptionRetry
    public void lessImportant() {
        log.debug("Trying lessImportant()...");        
        throw new RuntimeException(
            String.format("Oops!"));
        
    }
}
