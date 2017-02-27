package com.signnow.library;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import com.signnow.config.Config;

public class User {
	
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
	
	static OkHttpClient client = new OkHttpClient();
	
    /// <summary>
    /// Creates a New User CudaSign Account
    /// </summary>
   ///<param name="createUserObj">this object holds the email,password,firstname,lastname fileds</param>
    /// <param name="clientId">client id used for the user</param>
    /// <param name="clientSecret">client secret of the user</param>
    /// <returns>JSONObject containing the ID of the new user account and verification status.</returns>
	public static JSONObject Create(JSONObject createUserObj,String clientId,String clientSecret)
	{
		String encodedClientCredentials = Config.encodedClientCredentials;
		if(clientId != null && clientSecret != null)
		{
			encodedClientCredentials = Config.encodeClientCredentials(clientId, clientSecret);
		}
        String json = createUserObj.toJSONString();
		RequestBody body = RequestBody.create(JSON, json);
		Request request=null;
		try 
		{
			String contentLength =String.valueOf(body.contentLength());		
			request = new Request.Builder()
			  .url(Config.apiHost +"user")
			  .addHeader("Accept", "application/json")
			  .addHeader("Authorization", "Basic " + Config.encodedClientCredentials)
			  .addHeader("Content-Length", String.valueOf(contentLength.getBytes().length))
			  .post(body)
			  .build();
		} 
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
	  Response response;
	  try
	  {
		response = client.newCall(request).execute();
		JSONObject jsonObj=null;
		if(response.isSuccessful())
		{
			String str= response.body().string();
			JSONParser parser = new JSONParser();
			try {
				jsonObj = (JSONObject)parser.parse(str);
				return jsonObj;
				}
			catch (ParseException e) {
				e.printStackTrace();
				}
		}
	}
	catch (IOException e)
	{ 
		e.printStackTrace();
	}
	  return  null;
	}

    /// <summary>
    /// Retrieves a User Account
    /// </summary>
    /// <param name="accessToken">User's Access Token</param>
    /// <returns>JSONObject holding the User Account Information</returns>
	public static JSONObject Get(String accessToken)
	{
		Request request = new Request.Builder()
		  .url(Config.apiHost +"user")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .get()
		  .build();
		
		Response response;
		try {
			response = client.newCall(request).execute();
			JSONObject jsonObj=null;
			if(response.isSuccessful())
			{
				String str= response.body().string();
				JSONParser parser = new JSONParser();
				try {
					jsonObj = (JSONObject)parser.parse(str);
					return jsonObj;
					}
				catch (ParseException e) {
					e.printStackTrace();
					}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
