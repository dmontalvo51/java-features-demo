module infrastructure {
    requires spring.boot;
    requires lombok;
    requires spring.web;
    requires spring.context;
    requires org.mapstruct;
    requires spring.data.jpa;

    requires domain;
}