public class LinearSearchAlgo {

    //Linear search is a simplest algorithm/approach to search an element in data set.
public static void main(String[] args) {
    int data[] = {1,5,8,9,15,2,6,12};
   int target = 12 ;
   
   for(int i=0; i<data.length;i++){
        if(data[i]==target){
            System.out.println("Index: " +i+" Element: " +data[i]);
        }
   }
}
}
