
package gyakorlas;

import java.awt.*;
import static java.nio.file.Files.size;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Gyakorlas {

    
        public static void main(String []args) {
            
            
                        String s = "welcomeToJava";
		 	int k = 3;
		 	
		 	String smallest = s.substring(0,k);
		 	//System.out.println(smallest);
		 	String largest = "";
		 	
		 	ArrayList<String> words = new ArrayList<>();
		 	
		 	for(int i = 0; s.length()-k >= i; i++) {
				words.add(s.substring(i, i+k));	
				if(words.get(i).compareTo(words.get(0)) < 0) {
					words.set(0, words.get(i));
					System.out.println(words.get(0));
				}
		 	}
		 	
		 	//System.out.println(smallest);


            

  


   }
}
    
    

