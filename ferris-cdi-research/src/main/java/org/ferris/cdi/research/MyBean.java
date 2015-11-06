package org.ferris.cdi.research;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class MyBean {

    private String name;
    
    public MyBean() {
        name = "MyBean";
    }
    
    public String getName() {
        return name;        
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @PostConstruct
    public void post() {
        System.out.println("********* postConstruct ");
    }
    
    @PreDestroy
    public void pre() {
        System.out.println("********* preDestory ");
    }
}
