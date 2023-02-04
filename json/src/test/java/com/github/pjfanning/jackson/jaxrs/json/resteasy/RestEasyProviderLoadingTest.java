package com.github.pjfanning.jackson.jaxrs.json.resteasy;

import com.github.pjfanning.jackson.jaxrs.json.JaxrsTestBase;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider;

public class RestEasyProviderLoadingTest extends JaxrsTestBase
{
    public void testLoading() throws Exception
    {
        ResteasyJackson2Provider provider = new ResteasyJackson2Provider();
        assertNotNull(provider); // just to avoid compiler warning
    }
}
