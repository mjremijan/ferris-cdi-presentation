package org.ferris.cdi.research.producer;

import javax.enterprise.inject.Produces;
import org.ferris.cdi.shared.shoppingcart.ShoppingCartService;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ShoppingCartServiceProducer {

    @Produces
    public ShoppingCartService produceShoppingCartService(
        ShoppingCartErrorHandler err, ShoppingCartProcessHandler proc
    ) {
        return new ShoppingCartService(err,proc);
    }
}
