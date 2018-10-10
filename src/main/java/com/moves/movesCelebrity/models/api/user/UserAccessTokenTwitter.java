package com.moves.movesCelebrity.models.api.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAccessTokenTwitter implements Serializable {

    public static final String USER_ID = "userId";
    public static final String ACCESS_TOKEN = "accessToken";
    public static final String ACCESS_TOKEN_SECRET= "accessTokenSecret";

    @SerializedName(USER_ID)
    @JsonProperty(value = USER_ID)
    private String userId;

    @SerializedName(ACCESS_TOKEN)
    @JsonProperty(value = ACCESS_TOKEN)
    private String accessToken;

    @SerializedName(ACCESS_TOKEN_SECRET)
    @JsonProperty(value = ACCESS_TOKEN_SECRET)
    private String accessTokenSecret;

    public String getAccessTokenSecret() {
        return accessTokenSecret;
    }

    public void setAccessTokenSecret(String accessTokenSecret) {
        this.accessTokenSecret = accessTokenSecret;
    }
//private Date expiredAt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

//    public Date getExpiredAt() {
//        return expiredAt;
//    }
//
//    public void setExpiredAt(Date expiredAt) {
//        this.expiredAt = expiredAt;
//    }
}
