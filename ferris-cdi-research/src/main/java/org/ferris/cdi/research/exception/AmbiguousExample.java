package org.ferris.cdi.research.exception;

import javax.enterprise.inject.Vetoed;
import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
@Vetoed
public class AmbiguousExample {
    @Inject
    private AmbiguousService service;
}
