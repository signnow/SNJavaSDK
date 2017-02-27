SignNow
===========
SignNow REST Service Wrapper

#### Updates

12/3/2015 - The eval server has been changed to api-eval.signnow.com. You will need to create a new account for api-eval.signnow.com. [https://eval.signnow.com](https://eval.signnow.com).

#### About SignNow
SignNow by Barracuda is an eSigning platform that offers a cloud version, a physical appliance and also a virtual appliance. Backed by Barracuda’s industry-leading security infrastructure, SignNow is fully compliant with eSigning laws and encrypts all data in transit. Users can share, manage and access their documents with confidence. It’s never been easier to get legally binding signatures from customers, partners, and employees - in seconds using any device.

#### API Contact Information
If you have questions about the SignNow API, please visit https://techlib.barracuda.com/SignNow/RestEndpointsAPI or email [api@signnow.com](mailto:api@signnow.com).

See additional contact information at the bottom.

Installation
==============
add SignNowSDK.jar file to your classpath.
Download SignNowSDK.jar from <path>

Examples
==========

To run the example.java you will need an API key. You can get one here [https://signnow.com/l/api/request_information](https://signnow.com/l/api/request_information). For a full list of accepted parameters, refer to the SignNow REST Endpoints API guide: [https://techlib.barracuda.com/SignNow/RestEndpointsAPI](https://techlib.barracuda.com/SignNow/RestEndpointsAPI).

set the below to the correct values.
```java
		 String accountUser = "accountEmailAddress";
         String accountPass = "password";
         String testEmailAddress = "testEmailAddress";
         String clientId= "clientId";
         String clientSecret="clientSecret";

         //Client ID, Client Secret, API URL
         Config.init("[YOUR CLIENT ID]", "[YOUR CLIENT SECRET]", "https://api-eval.cudasign.com/");
```		 

# User
```java
		LOGGER.info("================= Create User =================");
        String email ="demo2@demo7.com";
        String password="123456789";
        String firstName="John";
        String lastName= "Carter";
        
        JSONObject createUserObj = new JSONObject();
        createUserObj.put("email", email);
        createUserObj.put("password", password);
        createUserObj.put("first_name",firstName);
        createUserObj.put("last_name", lastName);
        JSONObject newAccountRes = User.Create(createUserObj,clientId,clientSecret);
    	 if(newAccountRes != null)
    	 {    	
    		 String id = (String)newAccountRes.get("id");
    		 LOGGER.info(" id is"+id);    	 
    	 }
    	 else
    	 {
    		 LOGGER.info("User Creation failed. Please check if already verification mail sent for the user...");
    	 }
```        

## Retrieve User Information
```java
		LOGGER.info("================= Retrieve User Info =================");
    	 JSONObject userInfo= User.Get(access_token);
         LOGGER.info("UserInfo is..."+userInfo);
```
# OAuth 2.0

## Request Access Token
```java
String grant_type= "password";
         String scope="*";
               
         JSONObject OAuthRes = OAuth2.requestToken(accountUser,accountPass,grant_type,scope);
         String access_token = "";
    	 String refresh_token = "";
    	 Long expires_in;
    	 
         if(OAuthRes != null)
         {
        	 access_token= (String)OAuthRes.get("access_token");
        	 refresh_token= (String)OAuthRes.get("refresh_token");
        	 expires_in= (Long)OAuthRes.get("expires_in");
        	 LOGGER.info("access_token ==> "+access_token);
        	 LOGGER.info("refresh_token ==> "+refresh_token); 
        	 LOGGER.info("expires_in ==> "+expires_in); 
         }
```
## Verify an Access Token
```java
 LOGGER.info("=================Verifying OAuth2 Token=================");
         JSONObject OAuthVRes = OAuth2.Verify(access_token);
    	if(OAuthVRes!= null)
    	{
			String verify_access_token = (String) OAuthVRes.get("access_token");			
			if(access_token.equals(verify_access_token))
			{
				LOGGER.info("verified...");
			}
			
		}      
```
# Document

## Retrieve a List of the User’s Documents

```java       
         JSONArray getAllDocumentsObj = Document.getAllUserDocuments(access_token);
         if(getAllDocumentsObj != null)
         {
        	 LOGGER.info("Get all User Documents Result :" + getAllDocumentsObj); 
         }   
```
## Retrieve a Document Resource

```java        
         JSONObject getDocumentObj = Document.get(access_token,documentId);
         if(getDocumentObj != null)
         {
        	 LOGGER.info("Get Document Result :" + getDocumentObj); 
         }
         
```
## Download a Collapsed Document

```java
         LOGGER.info("=================Downloading Document =================");
         InputStream downloadDocRes = Document.download(access_token, documentId); 
		 
		 // provide the path where the document to be downloaded with a name to it.
         String filePath = "C://TEST//sample.pdf";
         FileOutputStream fos = new FileOutputStream(new File(filePath));
         int inByte;
         while((inByte = downloadDocRes.read()) != -1)
              fos.write(inByte);
         downloadDocRes.close();
         fos.close();
         LOGGER.info("Document  downloaded");	
		 
```
## Delete Document
```java
LOGGER.info("================= Delete Document =================");
         JSONObject deleteDocRes = Document.Delete(access_token, docId);
         if(deleteDocRes != null) {
        	 String status =(String)deleteDocRes.get("status");
        	 LOGGER.info("Deleted Document ID :" + docId + "Deletion Status :"+  status);
		}
```		

## Upload Document

```java
         LOGGER.info("================= Creating New Document =================");
         boolean extra_fileds=false;
         String resultFormat= "JSON";

         File file = new File("1-tkt.pdf").getAbsoluteFile();
         String name= "1-tkt.pdf";
         String fileExtn="pdf";
         JSONObject newDocRes = Document.Create(access_token,file,name,extra_fileds,fileExtn);
         String documentId=null;
         if(newDocRes != null) {
			documentId=(String)newDocRes.get("id");
			LOGGER.info("New Document ID : "+ documentId);
		} 
		
```
## Upload File & Extract Fields

```java
         LOGGER.info("=================Creating New Document & Extracting Fields =================");
         File docFile = new File("Example Fields.docx").getAbsoluteFile();
         String docFileName= "Example Fields.docx";
         fileExtn="docx";
         
         JSONObject docRes = Document.Create(access_token,docFile,docFileName,true,fileExtn);
         String docId=null;
         if(docRes!=null) {
			docId=(String)docRes.get("id");
			LOGGER.info("New Document ID using Extract Fields:  "+ docId);
		} 
```
## Update Document (add fields)

```java         
         LOGGER.info("================= Adding Fields =================");
         JSONArray fields = new JSONArray();
         JSONObject fieldsObj = new JSONObject();
         fieldsObj.put("x", Integer.valueOf("10"));
         fieldsObj.put("y", Integer.valueOf("10"));
         fieldsObj.put("width", Integer.valueOf("122"));
         fieldsObj.put("height", Integer.valueOf("34"));
         fieldsObj.put("page_number", Integer.valueOf("0"));
         fieldsObj.put("role", "Buyer");
         fieldsObj.put("required","true");
         fieldsObj.put("type","signature");
         
         JSONObject fields1Obj = new JSONObject();
         fields1Obj.put("x", Integer.valueOf("40"));
         fields1Obj.put("y", Integer.valueOf("40"));
         fields1Obj.put("width", Integer.valueOf("122"));
         fields1Obj.put("height", Integer.valueOf("34"));
         fields1Obj.put("page_number", Integer.valueOf("0"));
         fields1Obj.put("role", "Seller");
         fields1Obj.put("required","true");
         fields1Obj.put("type","signature");
         
         fields.add(fieldsObj);
         fields.add(fields1Obj);
         
         JSONObject fobj = new JSONObject();
         fobj.put("fields", fields);
         LOGGER.info("Fields Object is : " + fobj.toJSONString());
         
         JSONObject fieldsRes = Document.Update(access_token,documentId,fobj);
         String fields_docId=null;
         if(fieldsRes != null) {
        	 fields_docId =(String)fieldsRes.get("id");
        	 LOGGER.info("After Adding the fileds, Document ID is :" + fields_docId);
		} 

```        
       

## Create Invite to Sign a Document

//Send Free Form Invite. Below are the two steps to perform this.
         
```java        
       //STEP 1: Create a New Document
         LOGGER.info("================= SendInvite =================");

         file = new File("pdf-sample.pdf").getAbsoluteFile();
         name= "pdf-sample.pdf";
         fileExtn="pdf";
         newDocRes = Document.Create(access_token,file,name,extra_fileds,fileExtn);
         String invite_document_Id=null;
         if(newDocRes != null) {
			invite_document_Id=(String)newDocRes.get("id");
			LOGGER.info("Invite Document ID : "+ invite_document_Id);
		} 
         
         //STEP 2:  Get the document id from STEP 1. Construct the invite object and send free form invite 
         
         LOGGER.info("Sending free form Invite");         
         JSONObject inviteDataObj = new JSONObject();
         inviteDataObj.put("from", accountUser);
         inviteDataObj.put("to", testEmailAddress);
         String inviteDataObjStr = inviteDataObj.toString();
         boolean disableEmail= false;
         JSONObject sendFreeFormInviteRes = Document.Invite(access_token, invite_document_Id, inviteDataObjStr,disableEmail);
         LOGGER.info("Invite Status: "+ sendFreeFormInviteRes);   
         // parse the response and show the invite id and status
         String invite_id=null;
         String status;
         if(sendFreeFormInviteRes != null) {
			invite_id=(String)sendFreeFormInviteRes.get("id");
			status=(String)sendFreeFormInviteRes.get("result");
			LOGGER.info("Freeform invite done : invite_id "+ invite_id+ " status :"+ status);
		}

```		

## Cancel an Invite to a Document

```java
         LOGGER.info("================= Canceling Invite =================");
         JSONObject cancelInviteRes = Document.CancelInvite(access_token, invite_id);         
         if(cancelInviteRes != null) {
 			status=(String)cancelInviteRes.get("result");
 			LOGGER.info("Cancel Invite Status: "+status);
 		} 
```		
## Create a One-time Use Download URL

```java
         LOGGER.info("================= Creating Download Link (Share)=================");
         JSONObject downloadLinkRes = Document.Share(access_token, documentId);
         String link;
         if(downloadLinkRes != null) {
  			link=(String)downloadLinkRes.get("link");
  			LOGGER.info("Download Link: "+link);
  		} 
```
## Merges Existing Documents

```java         
         LOGGER.info("================= Merging Existing Documents =================");
         JSONArray jsonArray = new JSONArray();
         jsonArray.add(documentId);
         jsonArray.add(invite_document_Id);
         JSONObject mergeDocObj = new JSONObject();
         mergeDocObj.put("name", "My-New-Merged-doc");
         mergeDocObj.put("document_ids", jsonArray);
         String mergeDocObjStr = mergeDocObj.toString();

         InputStream mergeDocsRes = Document.Merge(access_token, mergeDocObjStr);
         LOGGER.info("Merged Docs Result: "+ mergeDocsRes);
                       
         // provide the path where the document to be downloaded with a name to it.
         filePath = "C://TEST//";
         FileOutputStream fos1 = new FileOutputStream(new File(filePath+"merged.pdf"));
         inByte=0;
         while((inByte = mergeDocsRes.read()) != -1)
              fos1.write(inByte);
         mergeDocsRes.close();
         fos1.close();
         LOGGER.info("Merged Document downloaded at : " +filePath+"merged.pdf");		
```

## Get Document History

```java
         LOGGER.info("================= Retrieving Document History =================");
         JSONArray docHistoryRes = Document.History(access_token, documentId);
         if(docHistoryRes != null)
         {
         LOGGER.info("Document History:   "+ docHistoryRes.toString());
         }
```

# Template

## Create a Template

```java
         LOGGER.info("Create Template");
         JSONObject templObj = new JSONObject();
         templObj.put("document_id", documentId);
         templObj.put("document_name", "My New Template");
 		
         JSONObject newTemplateRes = Template.Create(access_token,templObj);
         
        if(newTemplateRes != null) {
   			String template_id=(String)newTemplateRes.get("id");
   			LOGGER.info("New Template ID:       "+template_id);
   		} 
```
## Duplicate a Template

```java
         LOGGER.info("================= Copy Template =================");
         JSONObject copyTemplobj = new JSONObject();
         copyTemplobj.put("document_name","My_Copy_Template_Doc");
 		
         JSONObject copyTemplateRes = Template.Copy(access_token, invite_document_Id,copyTemplobj);
         if(copyTemplateRes != null) {
    			String doc_id=(String)copyTemplateRes.get("id");
    			String doc_name=(String)copyTemplateRes.get("name");
    			LOGGER.info("New Doc ID: "+ doc_id +"  AND DocName:  "+doc_name);
    		}
```			
# Folder

## Returns a list of folders

```java
LOGGER.info("================= List Folder =================");

         //List Folders
         LOGGER.info("List Folders");
         JSONObject listFoldersRes = Folder.List(access_token);
         LOGGER.info("List Folders Results:       "+ listFoldersRes);
         String folderId=null;
         String doc_id=null;
         String doc_name= null;
         if(listFoldersRes != null) {
 			JSONArray folders = (JSONArray) listFoldersRes.get("folders");
 			JSONObject folderObj= (JSONObject)folders.get(0);
 			 doc_id = (String)folderObj.get("id");
 			 doc_name=(String)folderObj.get("name");
 			LOGGER.info("New Doc ID: "+ doc_id +"  AND DocName:  "+doc_name);
 		} 
```

## Returns a list of documents inside a folder

```java
         LOGGER.info("================= Get Folder =================");
         String params=""; // optional parameters        
         JSONObject getFolderRes = Folder.Get(access_token, doc_id,params);
         if(getFolderRes != null)
         {
        	 LOGGER.info(" Get Folder Results:       "+ getFolderRes);
         }

```
# Webhook

## Create a Webhook

Events  | Description
------------- | -------------
document.create  | Webhook is triggered when a document is uploaded to users account in SignNow
document.update  | Webhook is triggered when a document is updated (fields added, text added, signature added, etc.)
document.delete  | Webhook is triggered when a document is deleted from
invite.create  | Webhook is triggered when an invitation to a SignNow document is created.
invite.update  | Webhook is triggered when an invite to SignNow document is updated. Ex. A signer has signed the document.

```java
         LOGGER.info("================= Create Webhook =================");
 		JSONObject webHookobj = new JSONObject();
 		webHookobj.put("event", "document.create");
 		webHookobj.put("callback_url", "http://requestb.in/");
         
         JSONObject createWebhookRes = Webhook.Create(access_token,webHookobj);
         LOGGER.info("Webhook Created : Results:       "+ createWebhookRes);
         String subscriptionId=null;
         if(createWebhookRes != null) {
 			subscriptionId=(String)createWebhookRes.get("id");
 			LOGGER.info("Webhook Created : Subscription Id:       "+ subscriptionId);
 		} 
```
## List Webhook

 ```java
         LOGGER.info("================= List Webhooks =================");
         JSONObject listWebhooksRes = Webhook.List(access_token);
         if(listWebhooksRes != null)
         {
         LOGGER.info(" List Webhooks Results:       "+ listWebhooksRes);
         }
```	 
## Delete Webhook

```java
         LOGGER.info("================= Delete Webhooks =================");
         JSONObject deleteWebhookRes = Webhook.Delete(access_token, subscriptionId);
         if(deleteWebhookRes != null)
         {
         LOGGER.info(" Delete Webhooks Results:       "+ deleteWebhookRes);
         }
```
		 
# Link

```java

         LOGGER.info("=================Link =================");

         LOGGER.info("Create Signing Link");
 		JSONObject linkObj = new JSONObject();
 		linkObj.put("document_id", documentId);
 		
         JSONObject createLinkRes = Link.Create(access_token,linkObj);
         if(createLinkRes != null)
         {
         LOGGER.info("Results:       "+ createLinkRes);
         }
```		 
		 
# Document Groups

## Create

```java
JSONArray docGroupArray = new JSONArray();
         docGroupArray.add(documentId);
         docGroupArray.add(invite_document_Id);
         docGroupArray.add(fields_docId); // having a document with fields is mandatory for DocumentGroup
         JSONObject docGroupObj = new JSONObject();
         docGroupObj.put("document_ids", docGroupArray);
         docGroupObj.put("group_name", "MyDocumentGrpName");
         String docGroupObjStr = docGroupObj.toString();
         
         JSONObject createDocGroup = DocumentGroup.Create(access_token, docGroupObjStr);
         
         String docGroupId=null;
         if(createDocGroup != null) {
			docGroupId=(String)createDocGroup.get("id");
			LOGGER.info("Create Document Group Results:       "+ docGroupId);
		}
```
## Get Document Groups

```java
LOGGER.info("================= Get Document Group =================");
         JSONObject getDocGroup = DocumentGroup.Get(access_token, docGroupId);
         if(getDocGroup != null)
         {
         LOGGER.info("Get Document Group Results:       "+ getDocGroup);
         }
```
## Delete Document Group
```java
         LOGGER.info("================= Delete Document Group =================");
         JSONObject deleteDocGroup = DocumentGroup.Get(access_token, docGroupId);
         if(deleteDocGroup !=null)
         {
         LOGGER.info("Delete Document Group Results:       "+ deleteDocGroup);
         }

```
		 
## Group Invite
```java
         LOGGER.info("================= Invite Document Group =================");
         //build the invite model:
         JSONObject model = buildInviteGrpModel(accountUser,testEmailAddress,fields_docId,invite_document_Id);
         JSONObject inviteDocGroup = DocumentGroup.groupInvite(access_token, docGroupId,model);
         String group_invite_id=null;
         String group_id= null;
         String pending_invite_link= null;
         if(inviteDocGroup !=null)
         {
        	 pending_invite_link = (String)inviteDocGroup.get("pending_invite_link");
        	 URL url = new URL(pending_invite_link);
        	 Map map = splitQuery(url);        	 
        	 group_invite_id= (String)map.get("group_invite_id");
        	 group_id= (String)map.get("document_group_id");
        	 LOGGER.info("Invite Document Group Results:       Group Invite Id:  "+ group_invite_id +"    AND   Group ID:  "+group_id );
         }
```

## Get Group Invite

```java
         LOGGER.info("=================Get Invite : Document Group =================");
         JSONObject getInviteGroup = DocumentGroup.getInvite(access_token,group_id,group_invite_id);
         JSONObject inviteObj=null;
         JSONArray inviteStepsArr=null;
         JSONObject stepsObj=null;
         String stepId=null;
         JSONArray actionsArray;
         JSONObject actionsObj;
         String replace_doc_id = null;
         if(getInviteGroup !=null)
         {
        	 inviteObj = (JSONObject)getInviteGroup.get("invite");
        	 inviteStepsArr=(JSONArray)inviteObj.get("steps");
        	 stepsObj=(JSONObject)inviteStepsArr.get(0);
        	 stepId=(String)stepsObj.get("id");
        	 actionsArray = (JSONArray)stepsObj.get("actions");
        	 actionsObj= (JSONObject)actionsArray.get(0);
        	 replace_doc_id =(String)actionsObj.get("document_id");
        	 
        	 LOGGER.info("GET Invite Document Group Results:       "+ inviteObj);
        	 LOGGER.info("GET Invite Document Group Results:       "+ stepId);
        	 LOGGER.info("GET Invite Document Group Results:       "+ inviteDocGroup);
        	 LOGGER.info("GET Invite Document Group Results:       "+ replace_doc_id);
         }
```
## Cancel Group Invite

```java
         LOGGER.info("================= Cancel Invite : Document Group =================");         
         JSONObject cancelInviteGroup = DocumentGroup.cancelGroupInvite(access_token,group_id,group_invite_id);
         if(cancelInviteGroup !=null)
         {
        	 LOGGER.info("CANCEL Invite Document Group Results:       "+ cancelInviteGroup);
         }
```
##	Get Pending Invites

```java
         LOGGER.info("================= Pending Invites : Document Group =================");         
         JSONObject pendingInvites = DocumentGroup.getPendingInvites(access_token,group_id,group_invite_id);
         if(pendingInvites !=null)
         {
        	 LOGGER.info("Get Pending Invite Document Group Results:       "+ pendingInvites);
         }
```
## Resend Invites

 ```java
         LOGGER.info("================= Resend Invite : Document Group =================");         
         JSONObject resendInvite = DocumentGroup.resendInvite(access_token,group_id,group_invite_id);
         if(resendInvite !=null)
         {
        	 LOGGER.info("Resent Invite Document Group Results:       "+ resendInvite);
         }
```
## Replace Inviters

```java
         LOGGER.info("=================Replace Inviters : Document Group ================="); 
         JSONObject replaceModelObj = buildReplaceModel(replace_doc_id);
         JSONObject replaceInviters = DocumentGroup.replaceInviters(access_token,group_id,group_invite_id,stepId, replaceModelObj);
         if(replaceInviters !=null)
         {
        	 LOGGER.info("ReplaceInviters Document Group Results:       "+ replaceInviters);
         }
```	 

# Additional Contact Information

##### SUPPORT
To contact SignNow support, please email [support@signnow.com](mailto:support@signnow.com).

##### SALES
For pricing information, please call (800) 831-2050 or email [sales@signnow.com](mailto:sales@signnow.com).