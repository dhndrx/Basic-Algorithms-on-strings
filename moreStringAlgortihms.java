/**
 * More algorithms on strings
 * 
 * @author (Deonte Hendricks) 
 * @version (1.0)
 */
public class moreStringAlgorithms{
    
    /*
     * Takes 2 strings and tests to see if stringa occurs at least twice in stringb.
     * returns True if stringa occurs at least twice. If not, then it returns false.
     */
    public boolean twoOccurrences(String stringa, String stringb){
        
        int counter = 0, found = 0;
        
        while(counter < 2){
            found = stringb.indexOf(stringa,found);
            if(found == -1)return false;
            counter++;
            found += stringa.length();
        }
      
        return true;
    }
    
    /*
     * Takes 2 strings and returns the remaining substring of string b after the occurence of stringa. 
     * If stringa is not present in stringb, then all of stringb is returned.
     */
    public String lastPart(String stringa, String stringb){
        int found = stringb.indexOf(stringa);
        if(found != -1){
            return stringb.substring(found+stringa.length());
        }
        else{
            return stringb;
        }
    }
    
    /*
     * Tests implementation of twoOccurences
     */
    public void testTwoOccurences(){
        System.out.println(twoOccurrences("by", "byblahblahbyblahblahby"));//returns true
        System.out.println(twoOccurrences("eon", "deontee")); // returns false
        System.out.println(twoOccurrences("racecar", "racecarracecar")); //returns true
    }
    
    /*
     * Tests implementation of LastMethod
     */
    public void testLastPart(){
        System.out.println(lastPart("an", "banana")); // returns ana
        System.out.println(lastPart("zoo", "forest")); // returns forest
    }
}
