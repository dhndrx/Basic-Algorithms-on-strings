/**
 * Code to find a gene in a DNA string.
 * @author (Deontee Hendricks)
 * @version (1.0)
 */

public class geneFinder {

    private static String findSimpleGene(String dnaString){

        int start = dnaString.indexOf("atg");
        if(start == -1){
            return "";
        }

        int end = dnaString.indexOf("taa", start);
        if(end == -1){
            return "";
        }

        if((end - start)%3 == 0){
            return dnaString.substring(start,end);
        }
        else{
            return "";
        }
    }

    private static void testFindSimpleGene(){

        String [] dnaStrands = {"atgtcactaaatcgaagtaa",
                                "gatgacaagccgctaggtat",
                                "tcgtggaaagcggctaacgt",
                                "atgagaattcgttaaaagct",
                                "tctcgctgtttccgttcttc"};

        for(String dna : dnaStrands){
            System.out.println("DNA Strand: " + dna);
            System.out.println("Gene: " + findSimpleGene(dna));
        }
    }

    public static void main(String []args){
        testFindSimpleGene();
    }
}
