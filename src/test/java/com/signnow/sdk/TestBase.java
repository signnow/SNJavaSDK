package com.signnow.sdk;


import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;

public class TestBase {

    private ObjectMapper objectMapper;

    public TestBase() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Before
    public void before() {

    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
