/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author srini
 */
public class TestUserprofile {

    public static void main(String[] args) {
        Scanner indata = new Scanner(System.in);
        String id;
        int genre;
        String genreIn = " ";

        //Getting user ID
        System.out.println("Enter the User ID to register.");
        id = indata.nextLine();

        //Selecting the preffered genre
        System.out.println("Select yout favorite genre of movies:\n0: Comedy\n1: Drama\n2: Action\n3: Mystery");
        genre = indata.nextInt();
        switch (genre) {
            case 0:
                genreIn = "Comedy";
            case 1:
                genreIn = "Drama";
            case 2:
                genreIn = "Action";
            case 3:
                genreIn = "Mystery";
        }
        UserProfile user = new UserProfile(id, genreIn);
        System.out.println("Profile created !!");
    }
}
