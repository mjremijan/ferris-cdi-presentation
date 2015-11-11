package org.ferris.cdi.research.interceptor;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import org.apache.log4j.Logger;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
@ExceptionRetry
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class ExceptionRetryInterceptor {
    @Inject
    protected Logger log;

    @AroundInvoke
    public Object retryIfExceptionCaught(InvocationContext ctx) throws Exception {
        Exception caught = null;
        for (int i = 1, imax = 4; i <= imax; i++) {
            try {
                return ctx.proceed();
            } catch (Exception e) {
                caught = e;
                log.warn(String.format("Exception caught on attempt %d of %d", i, imax));
            }
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
            }            
        }
        log.fatal("All retry attempts failed.", caught);
        throw caught;
    }
}
