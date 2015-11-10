package org.ferris.cdi.research.producer;

import org.ferris.cdi.shared.shoppingcart.ShoppingCartErrorCallback;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ShoppingCartErrorHandler implements ShoppingCartErrorCallback {
    @Override
    public void error(Exception e) {
        e.printStackTrace();
    }
}
