/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03_gra_santoscc;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SantosKids
 */
public class EX03_GRA_SantosCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Singer s1 = new Singer();
        Song song1 = new Song();
        s1.setName("Laufey");
        s1.setFavoriteSong(song1);
        song1.setTitle("From the Start");
        song1.setSinger("Laufey");
        song1.setAlbum("Bewitched");
        
        Singer s2 = new Singer();
        Song song2 = new Song();
        s2.setName("dodie");
        s2.setFavoriteSong(song2);
        song2.setTitle("She");
        song2.setSinger("dodie");
        song2.setAlbum("Human");
        
        System.out.println("singer 1: " + s1.getName() + "\nNo. of Performances: "
        + s1.getNoOfPerformances() + "\nEarnings: " + s1.getEarnings()
        + "\nFavorite Song\n    Title: " + s1.getFavoriteSong().getTitle()
        + "\n   Singer: " + s1.getFavoriteSong().getSinger() + "\n  Album: "
        + s1.getFavoriteSong().getAlbum() + "\n---");
        
        System.out.println("singer 2: " + s2.getName() + "\nNo. of Performances: "
        + s2.getNoOfPerformances() + "\nEarnings: " + s2.getEarnings()
        + "\nFavorite Song\n    Title: " + s2.getFavoriteSong().getTitle()
        + "\n   Singer: " + s2.getFavoriteSong().getSinger() + "\n  Album: "
        + s2.getFavoriteSong().getAlbum() + "\n------");
        
        s1.performForAudience(12);
        System.out.println(s1.getName() + " performed for an audience of 12.\n\n"
        + "No. of Performances: " + s1.getNoOfPerformances() + "\nEarnings: "
        + s1.getEarnings() + "\nTotal Performances: " + Singer.getTotalPerformances()
        + "\n------");
        
        s1.performForAudience(s2, 20);
        System.out.println(s1.getName() + " collabed with " + s2.getName()
        + " and performed for an audience of 20.\n\n"
        + "No. of Performances: " + s1.getNoOfPerformances() + "\nEarnings: "
        + s1.getEarnings() + "\nTotal Performances: " + Singer.getTotalPerformances()
        + "\n------");
        
        Song song3 = new Song();
        song3.setTitle("Love to Keep Me Warm");
        song3.setSinger("Laufey & dodie");
        song3.setAlbum("N/A");
        
        s1.changeFavSong(song3);
        s2.changeFavSong(song3);
        
        System.out.println("singer 1: " + s1.getName() + "\nNo. of Performances: "
        + s1.getNoOfPerformances() + "\nEarnings: " + s1.getEarnings()
        + "\nFavorite Song\n    Title: " + s1.getFavoriteSong().getTitle()
        + "\n   Singer: " + s1.getFavoriteSong().getSinger() + "\n  Album: "
        + s1.getFavoriteSong().getAlbum() + "\n---");
        
        System.out.println("singer 2: " + s2.getName() + "\nNo. of Performances: "
        + s2.getNoOfPerformances() + "\nEarnings: " + s2.getEarnings()
        + "\nFavorite Song\n    Title: " + s2.getFavoriteSong().getTitle()
        + "\n   Singer: " + s2.getFavoriteSong().getSinger() + "\n  Album: "
        + s2.getFavoriteSong().getAlbum() + "\n------");
    }
    
}
