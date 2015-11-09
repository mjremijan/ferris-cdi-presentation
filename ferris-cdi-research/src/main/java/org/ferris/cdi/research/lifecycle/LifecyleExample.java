package org.ferris.cdi.research.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
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
