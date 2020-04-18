
/**
 * reads the lines from a specified file location and prints each 
 * URL on the page that is a link to youtube.com.
 * 
 * @author (Deontee Hendricks) 
 * @version (1.0)
 */

import edu.duke.*;

public class urlFinder {
    
    public void printFile(){
        URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        String temp = null;
        
        for(String line : ur.lines()){
            temp = line.toLowerCase();
            if(temp.indexOf("youtube")!=-1){
                System.out.println(line);
            }
        }
    }
    
   }
