package com.signnow.sdk.service;
import com.signnow.sdk.model.Document;
import com.signnow.sdk.model.Invitation;
import com.signnow.sdk.model.Oauth2Token;
import com.signnow.sdk.model.Template;

public interface IDocumentService {

    /**
     * Posts a Document for a user in the SignNow system based on her OAuth2 bearer token.
     *
     * @param token
     * @return
     */
    Document create (Oauth2Token token);

    Document getDocument(Oauth2Token token, String id);

    Document updateDocument(Oauth2Token token, String id);

    Document downLoadDocumentAsPDF(Oauth2Token token, String id);

    Document downLoadCollapsedDocument(Oauth2Token token, String id);

    String invite(Oauth2Token token,Invitation invitation,String id);

    //String notaryInvite(Oauth2Token token,Invitation invitation);

    String getDocumentHistory(Oauth2Token token,String id);

    Template createTemplate(Oauth2Token token, Template template);

    String createNewDocumentFromTemplate(Oauth2Token token, Template template);

}
