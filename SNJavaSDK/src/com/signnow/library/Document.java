package com.signnow.library;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.signnow.config.Config;

public class Document {
	private static final MediaType MEDIA_TYPE_PDF = MediaType.parse("application/pdf");
	private static final MediaType MEDIA_TYPE_DOCX = MediaType.parse("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
	private static final MediaType MEDIA_TYPE_PNG = MediaType.parse("image/png");
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
	private static  MediaType MEDIA_TYPE; 
	static OkHttpClient client = new OkHttpClient();
	
	/// <summary>
    /// Uploads a File and Creates a Document
    /// Accepted File Types: .doc, .docx, .pdf, .png
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="file">File object</param>
	/// <param name="fileName">Name of the file</param>
	/// <param name="extractFields">true or false, specifies to use fieldextract or just to post document</param>
    /// <param name="ExtractFields">If set TRUE the document will be checked for special field tags. If any exist they will be converted to fields.</param>
    /// <param name="fileExtn">file extn .doc, .pdf etc</param>
    /// <returns>JSON Object</returns>
	
	public static JSONObject Create(String accessToken,File file,String fileName, boolean extractFields,String fileExtn)
	{		
		String path =(extractFields) ? "document/fieldextract" : "document";
		if(fileExtn == "pdf")
		{
			MEDIA_TYPE=MEDIA_TYPE_PDF;
		}
		else if(fileExtn == "docx" || fileExtn == "doc")
		{
			MEDIA_TYPE=MEDIA_TYPE_DOCX;
		}
		else if(fileExtn == "png")
		{
			MEDIA_TYPE=MEDIA_TYPE_PNG;
		}
		RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("file", fileName, RequestBody.create(MEDIA_TYPE, file))
                .build();
		
		Request request = new Request.Builder()
		  .url(Config.apiHost +path)
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .post(requestBody)
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
    /// Get Document
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId"></param>
    /// <returns>Array of history for the document as a JSONArray object </returns>
	public static JSONObject get(String accessToken,String documentId)
	{
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/" + documentId)
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
    /// getAllUserDocuments
    /// </summary>
    /// <param name="accessToken"></param>
    /// <returns>Array of history for the document as a JSONArray object </returns>
	public static JSONArray getAllUserDocuments(String accessToken)
	{
		Request request = new Request.Builder()
		  .url(Config.apiHost +"user/documentsv2")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .get()
		  .build();		
		Response response;
		try {
			response = client.newCall(request).execute();
			JSONArray jsonObj=null;
			if(response.isSuccessful())
			{
				String str= response.body().string();
				JSONParser parser = new JSONParser();
				try {
					jsonObj = (JSONArray)parser.parse(str);
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
    /// Updates an Existing Document
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId">Document Id</param>
    /// <param name="fieldsObj">Data Object (ex. { fields,[{ x = 10, y = 10, width = 122... }] } </param>
    /// <returns>JSON Object</returns>
	public static JSONObject Update(String accessToken,String documentId, JSONObject fieldsObj)
	{
		String json= fieldsObj.toJSONString();
		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/" + documentId)
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .put(body)
		  .build();
		
		Response response;
		try {
			response = client.newCall(request).execute();
			JSONObject jsonObj=null;
			if(response.isSuccessful())
			{
				String str = response.body().string();
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
    /// Deletes an Existing Document
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId">Document Id</param>
    /// <returns> JSON Object, {"status":"success"}</returns>
	
	public static JSONObject Delete(String accessToken, String documentId)
	{
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/" + documentId)
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .delete()
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
    /// Downloads a Collapsed Document
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId">Document Id</param>
    /// <returns>returns the InputStream of the document </returns>
	public static InputStream download(String accessToken, String documentId)
	{
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/" + documentId + "/download?type=collapsed")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .get()
		  .build();		
		Response response;
		try {
			response = client.newCall(request).execute();
			if(response.isSuccessful())
			{
			return  response.body().byteStream();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
    /// <summary>
    /// Send a Role-based or Free Form Document Invite
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="invite_documentId"></param>
    /// <param name="inviteDataObjStr">Data Object </param>
    /// <param name="disableEmail">Disable the Notification Email</param>
    /// <returns> JSONObject {"result":"success"}</returns>
	
	public static JSONObject Invite(String accessToken, String invite_documentId, String inviteDataObjStr, boolean disableEmail)
	{
		String isDisableEmail = (disableEmail) ? "?email=disable" : "";
		RequestBody body = RequestBody.create(JSON, inviteDataObjStr);
		Request request = new Request.Builder()
		  .url(Config.apiHost +"/document/" + invite_documentId + "/invite" + isDisableEmail)
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
    /// Cancel Invite
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId"></param>
    /// <returns> returns JSONObject  {"status":"success"}</returns>
	public static JSONObject CancelInvite(String accessToken, String documentId)
	{		
		RequestBody body = RequestBody.create(JSON, "");		
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/" + documentId + "/fieldinvitecancel")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .addHeader("Content-Length", "0")
		  .put(body)
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
    /// Create a One-time Use Download URL
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId"></param>
    /// <returns>returns JSONObject . URL to download the document as a PDF</returns>
	
	public static JSONObject Share(String accessToken,String documentId)
	{
		JSONObject obj = new JSONObject();
		String json =obj.toString();
		RequestBody body = RequestBody.create(JSON, json);
		
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/" + documentId + "/download/link")
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
    /// Merges Existing Documents
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="mergedDocObjStr">merge document object </param>
    /// <returns> returns the input stream of the merged document.</returns>
	public static InputStream Merge(String accessToken, String mergedDocObjStr)
	{
		RequestBody body = RequestBody.create(JSON, mergedDocObjStr);		
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/merge")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .post(body)
		  .build();		
		Response response;
		try {
			response = client.newCall(request).execute();
			if(response.isSuccessful())
			{
			return  response.body().byteStream();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
    /// <summary>
    /// Get Document History
    /// </summary>
    /// <param name="accessToken"></param>
    /// <param name="documentId"></param>
    /// <returns>Array of history for the document as a JSONArray object </returns>
	public static JSONArray History(String accessToken,String documentId)
	{
		Request request = new Request.Builder()
		  .url(Config.apiHost +"document/" + documentId + "/history")
		  .addHeader("Accept", "application/json")
		  .addHeader("Authorization", "Bearer " + accessToken)
		  .get()
		  .build();		
		Response response;
		try {
			response = client.newCall(request).execute();
			JSONArray jsonObj=null;
			if(response.isSuccessful())
			{
				String str= response.body().string();
				JSONParser parser = new JSONParser();
				try {
					jsonObj = (JSONArray)parser.parse(str);
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
