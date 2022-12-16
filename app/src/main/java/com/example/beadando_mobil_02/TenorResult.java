package com.example.beadando_mobil_02;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TenorResult {
    public long id;
    public String title;
    public boolean hasaudio;
    public int shares;

    @SerializedName("url")
    public String pageUrl;

    @SerializedName("media")
    public List<TenorMedia> mediaList;
}
