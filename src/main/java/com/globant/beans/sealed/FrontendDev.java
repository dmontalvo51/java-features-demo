package com.globant.beans.sealed;

/**
 * @author Diego Montalvo
 */
public sealed class FrontendDev extends Developer implements DevService permits AndroidDev{

    public FrontendDev(String language) {
        super(language);
    }

    @Override
    String work() {
        return "Frontend work";
    }
}
