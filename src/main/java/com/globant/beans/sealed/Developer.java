package com.globant.beans.sealed;

/**
 * @author Diego Montalvo
 */


public abstract sealed class Developer permits BackendDev, FrontendDev {

    protected String language;

    public Developer(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    abstract String work();

}


