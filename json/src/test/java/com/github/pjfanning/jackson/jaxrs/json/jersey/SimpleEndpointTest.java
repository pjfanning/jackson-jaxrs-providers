package com.github.pjfanning.jackson.jaxrs.json.jersey;

import javax.servlet.Servlet;

import com.github.pjfanning.jackson.jaxrs.json.dw.SimpleEndpointTestBase;

import org.glassfish.jersey.servlet.ServletContainer;

public class SimpleEndpointTest extends SimpleEndpointTestBase {
    @Override
    protected Class<? extends Servlet> servletContainerClass() { return ServletContainer.class; }
}
