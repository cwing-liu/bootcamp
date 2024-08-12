// package questions;
/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230 Max 240
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200 Max 240
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120 Max 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240 Max 240


    // Your program should be able to handle all the above test case.
    int secondMax = -1001;
    int max = -1000; // Find out max before secondMax
    // code here ...
    for(int i = 0; i < nums4.length - 1; i++){
      if(nums4[i] > nums4[i+1] ){
        if(max < nums4[i]){
        max = nums4[i];}
       } else {
        max = nums4[i+1];
}   
    }    
  
      for(int i = 0; i < nums4.length - 1; i++ ) {
        if( max > nums4[i] && nums4[i] < nums4[i+1] ) {
          continue;
        } else {secondMax = nums4[i];
      }        
      } System.out.println("Second Max = " + secondMax);
  }  
}