module application {
    requires domain;
    requires infrastructure;
    requires controller;

    requires spring.boot;
    requires spring.boot.starter;
    requires spring.boot.autoconfigure;

    opens com.globant;
    exports com.globant;

}