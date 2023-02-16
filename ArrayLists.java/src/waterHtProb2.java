import java.util.*;

public class waterHtProb2 {

    public static int storedMaxWater(ArrayList<Integer>height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
         int ht = Math.min(height.get(lp),height.get(rp));
         int width = rp-lp;
         int currWater = ht*width;
         maxWater = Math.max(maxWater, currWater);

         if(height.get(lp) < height.get(rp)){
            lp++;
         }else{
          rp--;
          }
        }
         return maxWater;
    }
    public static void main (String[] args){
      ArrayList<Integer>height = new ArrayList<>();
      height.add(5);
      height.add(4);
      height.add(8);
      height.add(9);
      height.add(1);
      height.add(5);
      height.add(19);
      height.add(3);
      height.add(45);
      height.add(6);
      height.add(32);
      System.out.println(storedMaxWater(height));
     }
}