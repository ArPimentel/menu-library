package com.arpimentel.menuapp;


import java.util.ArrayList;
import java.util.List;

public class GameLibary {


    //    Declaration de tableau vide pour stocker toute la liste des jeux
    private List<VideoGame> videoList = new ArrayList<>();



    //    Methode qui permet d’ajouter un jeu dans la bibliothèque.
    public void addGameToLibrary(VideoGame videoGame) {
        this.videoList.add(videoGame);
    }




    //Methode qui permet de creer un nouveau jeu
    public void createANewGame(String title, String description, int score, String price, String category, String targetAudience, String releaseDate) {
        VideoGame videoAdd = new VideoGame(title, description, score, price, category, targetAudience, releaseDate);
        addGameToLibrary(videoAdd);
    }



    //    Methode qui permet d’afficher la liste des jeux présent dans la bibliothèque.
    public void displayListGames() {
        for (VideoGame videoGame : videoList) {
            System.out.println(videoGame.getTitle());
            System.out.println("Description : " + videoGame.getDescription());
            System.out.println("Type : " + videoGame.getCategory() + " - Public cible : " + videoGame.getTargetAudience());
            System.out.println("Date de sortie : " + videoGame.getReleaseDate() + " - Prix : " + videoGame.getPrice());
            if (videoGame.getScore() >= 0) {
                System.out.println("Vous avez noté ce jeu : " + videoGame.getScore() + "/10");
            } else {
                System.out.println("Vous n'avez pas encore noté ce jeu !");
            }
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }



    //    Methode qui permet de chercher un jeu présent dans la bibliothèque.
    public VideoGame searchGameByTitle(String title) {
        for (int i = 0; i < videoList.size(); i++) {
            if (title.equals(videoList.get(i).getTitle())) {
                return videoList.get(i);
            }
        }
        return null;
    }


    public List<VideoGame> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<VideoGame> videoList) {
        this.videoList = videoList;
    }
}
