package com.signnow.config;

import java.util.Base64;
import java.util.Base64.Encoder;


public class Config {

	public static String encodedClientCredentials="";
	public static String apiHost="";
	public static String client="";
	public static String secret="";
	
	
	 /// <summary>
    /// CudaSign Initialization
    /// </summary>
    /// <param name="Client">API Credentials - Client</param>
    /// <param name="Secret">API Credentials - Secret</param>
    /// <param name="ApiServer">API Server Path. Defaults to CudaSign EVALUATION if left blank.</param>
	
	public static void init(String client, String secret,String apiServer)
	{
		apiHost= (apiServer != "") ? apiServer : "https://api-eval.cudasign.com/";
		client=client;
		secret= secret;
        encodedClientCredentials = encodeClientCredentials(client, secret);
        System.out.println("Encoded credentials are " + encodedClientCredentials);
	}
	
	 public static String encodeClientCredentials(String client, String secret)
     {
         String idAndSecret = client + ":" + secret;
         Encoder encoder = Base64.getEncoder();
         String encodedString;
         encodedString =encoder.encodeToString(idAndSecret.getBytes());
         return encodedString;
     }
}
