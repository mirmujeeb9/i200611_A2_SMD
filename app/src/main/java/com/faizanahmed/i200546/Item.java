package com.faizanahmed.i200546;

public class Item {
    private String itemName;
    private String hourlyRate;
    private String description;
    private String city;
    private String imageUrl;
    private String videoUrl;

    public Item(String itemName, String hourlyRate, String description, String city, String imageUrl, String videoUrl) {
        this.itemName = itemName;
        this.hourlyRate = hourlyRate;
        this.description = description;
        this.city = city;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
