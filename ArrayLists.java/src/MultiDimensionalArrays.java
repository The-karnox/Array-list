import java.util.*;

public class MultiDimensionalArrays {


    public static void main(String[] arga){
       ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
       ArrayList<Integer>list1 = new ArrayList<>();
       ArrayList<Integer>list2 = new ArrayList<>();
       ArrayList<Integer>list3 = new ArrayList<>();
        


      

       for(int i=0; i<=10; i++){
           list1.add(i*2);
           list2.add(i*3);
           list3.add(i*4);
            
         }
         mainList.add(list1);
         mainList.add(list2);
         mainList.add(list3);
        
         System.out.println(mainList);

         //nested loops
         for(int i = 0; i<mainList.size(); i++){
          ArrayList<Integer> currList = mainList.get(i);
          for(int j=0; j<currList.size(); j++) {
            System.out.print(currList.get(j)+ " ");
           }
           System.out.println();
          }


       }
       
    }
    

