package org.ferris.cdi.research.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class LifecyleExample {

    @PostConstruct
    protected void postConstruct() {
        System.out.printf(">>>> LifeCycleExample Post Construct\n");
    }
    
    @PreDestroy
    protected void preDestory() {
        System.out.printf(">>>> LifeCycleExample Pre Destroy\n");
    }
}
