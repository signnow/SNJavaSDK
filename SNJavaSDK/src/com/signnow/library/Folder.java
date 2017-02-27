package com.signnow.library;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.signnow.config.Config;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Folder {
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
	static OkHttpClient client = new OkHttpClient();
	
    /// <summary>
    /// Gets a List of Folders
    /// </summary>
    /// <param name="accessToken"></param>
    /// <returns>JSONObject with details of the Folders, Document & Template Counts</returns>
	public static JSONObject List(String accessToken)
	{
		Request request = new Request.Builder()
		  .url(Config.apiHost +"folder")
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

    /// <summary>
    /// Get the folder and list of documents in the folder
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="folderId">ID of the Folder to Get</param>
    /// <param name="params">Option Filter and Sort By Params</param>
    /// <returns>JSONObject with List of documents in the folder.</returns>
	
	public static JSONObject Get(String accessToken,String folderId,String params)
	{
		 String qsParams = (params != "") ? "?" + params : "";
		Request request = new Request.Builder()
		  .url(Config.apiHost +"folder/" + folderId + qsParams)
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
