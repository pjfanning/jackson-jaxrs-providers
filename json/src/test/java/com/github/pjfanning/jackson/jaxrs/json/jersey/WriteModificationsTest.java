package com.github.pjfanning.jackson.jaxrs.json.jersey;

import javax.servlet.Servlet;

import com.github.pjfanning.jackson.jaxrs.json.dw.WriteModificationsTestBase;

import org.glassfish.jersey.servlet.ServletContainer;

public class WriteModificationsTest extends WriteModificationsTestBase {
    @Override
    protected Class<? extends Servlet> servletContainerClass() { return ServletContainer.class; }
}
