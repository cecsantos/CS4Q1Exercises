/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_gra_santoscc;

/**
 *
 * @author SantosKids
 */
public class EX02_GRA_SantosCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sibling josh = new Sibling("Joshua Santos", 24, 'm');
        Sibling bianx = new Sibling("Bianca Santos", 19, 'f');
        Sibling thea = new Sibling("Thea Santos", 17, 'f');
        
        Singer laufey = new Singer("Laufey", "From the Start", "Laufey", "Bewitched");
        System.out.println("SINGER 1\nName: " + laufey.name +
                "\nNo. of Performances: " + laufey.noOfPerformances +
                "\nEarnings: " + laufey.earnings + "\nFavorite Song: " +
                laufey.favoriteSong.title + "\n     Singer: " +
                laufey.favoriteSong.singer + "\n     Album : " +
                laufey.favoriteSong.album + "\n---");
        
        laufey.performForAudience(12);
        laufey.changeFavSong("Valentine", "Laufey", "Everything I Know About Love");
        System.out.println(laufey.name + " performed for an audience of 12\nNo. of Performances: " +
                laufey.noOfPerformances + "\nEarnings: " + laufey.earnings + "\nFavorite Song: " +
                laufey.favoriteSong.title + "\n     Singer: " +
                laufey.favoriteSong.singer + "\n     Album : " +
                laufey.favoriteSong.album + "\n---");
    }
}
