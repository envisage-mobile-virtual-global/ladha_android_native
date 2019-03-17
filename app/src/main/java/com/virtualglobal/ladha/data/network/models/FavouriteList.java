package com.virtualglobal.ladha.data.network.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FavouriteList {
    @SerializedName("available")
    @Expose
    private List<Available> available = null;
    @SerializedName("un_available")
    @Expose
    private List<UnAvailable> unAvailable = null;

    public List<Available> getAvailable() {
        return available;
    }

    public void setAvailable(List<Available> available) {
        this.available = available;
    }

    public FavouriteList withAvailable(List<Available> available) {
        this.available = available;
        return this;
    }

    public List<UnAvailable> getUnAvailable() {
        return unAvailable;
    }

    public void setUnAvailable(List<UnAvailable> unAvailable) {
        this.unAvailable = unAvailable;
    }

    public FavouriteList withUnAvailable(List<UnAvailable> unAvailable) {
        this.unAvailable = unAvailable;
        return this;
    }

}
