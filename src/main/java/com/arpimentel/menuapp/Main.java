package com.arpimentel.menuapp;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static GameLibary gameLibary = new GameLibary();


    //fonction qui return une chaine de caracteres
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    //fonction qui return un entier
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    //Construteur de type input pour ajouter les caracteristiques d'un nouveau jeu
    public static void addNewGame() {
        System.out.print("Quel est le titre du jeu que vous souhaitez ajouter ? ");
        String title = inputString();
        System.out.print("Donner une description à ce jeu : ");
        String description = inputString();
        System.out.print("Prix du jeu : ");
        String price = inputString();
        System.out.print("Quel est le type du jeu : Action / Aventure / Stratégie / Puzzle ... ");
        String category = inputString();
        System.out.print("Quel public est visé pour ce jeu ? Tout Public / Adulte ");
        String targetAudence = inputString();
        System.out.print("Date de sortie du jeu : ");
        String releaseDate = inputString();
        int score = -1;
        gameLibary.createANewGame(title, description, score, price, category, targetAudence, releaseDate);
        System.out.println("Votre jeu a bien été ajouté à la bibliothèque !");
        System.out.println("");
    }


    //Méthode pour afficher le nombre total des jeux stocké dans la biblioteque
    public static void displayGameList() {
        int nbreDeJeux = gameLibary.getVideoList().size();
        if (nbreDeJeux > 0) {
            System.out.println("Il y a actuellement " + nbreDeJeux + " jeu(x) dans votre bibliothèque : ");
            System.out.println("");
            gameLibary.displayListGames();
        } else {
            System.out.println("Votre bibliothèque de jeux est vide ! Ajoutez des jeux !");
            System.out.println("");
        }
    }



    //Méthode pour donner un score a chaque jeu
    public static void rateAGame() {
        System.out.println("Quel est le titre du jeu que vous voulez noter ?");
        String jeuANoter = inputString();
        VideoGame jeuTrouve = gameLibary.searchGameByTitle(jeuANoter);
        if (jeuTrouve != null) {
            int score;
            do {
                System.out.println("Quel note donneriez-vous à ce jeu ? (entre 1 et 10)");
                score = inputInt();
                if (score < 0 || score > 10) {
                    System.out.println("La note doit être comprise entre 1 et 10 !");
                }
            } while (score < 0 || score > 10);
            jeuTrouve.setScore(score);
            System.out.println("La note de " + score + " a été ajoutée au jeu " + jeuTrouve.getTitle());
        } else {
            System.out.println("Aucun jeu ne correspond à ce titre dans votre bibliothèque !");
        }
    }



    //Méthode pour parcourir et trier tous les jeux de la bibliotheque selon leurs score
    public static void sortGames() {
        Collections.sort(gameLibary.getVideoList(), Collections.reverseOrder());
        for (VideoGame game : gameLibary.getVideoList()) {
            if (game.getScore() >= 0) {
                System.out.println(game.getTitle() + " : noté " + game.getScore());
            }
        }
    }

    //Menu switch avec fonctionnalites: ajouter un nouveau jeu, afficher la liste de jeux, noter un jeu et trier un jeu.
    public static void displayMenu() {
        boolean continuer = true;
        do {
            System.out.println("Sélectionnez l'action souhaitez-vous faire ? " +
                    "\n 1.Ajouter un nouveau jeu à votre bibliothèque" +
                    "\n 2.Afficher la liste de vos jeux" +
                    "\n 3.Noter un jeu de votre bibliothèque" +
                    "\n 4.Trier vos jeux par note" +
                    "\n 5.Quitter");
            String choix = inputString();
            switch (choix) {
                case "1":
                    addNewGame();
                    break;
                case "2":
                    displayGameList();
                    break;
                case "3":
                    rateAGame();
                    break;
                case "4":
                    sortGames();
                    break;
                case "5":
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix incorrect");
            }
        } while (continuer);

    }

    public static void main(String[] args) {
        displayMenu();
    }
}
