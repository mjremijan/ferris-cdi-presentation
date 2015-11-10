package org.ferris.cdi.research.cdibasics;

import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
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
