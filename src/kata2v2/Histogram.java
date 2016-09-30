package kata2v2;

import java.util.HashMap;

public class Histogram {
    
    private final int[] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }
    
    public int[] getVector(){
        return vector;
    }
    
    public HashMap <Integer, Integer> getHistogram(){ 
       HashMap<Integer, Integer> listo = new HashMap<>();
       
       for(int Key : vector){
            if(listo.containsKey(Key)){
                 listo.put(Key, listo.get(Key)+1);
            } else {
                listo.put(Key,1);
            }
        }
       
       return listo;
    }    
    

}
