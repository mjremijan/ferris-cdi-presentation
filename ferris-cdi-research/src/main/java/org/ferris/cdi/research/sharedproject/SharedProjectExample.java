package org.ferris.cdi.research.sharedproject;

import javax.inject.Inject;
import org.ferris.cdi.shared.SharedService;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class SharedProjectExample {

    @Inject
    private SharedService sharedService;
    
    public void printName() {
        System.out.printf(
            ">>>> SharedService name = \"%s\"\n", sharedService.getName());
    }
}
