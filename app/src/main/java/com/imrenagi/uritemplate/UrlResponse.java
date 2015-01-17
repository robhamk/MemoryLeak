package com.imrenagi.uritemplate;

import com.google.gson.annotations.SerializedName;

/**
 * Created by imrenagi on 16/01/15.
 */
public class UrlResponse  {

    private String id;
    private String url;
    private String expiration;

    @SerializedName("purchase_method")
    private String purchaseMethod;

    @SerializedName("valid_until")
    private String validUntil;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getPurchaseMethod() {
        return purchaseMethod;
    }

    public void setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }
}
