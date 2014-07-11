package com.signnow.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Bhanu on 7/12/2014.
 */
public class EmailSignature {

    ArrayList<HashMap> to;
    private String from;
    private String[] cc;
    private String subject;
    private String message;

   /* @JsonProperty("csrf_token")
    private String  csrfToken;
*/
    public ArrayList<HashMap> getTo() {
        return to;
    }

    public void setTo(ArrayList<HashMap> to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String[] getCc() {
        return cc;
    }

    public void setCc(String[] cc) {
        this.cc = cc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   /* public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }*/
}
