package com.signnow.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bhanu on 6/30/2014.
 */
public class Invitation {

    @JsonProperty("from")
    private String fromEmail;

    @JsonProperty("to")
    private String toEmail;

    @JsonProperty("originator_pay")
    private boolean boolOriginatorPay;

   /* //adding for notaryInvite
    @JsonProperty("document_id")
    private String documentId;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

  // end added for notary invite*/

    public boolean isBoolOriginatorPay() {
        return boolOriginatorPay;
    }

    public void setBoolOriginatorPay(boolean boolOriginatorPay) {
        this.boolOriginatorPay = boolOriginatorPay;
    }
    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

}
