package com.signnow.sdk;

import org.apache.commons.codec.binary.Base64;

public class Config {
    private Config() {
    }

    public static String getApiBase() {
        // TODO needs to be configurable
        return "https://capi-eval.signnow.com/api";
    }

    public static String getClientId() {
        // TODO needs to be configurable
        return "0fccdbc73581ca0f9bf8c379e6a96813";
    }

    public static String getClientSecret() {
        // TODO needs to be configurable
        return "3719a124bcfc03c534d4f5c05b5a196b";
    }

    public static String getBase64EncodedClientCredentials() {
        String idAndSecret = Config.getClientId() + ":" + Config.getClientSecret();
        byte[] encodedCredentials = Base64.encodeBase64(idAndSecret.getBytes());
        return new String(encodedCredentials);
    }
}
