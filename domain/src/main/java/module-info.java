module domain {
    requires spring.boot;
    requires lombok;
    requires spring.web;
    requires spring.context;

    exports com.globant.domain;
    exports com.globant.ports;
    exports com.globant.services;
}