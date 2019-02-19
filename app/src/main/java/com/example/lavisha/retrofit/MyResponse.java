package com.example.lavisha.retrofit;

import android.os.DeadObjectException;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyResponse {

    @SerializedName("result")
    @Expose
    private Boolean result;
    @SerializedName("is_registered")
    @Expose
    private Boolean isRegistered;
    @SerializedName("data")
    @Expose
    private Detail data;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public Detail getData() {
        return data;
    }

    public void setData(Detail data) {
        this.data = data;
    }
}
