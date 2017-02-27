package com.signnow.library;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import com.signnow.config.Config;

public class Template {
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
	static OkHttpClient client = new OkHttpClient();
	
    /// <summary>
    /// Create a Template by Flattening an Existing Document
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="templObj">JSONObject containing the document id, document name</param>
    /// <returns>JSONObject holding the ID of the new Template</returns>
	public static JSONObject Create(String accessToken,JSONObject templObj)
	{
		String json = templObj.toJSONString();		
		RequestBody body = RequestBody.create(JSON, json);
		
		Request request = new Request.Builder()
		  .url(Config.apiHost +"template")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .post(body)
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
	
    /// <summary>
    /// Create a New Document by Copying a Flattened Template
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId"></param>
    /// <param name="copyTemplobj"> holds the copy template name</param>
    /// <returns>JSONObject with New Document ID and Name</returns>
	public static JSONObject Copy(String accessToken,String documentId,JSONObject copyTemplobj)
	{
		String json = copyTemplobj.toJSONString();		
		RequestBody body = RequestBody.create(JSON, json);
		
		Request request = new Request.Builder()
		  .url(Config.apiHost +"template/" + documentId + "/copy")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .post(body)
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
