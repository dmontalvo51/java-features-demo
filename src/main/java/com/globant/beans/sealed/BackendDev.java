package com.globant.beans.sealed;

/**
 * @author Diego Montalvo
 */
public sealed class BackendDev extends Developer implements DevService permits JavaDev{

    public BackendDev(String language) {
        super(language);
    }

    @Override
    String work() {
        return "backend work";
    }
}
