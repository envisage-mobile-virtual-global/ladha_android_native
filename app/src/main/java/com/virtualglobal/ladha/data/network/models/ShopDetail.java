package com.virtualglobal.ladha.data.network.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ShopDetail {
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("featured_products")
    @Expose
    private List<Product> featuredProducts = new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Product> getFeaturedProducts() {
        return featuredProducts;
    }

    public void setFeaturedProducts(List<Product> featuredProducts) {
        this.featuredProducts = featuredProducts;
    }
}
