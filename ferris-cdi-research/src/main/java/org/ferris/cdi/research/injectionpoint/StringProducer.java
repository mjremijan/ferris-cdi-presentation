package org.ferris.cdi.research.injectionpoint;

import java.io.FileInputStream;
import java.util.Properties;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class StringProducer {
    private Properties props;
    
    public StringProducer() throws Exception {
        props = new Properties();
        props.load(new FileInputStream("messages.properties"));
    }
    
    @Produces @Key
    public String produceString(InjectionPoint ip) {        
        Key m = ip.getAnnotated().getAnnotation(Key.class);
        return props.getProperty(m.value(), "-UNKNOWN-");
    }
}
