/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author SantosKids
 */
public class EX01_GRA_SantosCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1 = "Joshua Santos";
        int s1Age = 24;
        char s1Sex = 'm';
        String s2 = "Bianca Santos";
        int s2Age = 19;
        char s2Sex = 'f';
        String s3 = "Thea Santos";
        int s3Age = 17;
        char s3Sex = 'f';
        
        int tAge = s1Age + s2Age + s3Age; //operation: sum
        boolean s1OnlyM = !((s1Sex == s2Sex) && (s1Sex == s3Sex)); //operation: comparison
        boolean s2CloserAgeS1 = (s1Age - s2Age) < (s2Age - s3Age); //operation: difference & comparison
        
        System.out.println("Sibling 1\nName: " + s1 + "\nAge: " + s1Age + "\nSex: " + s1Sex + "\n");
        System.out.println("Sibling 2\nName: " + s2 + "\nAge: " + s2Age + "\nSex: " + s2Sex + "\n");
        System.out.println("Sibling 3\nName: " + s3 + "\nAge: " + s3Age + "\nSex: " + s3Sex + "\n");
        
        System.out.println("Total age of siblings: " + tAge);
        System.out.println(s1 + " is the only male sibling: " + s1OnlyM);
        System.out.println(s2 + " is closer in age to " + s1 + " than to " + s3 + ": " + s2CloserAgeS1);
    }
    
}
