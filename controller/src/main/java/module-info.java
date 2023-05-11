module controller {
    requires spring.boot;
    requires lombok;
    requires spring.web;
    requires spring.context;
    requires org.mapstruct;

    exports com.globant.controllers to application;
    exports com.globant.models to application;

    requires domain;

}