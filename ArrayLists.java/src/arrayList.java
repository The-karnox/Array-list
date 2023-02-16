import java.util.*;

public class arrayList {
  public static void swap(ArrayList<Integer>list, int idx1, int idx2){
   int temp = list.get(idx1);
   list.set(idx1, list.get(idx2));
   list.set(idx2, temp);
    }
    public static void main(String[] args) throws Exception {
       
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>(); 


        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(9);
        list2.add(true);
        System.out.println(list);
        int idx1 = 3 , idx2 = 1;
        swap(list, idx1, idx2);
        System.out.println(list);
        Collections.sort(list);//ascending
        System.out.println(list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
        //int max = Integer.MIN_VALUE;
        //for(int i=0; i<list.size(); i++){
        //  max=Math.max(max, list.get(i));
          //}
          //System.out.println("max element = "+ max);

        //reverse
        //for(int i = list.size()-1; i>=0; i--){
          //System.out.print(list.get(i) + " ");
         //}

           //list.set(1,4);
           //System.out.println(list);
           //System.out.println(list.contains(1));
    }

}
