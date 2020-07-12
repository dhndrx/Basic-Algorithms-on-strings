
/**
 * Various algorithms on strings for practice and review
 * 
 * @author (Deontee Hendricks) 
 * @version (1.0)
 */
public class WordPlay {
    
    public boolean isVowel(char c){
        
        c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void testIsVowel(){
        
        System.out.println(isVowel('A'));
        
    }
    
    public String replaceVowels(String phrase, char ch){
        
        StringBuilder str1 = new StringBuilder();
        
        for(int i=0;i<phrase.length();i++){
            if(isVowel(phrase.charAt(i))){
                str1.append(ch);
            }
            else{
                str1.append(phrase.charAt(i));
            }
        }
        
        return str1.toString();
    }
    
    
    public void testReplaceVowels(){
        
        System.out.println(replaceVowels("Hello World",'*'));
        
    }
    
    public String emphasize(String phrase, char ch){
        
        StringBuilder str1 = new StringBuilder();
        
        for(int i=0;i<phrase.length();i++){
            if(phrase.charAt(i)==ch){
                
                if((i+1)%2==0){
                    str1.append('+');
                }
                else{
                    str1.append('*');
                }
                
            }
            else{
                str1.append(phrase.charAt(i));
            }
        }
        
        return str1.toString();
    }
    
    public void testEmphasize(){
        
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        
    }
}
