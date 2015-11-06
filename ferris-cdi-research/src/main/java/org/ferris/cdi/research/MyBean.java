package org.ferris.cdi.research;

import javax.inject.Inject;
import org.ferris.cdi.shared.AccountService;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class MyBean {

    @Inject
    AccountService accountService;
    
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
    
    public String getAccountId() {
        return accountService.getAccountId();
    }
}
