package org.ferris.cdi.research.exception;

import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class UnsatisfiedExceptionExample {

    @Inject
    private MissingImplementation missingImplementation;
}
