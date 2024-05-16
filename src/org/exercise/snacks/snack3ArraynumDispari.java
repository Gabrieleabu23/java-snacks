package org.exercise.snacks;

import java.util.Random;

public class snack3ArraynumDispari {
    public static void main(String[] args) {
        int numDispari =0;
        Random rand = new Random();
        int[] vetNumber = new int[rand.nextInt(5,30)];
        for (int i = 0; i <vetNumber.length ; i++) {
            vetNumber[i] = rand.nextInt(80);
            if(vetNumber[i] % 2 !=0){
                numDispari+=vetNumber[i];
            }
        }
        System.out.println("Somma di tutti i numeri dispari: "+numDispari);
    }
}
