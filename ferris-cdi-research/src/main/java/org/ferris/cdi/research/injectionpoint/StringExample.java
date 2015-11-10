package org.ferris.cdi.research.injectionpoint;

import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class StringExample {

    @Inject
    private Logger log;
    
    @Inject @Key("firstname.lbl")
    private String firstNameLbl;
    
    @Inject @Key("submit.btn")
    private String submitBtn;
    
    @Inject @Key("the last name")
    private String lastNameLbl;
    
    public void log() {
        log.debug(String.format("firstNameLbl=\"%s\"", firstNameLbl));
        log.debug(String.format("submitBtn=\"%s\"", submitBtn));
        log.debug(String.format("lastNameLbl=\"%s\"", lastNameLbl));
    }
}
