package org.ferris.cdi.research.producer;

import javax.inject.Inject;
import org.ferris.cdi.shared.shoppingcart.ShoppingCartService;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ShoppingCartServiceExample {

    @Inject
    private ShoppingCartService shoppingCartService;
    
    public void checkout() {
        shoppingCartService.placeOrder();
    }
}
