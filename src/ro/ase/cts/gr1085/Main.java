package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        System.out.println("Tastati ceva: ");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String text = null;
        try {
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(text);
    }
}
