/**
 * Code to find a gene in a DNA string.
 * @author (Deontee Hendricks) 
 * @version (2.0)
 */
public class Part2 {
    
    public boolean checkUpperCase(String dnaSequence){
        return dnaSequence == dnaSequence.toUpperCase();
    }
    public String findSimpleGene (String dnaString, String startCodon, String stopCodon){
        
        String gene = null;
        if(checkUpperCase(dnaString)){
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        }
        
        else{
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
       
        int start = dnaString.indexOf(startCodon);
        if(start == -1){
            return "";
        }
        
        int end = dnaString.indexOf(stopCodon, start);
        if(end == -1){
            return "";
        }
        
        if((end - start)%3 == 0){
            if(checkUpperCase(dnaString)){
                gene = dnaString.substring(start,end+3);
                return gene.toUpperCase();
            }
            else{
                gene = dnaString.substring(start,end+3);
                return gene.toLowerCase();
            }
        }
        
        else{
            return "";
        }
    }
    
    public void testFindSimpleGene(){
        
        String startCodon = "atg", stopCodon = "taa";
        
        String [] dnaStrands = {"atgtcactaaatcgaagtaa",
                                "gatgacaagccgctaggtat",
                                "ATGAGAATTCGTTAAAAGCT",
                                "atgagaattcgttaaaagct",
                                "tctcgctgtttccgttcttc"};
                                
        for(String dna : dnaStrands){
            System.out.println("DNA Strand: " + dna);
            System.out.println("Gene: " + findSimpleGene(dna, startCodon, stopCodon));
        }
    }
    
    
}
