package com.signnow.sdk.service;
import com.signnow.sdk.model.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Bhanu on 6/26/2014.
 *
 * This interface is used to perform to Document specific operations in the SignNow Application.
 */
public interface IDocumentService {

    /**
     * Posts a Document for a user in the SignNow system based on her OAuth2 bearer token.
     *
     * @param token
     * @return
     */
    Document create(Oauth2Token token, Document documentPath);

    InputStream mergeDocuments(Oauth2Token token, HashMap <String, List<String>> myMergeMap);

    Document getDocument(Oauth2Token token, String id);

    Document updateDocument(Oauth2Token token, HashMap<String,List<Fields>> f, String id);

    Document downLoadDocumentAsPDF(Oauth2Token token, String id);

    Document downLoadCollapsedDocument(Oauth2Token token, String id);

    String invite(Oauth2Token token, Invitation invitation, String id);

    //String notaryInvite(Oauth2Token token,Invitation invitation);

    String getDocumentHistory(Oauth2Token token, String id);

    Template createTemplate(Oauth2Token token, Template template);

    String createNewDocumentFromTemplate(Oauth2Token token, Template template);
}
