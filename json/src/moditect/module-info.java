// Originally generated using Moditect maven plugin, last mod 14-Oct-2020
module com.github.pjfanning.jackson.jaxrs.json {
    exports com.github.pjfanning.jackson.jaxrs.json;
    exports com.github.pjfanning.jackson.jaxrs.json.annotation;
    // 13-Nov-2019: [jaxrs-providers#119]: CXF, RESTEasy, OpenAPI require reflective access
    opens com.github.pjfanning.jackson.jaxrs.json;

    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.module.jaxb;

    requires com.github.pjfanning.jackson.jaxrs.base;

    //oracle location
    requires static javax.ws.rs.api;
    //oracle location
    requires static java.ws.rs;
    //jakarta initial location - 2.x
    requires static javax.ws.rs;
    //jakarta 3.x final location - https://github.com/jboss/jboss-jakarta-jaxrs-api_spec
    requires static jakarta.ws.rs;
    //jakarta 3.x final location - https://github.com/eclipse-ee4j/jaxrs-api
    requires static jakarta.ws.rs.api;

    provides javax.ws.rs.ext.MessageBodyReader with
        com.github.pjfanning.jackson.jaxrs.json.JacksonJsonProvider;
    provides javax.ws.rs.ext.MessageBodyWriter with
        com.github.pjfanning.jackson.jaxrs.json.JacksonJsonProvider;

    //gedmarc - move to custom for jakarta shade
/*
    provides jakarta.ws.rs.ext.MessageBodyReader with
            com.github.pjfanning.jackson.jaxrs.json.json.JacksonJsonProvider;
    provides jakarta.ws.rs.ext.MessageBodyWriter with
            com.github.pjfanning.jackson.jaxrs.json.json.JacksonJsonProvider;*/
}
