package com.github.pfanning.jackson.jaxrs.smile.smile;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.github.pjfanning.jackson.jaxrs.smile.PackageVersion;
import com.github.pjfanning.jackson.jaxrs.smile.JacksonSmileProvider;

public class TestSmileVersions extends JaxrsTestBase
{
    public void testMapperVersions()
    {
        assertVersion(new JacksonSmileProvider());
    }

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private void assertVersion(Versioned vers)
    {
        final Version v = vers.version();
        assertFalse("Should find version information (got "+v+")", v.isUnknownVersion());
        Version exp = PackageVersion.VERSION;
        assertEquals(exp.toFullString(), v.toFullString());
        assertEquals(exp, v);
    }
}

