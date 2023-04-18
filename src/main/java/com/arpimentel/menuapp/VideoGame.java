package com.arpimentel.menuapp;

public class VideoGame implements Comparable<VideoGame> {

    //    declaration de variables (caracteristiques d'un jeu de video))
    private String title;
    private String description;
    private int score;
    private String price;
    private String category;
    private String targetAudience;
    private String releaseDate;
    public VideoGame() {

    }

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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setPrice(int score) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(VideoGame videoGame) {
        return Integer.compare(this.score, videoGame.getScore());
    }
}
