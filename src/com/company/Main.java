package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        //File myFile = new File("word.txt");
        //System.out.println("Attempting to read from file in: "+myFile.getCanonicalPath());
        //try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("words.txt")))) {
            Bohr bohr = new Bohr();
            bohr.run();

            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("possibleWords.txt")))) {
                String[] a = new String[27]; //words that are nearby on the keyboard near the symbol;
                    a[0] = "qwsxz";
                    a[1] = "vghn";
                    a[2] = "xdfv";
                    a[3] = "xserfc";
                    a[4] = "wsdfr";
                    a[5] = "cdrtgv";
                    a[6] = "ftyhbv";
                    a[7] = "gyujnb";
                    a[8] = "ujklo";
                    a[9] = "uhnmki";
                    a[10] = "ijm,lo";
                    a[11] = "ik,.;po";
                    a[12] = "njkl,";
                    a[13] = "bhjm";
                    a[14] = "ikl;p";
                    a[15] = "ol;'[";
                    a[16] = "asw";
                    a[17] = "edfgt";
                    a[18] = "qazxcdw";
                    a[19] = "rfghy";
                    a[20] = "yhjki";
                    a[21] = "cfgb";
                    a[22] = "qasde";
                    a[23] = "zsdc";
                    a[24] = "tghju";
                    a[25] = "asx";
                    //System.out.println("kek");
                 for (int j = 0; j < word.length(); j++) {
                     for (int t = 0; t <  a[word.charAt(j) - 'a'].length(); t++) {
                         String s = word.substring(0, j) + a[word.charAt(j) - 'a'].charAt(t) + word.substring(j + 1);
                         //System.out.println(s);
                         if (bohr.contains(s)) {
                             System.out.println(s);
                         }
                     }
                 }
           // }
        } catch (FileNotFoundException e) {
            System.out.println("Dictionary file is not found!");
        } catch (IOException e) {
            System.out.println("Input Error");
        }

    }
}
