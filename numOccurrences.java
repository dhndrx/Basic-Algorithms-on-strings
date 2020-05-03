
/**
 *Finds the number of occurences of one string in another.
 * 
 * @author (Deontee Hendricks) 
 * @version (1.0)
 */
public class Part2 {

    public int numOccurrences(String stringa, String stringb){
        int counter = 0, startIndex = 0;
        
        while(true){
        
            int found = stringb.indexOf(stringa,startIndex);
            
            if(found == -1)break;
            
            counter++;
            
            startIndex = stringb.indexOf(stringa, startIndex)+stringa.length();
            
        }
        return counter;
    }
    
    public void testnumOccurrences(){
    
            System.out.println(numOccurrences("eo","eorgreouieojkl"));
    }
}
