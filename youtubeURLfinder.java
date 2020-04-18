
/**
 * reads the lines from a specified file location and prints each 
 * URL on the page that is a link to youtube.com.
 * 
 * @author (Deontee Hendricks) 
 * @version (1.0)
 */

import edu.duke.*;

public class Part4 {
    
    public void printFile(){
        
        URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        
        String temp = null;
        
        int start = 0, end = 0;
        
        for(String line : ur.lines()){
            temp = line.toLowerCase();
            if(temp.indexOf("youtube")!=-1){
                start = line.indexOf("href=\"");
                end = line.indexOf("\"",start+6);
                System.out.println(line.substring(start+6,end));
            }
        }
    }
    
   }
