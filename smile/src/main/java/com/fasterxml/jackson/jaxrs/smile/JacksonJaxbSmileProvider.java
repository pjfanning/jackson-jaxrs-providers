package com.fasterxml.jackson.jaxrs.smile;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.cfg.Annotations;

/**
 * JSON content type provider automatically configured to use both Jackson
 * and JAXB annotations (in that order of priority). Otherwise functionally
 * same as {@link JacksonSmileProvider}.
 *<p>
 * Typical usage pattern is to just instantiate instance of this
 * provider for JAX-RS and use as is: this will use both Jackson and
 * JAXB annotations (with Jackson annotations having priority).
 *<p>
 * Note: class annotations are duplicated from super class, since it
 * is not clear whether JAX-RS implementations are required to
 * check settings of super-classes. It is important to keep annotations
 * in sync if changed.
 */
@Provider
@Consumes(SmileMediaTypes.APPLICATION_JACKSON_SMILE)
@Produces(SmileMediaTypes.APPLICATION_JACKSON_SMILE)
public class JacksonJaxbSmileProvider extends JacksonSmileProvider {
    /**
     * Default annotation sets to use, if not explicitly defined during
     * construction: use Jackson annotations if found; if not, use
     * JAXB annotations as fallback.
     */
    public final static Annotations[] DEFAULT_ANNOTATIONS = {
        Annotations.JACKSON, Annotations.JAXB
    };

    /**
     * Default constructor, usually used when provider is automatically
     * configured to be used with JAX-RS implementation.
     */
    public JacksonJaxbSmileProvider()
    {
        this(null, DEFAULT_ANNOTATIONS);
    }

    /**
     * @param annotationsToUse Annotation set(s) to use for configuring
     * data binding
     */
    public JacksonJaxbSmileProvider(Annotations... annotationsToUse)
    {
        this(null, annotationsToUse);
    }
    
    /**
     * Constructor to use when a custom mapper (usually components
     * like serializer/deserializer factories that have been configured)
     * is to be used.
     */
    public JacksonJaxbSmileProvider(ObjectMapper mapper, Annotations[] annotationsToUse)
    {
        super(mapper, annotationsToUse);
    }
}