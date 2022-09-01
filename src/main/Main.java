package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("alphabet.txt");
        char symvol1 = 65;
        char symvol2 = 97;
        char symvol3 = 48;
        int j = symvol2;
        for (int i = symvol1; i < 91; i++) {
            fileWriter.write(i);
            if (j < 123) {
                fileWriter.write(j);
            }
            fileWriter.write(" ");
            j++;
        }
        fileWriter.write("\n");
        for (int i = symvol3; i < 58; i++) {
            fileWriter.write(i);
            fileWriter.write(" ");
        }
        fileWriter.close();
        FileReader fileReader = new FileReader("alphabet.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine() ) {
            System.out.println(scanner.nextLine() );
        }



    }
}