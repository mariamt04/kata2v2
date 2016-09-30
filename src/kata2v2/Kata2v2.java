package kata2v2;

import java.util.HashMap;

public class Kata2v2 {

    public static void main(String[] args) {
        
        int[] vector = {1,2,3,4,1,5,3,6,2,9};
        
        Histogram listo = new Histogram(vector);
        
        HashMap <Integer, Integer> histogram = listo.getHistogram();
        
        for(int Key : histogram.keySet()){
            System.out.println(Key + " -> " +  histogram.get(Key));
        }
    }
}
