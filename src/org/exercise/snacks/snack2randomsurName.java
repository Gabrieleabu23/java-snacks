package org.exercise.snacks;

import java.util.Random;
import java.util.Scanner;

public class snack2randomsurName {
    public static void main(String[] args) {
        String[] nomi = {"Jay", "Daisy", "Tom", "Jordan", "Myrtle", "Nick", "Meyer", "George"};
        String[] cognomi = {"Gatsby", "Buchanan", "Wilson", "Carraway", "Wolfsheim"};
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Caro proprietario di casa, quanti ospiti vuoi che vengano 'sorteggiati'? : ");
        int guests = Integer.parseInt(scanner.nextLine());

        System.out.printf(guests > 1?"Ecco i tuoi %d ospit/i\n" : "Ecco il tuo ospite\n",guests);
        if(guests>1) {
            for (int i = 0; i < guests; i++) {
                System.out.print("Nome:\t" + nomi[rand.nextInt(nomi.length)]+ "\n" );
                System.out.print("Cognome:\t" + cognomi[rand.nextInt(cognomi.length)]+ "\n");

            }
        }
        else{
            System.out.print("Nome:\t" + nomi[rand.nextInt(nomi.length)]+ "\n" );
            System.out.print("Cognome:\t" + cognomi[rand.nextInt(cognomi.length)]+ "\n");
        }
        System.out.println();
    }
}
