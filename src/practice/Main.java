package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
  
  public static void main(String[] args) throws IOException {
    String fileName = args[0];
    System.out.printf("Processing %s\n", fileName);

    // Open the file, read the first 100 lines print out each line
    // Close the file when done
    // If the file is less than 100 lines, close when done
    String line;
    FileReader fr = new FileReader(fileName);
    BufferedReader br = new BufferedReader(fr);

    Integer totalWords = 0;
    Map<String, Integer> wordMap = new HashMap<>();

    for (Integer i = 1; i <= 100; i++) {
        line = br.readLine();
        if (null == line)
            break;
        //System.out.printf("%d: %s\n", i, line.toUpperCase());
        String[] words = line.trim().split(" ");
        totalWords += words.length;
        for (String w: words) {
            Integer v = wordMap.getOrDefault(w, 0);
            v++;
            wordMap.put(w, v);
            // if (wordMap.containsKey(w)) {
            //     Integer v = wordMap.get(w) + 1;
            //     wordMap.put(w, v);
            // } else
            //     wordMap.put(w, 1);
        
        }
    }

    br.close();
    fr.close();

    Set<String> uniqueWords = wordMap.keySet();

    // for (String w: uniqueWords)
    //     System.out.printf("> %s: %d\n", w, wordMap.get(w));

    System.out.printf("The number of words in first 100 lines: %d\n"
            , totalWords);
    System.out.printf("Number of unque words: %d\n", uniqueWords.size());




  }

}




















//   System.out.printf("Processing %s\n", fileName);
//   //java -cp classes practice.Main paradise_lost.txt
        
//   String line;
//   FileReader fr;
//   try {
//   fr = new FileReader(fileName);
//   BufferedReader br = new BufferedReader(fr);
        
  
//   //Print line by line
//   Integer i = 1;
//   Integer totalWords = 0;  
//   while (i <= 100) {
//   line = br.readLine();
//   if (null == line)
//   break;
//   // System.out.printf("%d: %s\n", i, line.toUpperCase());
//   // i++;}

//   //total number of words
//   for (Integer j = 0; j <= 100; j++);  
//   String[] words = line.trim().split(" "); 
//   totalWords += words.length;   
//   }
  
          
//   //find number of unique words 
  



//   br.close();
//   fr.close();
  
//   System.out.println(("The number of words are " + totalWords));





//       } catch (FileNotFoundException e)  {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//       } 
      
//     }

// }