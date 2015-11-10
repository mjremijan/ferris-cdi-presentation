package org.ferris.cdi.shared.shoppingcart;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ShoppingCartService {
    private ShoppingCartErrorCallback errorCallback;
    private ShoppingCartProcessCallback processCallback;
    
    public ShoppingCartService(ShoppingCartErrorCallback errorCallback, ShoppingCartProcessCallback processCallback) {
        this.errorCallback = errorCallback;
        this.processCallback = processCallback;
    }
    
    public void placeOrder() {
        processCallback.performInventoryUpdate();
        processCallback.performBilling();
        processCallback.performConfirmation();
        errorCallback.error(new Exception("Confirmation failed."));
    }
}
