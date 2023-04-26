package com.arpimentel.menuapp;

public class VideoGame implements Comparable<VideoGame> {

    private String title;
    private String description;
    private int score;
    private String price;
    private String category;
    private String targetAudience;
    private String releaseDate;

    public VideoGame(String title, String description, int score, String price, String category, String targetAudience, String releaseDate) {
        this.title = title;
        this.description = description;
        this.score = score;
        this.price = price;
        this.category = category;
        this.targetAudience = targetAudience;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public String getReleaseDate() {
        return releaseDate;
    }



    @Override
    public int compareTo(VideoGame videoGame) {
        return Integer.compare(this.score, videoGame.getScore());
    }
}
