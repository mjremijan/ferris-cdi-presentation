package org.ferris.cdi.research.basicdi;

import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class AllInjectionExample {

    @Inject
    private PropertyInjectionExample pie;
    
    private ConstructionInjectionExample cie;
    private MethodInjectionExample imie;
    
    public void printAll() {
        System.out.printf(">>>> Printing All....\n");
        pie.printHello();
        cie.printHello();
        imie.printHello();
    }
    
    @Inject
    public AllInjectionExample(ConstructionInjectionExample cie) {
        this.cie = cie;
    }
    
    @Inject
    private void setInitializerMethodInjectionExample(MethodInjectionExample imie) {
        this.imie = imie;
    }
}
