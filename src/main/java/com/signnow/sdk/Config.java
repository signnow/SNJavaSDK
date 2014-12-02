package com.signnow.sdk;

import org.apache.commons.codec.binary.Base64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Bhanu on 6/26/2014.
 *
 * This class is used to read the configuration parameters like, base endpointURL, clientID, clientSecret to access SignNow Application.
 */
public class Config {

    static String apiBase;
    static String clientId;
    static  String clientSecret;
    public Config(String apiBase, String clientId, String clientSecret) {

         this.apiBase=apiBase;
         this.clientId = clientId;
         this.clientSecret=clientSecret;
    }
    public static String getApiBase() {

        if(apiBase.equals("signnow.eval"))
        {
            return "https://capi-eval.signnow.com/api";
        }
        else if(apiBase.equals("signnow.public"))
        {
            return "https://api.signnow.com";
        }
        return apiBase;
    }

    public static String getClientId() {
            return clientId;
    }

    public static String getClientSecret() {
        return clientSecret;
    }

    public static String getBase64EncodedClientCredentials() {
        String idAndSecret = Config.getClientId() + ":" + Config.getClientSecret();
        byte[] encodedCredentials = Base64.encodeBase64(idAndSecret.getBytes());
        return new String(encodedCredentials);
    }

    public static void main(String args[]){

    }
}
