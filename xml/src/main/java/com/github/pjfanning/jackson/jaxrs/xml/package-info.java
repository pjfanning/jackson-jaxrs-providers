/**
 * Jackson-based JAX-RS provider that can automatically
 * serialize and deserialize resources for 
 * XML content type (MediaType).
 *<p>
 * Also continues supporting functionality, such as
 * exception mappers that can simplify handling of
 * error conditions.
 *<p>
 * There are two default provider classes:
 *<ul>
 * <li>{@link com.github.pjfanning.jackson.jaxrs.xml.JacksonXMLProvider} is the basic
 *    provider configured to use Jackson annotations
 *  </li>
 * <li>{@link com.github.pjfanning.jackson.jaxrs.xml.JacksonJaxbXMLProvider} is extension
 *    of the basic provider, configured to additionally use JAXB annotations,
 *    in addition to (or in addition of, if so configured) Jackson annotations.
 *  </li>
 * </ul>
 */
package com.github.pjfanning.jackson.jaxrs.xml;
