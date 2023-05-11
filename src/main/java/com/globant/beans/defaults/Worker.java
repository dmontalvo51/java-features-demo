package com.globant.beans.defaults;

public interface Worker {

    default String work() {
        return "work done!";
    }
}
