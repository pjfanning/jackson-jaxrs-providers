package com.github.pjfanning.jackson.jaxrs.yaml.jersey;

import com.github.pjfanning.jackson.jaxrs.yaml.dw.SimpleEndpointTestBase;

import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.Servlet;

public class SimpleEndpointTest extends SimpleEndpointTestBase {
    @Override
    protected Class<? extends Servlet> servletContainerClass() { return ServletContainer.class; }
}
