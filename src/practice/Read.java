package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {
  
  public static void main(String[] args) {
  
    try {

  File file = new File("road_not_taken.txt");

  BufferedReader br = new BufferedReader(new FileReader(file));

  String st;
  while ((st = br.readLine()) != null)
  System.out.println(st);
  
  


  br.close();
  
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
}


  }

