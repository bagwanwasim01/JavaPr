public class Main
 { 
   static void minimaxSum(int[] arr){
     long min = 0, max = 0, sum = 0;
     min = arr[0];
    max = min ;
    sum = min ;
   for ( int i = 1 ; i < arr.length ; i++) {
    sum += arr [i];
    if( arr[i] < min ) 
         min = arr[i];
    if( arr[i] > max ) 
         max = arr[i];
}
System.out.print((sum - max ) + " " + (sum - min ));
}
     public static void main(String[]args) 
     { 
      int[] arr= new int[] { 1,2,3,4,5};
      for(int i=0;i < arr.length ; i++){
        System.out.print(arr[i]);
}
     System.out.print("\n");
    minimaxSum(arr);
     } 
} 
