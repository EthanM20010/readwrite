/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwriteproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.shape.Line;

/**
 *
 * @author emendez
 */
public class ReadWriteProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p = Paths.get("/Users/emendez/Desktop");
      Path p2 = Paths.get("BoyNames.txt");
      Path p3 = p.resolve(p2);
    ArrayList Al = new ArrayList();
  
    try(BufferedReader br = new BufferedReader(new FileReader("/Users/emendez/Desktop/BoyNames.txt"))){ 
     BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/emendez/Dropbox/ReadWriteProject/src/BoyList.txt"));
      StringBuilder fileContents = new StringBuilder();
       String Line = br.readLine();
       
       
       while(Line != null){
           Al.add(Line);
           fileContents.append(Line);
           fileContents.append(System.lineSeparator());
           Line = br.readLine();
           
           ;
       }
      Collections.sort(Al);
       //String fileComplete = fileContents.toString();
       System.out.println(Al);
       bw.write(Al.toString());
      bw.close();
    }   
    catch(IOException ioe){
        System.out.println("Not Readable"); 
        
    }
           
   }
    
}