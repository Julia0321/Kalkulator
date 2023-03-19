package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Menu: \n 1.dodawanie \n 2.odejmowanie \n 3.dzielenie \n 4. mnożenie.");
        BufferedReader konsola = new BufferedReader(new InputStreamReader(System.in));
        int wybor = Integer.parseInt(konsola.readLine());

    }

}
