package bab2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Muhammad Ramadhani K
 */
public class no1 {

    public static void main(String[] args) {
        try {
            String fromLocation = "G:/textforcopy.txt";
            String toLocation = "G:/resultcopy.txt";
            
            copyFileFrom(fromLocation, toLocation );
            
        } catch (IOException ex) {
            System.out.print("exception: " + ex);
        }
    }

    public static void copyFileFrom(String copyFromLoc, String copyToLoc) throws IOException {
        FileOutputStream file = new FileOutputStream(copyToLoc);
        FileInputStream fileFrom = new FileInputStream(copyFromLoc);
        
        
        int letter = fileFrom.read();
        
        while (letter != -1) {
            file.write((char) letter);
            letter = fileFrom.read();
        }
        
        System.out.println("Copy file from: " + copyFromLoc + " to " + copyToLoc);
        System.out.println("complete");
    }
}
