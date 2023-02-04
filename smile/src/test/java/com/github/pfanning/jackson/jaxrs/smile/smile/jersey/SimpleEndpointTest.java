package com.github.pfanning.jackson.jaxrs.smile.smile.jersey;

import javax.servlet.Servlet;

import com.github.pfanning.jackson.jaxrs.smile.smile.dw.SimpleEndpointTestBase;

import org.glassfish.jersey.servlet.ServletContainer;

public class SimpleEndpointTest extends SimpleEndpointTestBase {
    @Override
    protected Class<? extends Servlet> servletContainerClass() { return ServletContainer.class; }
}
