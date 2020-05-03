
/**
 * Finds Multiples genese in a DNA string
 * 
 * @author (Deontee Hendricks) 
 * @version (1.0)
 */
public class Part1 {
    
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int found = 0;
        
        while(found != -1){
            found = dna.indexOf(stopCodon, startIndex);
            if((found-startIndex)%3==0){
                return found;
            }
            startIndex = found+1;
        }
        
        return dna.length();
    }
    
    public void testFindStopCodon(){
        System.out.println(findStopCodon("atgghtthgghttac",0,"tag"));
    }
    
    public String findGene(String dna, int where){
        
        int found = dna.indexOf("atg", where);
        
        if(found == -1)return "";
        
        int tagStop = findStopCodon(dna, found, "tag");
        int tgaStop = findStopCodon(dna, found, "tga");
        
        if(tagStop <= tgaStop && tagStop != dna.length()){
            return dna.substring(found,tagStop+3);
        }
        
        else if(tgaStop <= tagStop && tgaStop != dna.length()){
            return dna.substring(found,tgaStop+3);
        }
        
        else{
            return "";
        }
    }
    
    public void testFindGene(){
        int startIndex = 0;
        System.out.println("atgghttgaghttac");
        System.out.println("Gene: "+findGene("atgghttgaghttag",startIndex));
    }
    
    public void printAllGenes(String Dna){
        
        int startIndex = 0;
        
        while(true){
            String currentGene = findGene(Dna,startIndex);
            
            if(currentGene.equals("")){
                break;
            }
            
            System.out.println(currentGene);
            startIndex = Dna.indexOf(currentGene, startIndex)+currentGene.length();
            
            
        }
    }
    
    public void testPrintAllGenes(){
           printAllGenes("atgghttgaghttagatgghttgaghttga");
        }
}
