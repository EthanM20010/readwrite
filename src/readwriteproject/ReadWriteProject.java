/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwriteproject;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author emendez
 */
public class ReadWriteProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    ArrayList Al = new ArrayList();
  
    try(BufferedReader br = new BufferedReader(new FileReader("/Users/emendez/Desktop/BoyNames.txt"))){
       StringBuilder fileContents = new StringBuilder();
       String Line = br.readLine();
       
       while(Line != null){
           fileContents.append(Line);
           fileContents.append(System.lineSeparator());
           Line = br.readLine();
       }
       String fileComplete = fileContents.toString();
        System.out.println(fileComplete);
    }   
    catch(IOException ioe){
        System.out.println("Not Readable"); 
        
    }
   
   }
    
}
