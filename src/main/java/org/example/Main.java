package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Menu: \n 1.dodawanie \n 2.odejmowanie \n 3.dzielenie \n 4. mnożenie.");
        BufferedReader konsola = new BufferedReader(new InputStreamReader(System.in));
        int wybor = Integer.parseInt(konsola.readLine());
             int liczba1 = Integer.parseInt(konsola.readLine());
        int liczba2 = Integer.parseInt(konsola.readLine());
        int wynik = 0;
        switch(wybor) {
            case 1:
                wynik = dodawanie(liczba1, liczba2);
                break;
            case 2:
                wynik = odejmowanie(liczba1, liczba2);
                break;
            case 3:
                wynik = dzielenie(liczba1, liczba2);
                break;
            case 4:
                wynik = mnożenie(liczba1, liczba2);
                break;
            default:
                System.out.println("Nie ma takiej metody");
                break;
        }
        System.out.println(wynik);
    }
    private static Integer mnożenie(int liczba1, int liczba2){
        return liczba1 * liczba2;
    }
    private static Integer dzielenie(int liczba1, int liczba2){
        if(liczba2 != 0) {
            return liczba1 / liczba2;
        }
        throw new NullPointerException();
    }
    private static Integer dodawanie(int liczba1, int liczba2){
        return liczba1 + liczba2;
    }
    private static Integer odejmowanie(int liczba1, int liczba2){
        return liczba1 - liczba2;
    }
}
