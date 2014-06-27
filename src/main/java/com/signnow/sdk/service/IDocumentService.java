package com.signnow.sdk.service;
import com.signnow.sdk.model.Document;
import com.signnow.sdk.model.Oauth2Token;

public interface IDocumentService {

    /**
     * Posts a Document for a user in the SignNow system based on her OAuth2 bearer token.
     *
     * @param token
     * @return
     */
    Document create (Oauth2Token token);

    Document getDocument(Oauth2Token token, String id);

    Document downLoadDocumentAsPDF(Oauth2Token token, String id);

    Document downLoadCollapsedDocument(Oauth2Token token, String id);
}
