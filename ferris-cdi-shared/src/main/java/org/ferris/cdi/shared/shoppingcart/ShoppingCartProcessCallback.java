package org.ferris.cdi.shared.shoppingcart;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public interface ShoppingCartProcessCallback {    
    void performInventoryUpdate();
    void performBilling();
    void performConfirmation();
}
