package org.ferris.cdi.research.producer;

import org.ferris.cdi.shared.shoppingcart.ShoppingCartProcessCallback;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ShoppingCartProcessHandler implements ShoppingCartProcessCallback {
    @Override
    public void performInventoryUpdate() {
        System.out.printf(">>>> performing inventory update\n");
    }
    
    @Override
    public void performBilling() {
        System.out.printf(">>>> performing billing\n");
    }
    
    @Override
    public void performConfirmation() {
        System.out.printf(">>>> performing confirmation\n");
    }

}
