package com.globant.beans.sealed;

/**
 * @author Diego Montalvo
 */


public interface DevService {

    default int getExtraIQ() {
        return 100;
    }

}


