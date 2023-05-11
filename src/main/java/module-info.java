
module java17.classes {
    requires lombok;
    requires org.slf4j;

    exports com.globant.beans.records;
    exports com.globant.examples.java8 to java17.tests;

    opens com.globant.beans.records;

}
