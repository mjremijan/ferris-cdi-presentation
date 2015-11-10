package org.ferris.cdi.research;

import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ParameterizedTypeExample {

    @Inject
    private Logger log;
    
    @Inject
    private Service<Product> productService;
    
    @Inject
    private Service<Order> orderService;
    
    public void setProduct() {
        productService.set(new Product());
    }
    
    public void setOrder() {
        orderService.set(new Order());
    }
    
    public void print() {
        log.debug(productService.get());
        log.debug(orderService.get());
    }
}
