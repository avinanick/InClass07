/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass07;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nick
 */
public class Formater {
    public static void format(char startSep, char endSep, String file) {
        try {
            CSVReader reader = new CSVReader(new FileReader(file), startSep);
            String[] nextLine;
            while((nextLine = reader.readNext()) != null) {
                for(int i = 0; i < nextLine.length; i++) {
                    System.out.print(nextLine[i] + " " + ((i < nextLine.length - 1)? endSep : ""));
                }
                System.out.println();
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (IOException ioe) {
            
        }
    }    
}
