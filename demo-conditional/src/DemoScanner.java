import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // User input

    // Example 1
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number: ");

    int input = s.nextInt(); 
    // terminal will stop here, and wait for a user input
    // After capturing the user input -> assignment
if (input % 2 == 1){
  System.out.println(" the user input is an odd number. ");
}else{
  System.out.println(" the user input is an even number. ");
}
    // the user input is an odd number
    // the user input is an even number


    // Example 2
    // "Choose an option: 1) Deposit 2) Withdraw 3) Check Balance"
    // if user input 1
      // Question -> "Please input the deposit amount:"
      // Print out the amount after deposit
    // if user input 2
      // Question -> "Please input the withdrawal amount:"
      // Print out the amount after withdrawal
    // if user input 3
      // Print out current balance

    double currentBalance = 300.0;
    System.out.println("Choose an option: 1) Deposit 2) Withdraw 3) Check Balance");
    if (input == 1) {
      System.out.println("Please input the deposit amount: ");
    }else if(input == 2){
      System.out.println("Please input the withdrawal amount: ");  
    }else if(input == 3){
      System.out.println("Current Balance : $ " + currentBalance);
    }
  }
  
}
