public class Revision {
  public static void main(String[] args) {
    int workingDay = 35;
    System.out.println("The total working day of the works is " + workingDay + ".");
    double salary = 20233.75; 
    System.out.println("Wing's monthly salary is $" + salary); // Wing's monthly salary is $20233.75.

    char c = 'A';
    System.out.println(c); // A

    String s1 = "Wing";
       String s2 = "Rain";
       System.out.println(s1.equals(s2)); // False
      boolean sameName = s1.equals(s2); 
       System.out.println(sameName); // False
    
       String myName = "Wing";
       System.out.println(myName.length()); // 4
       System.out.println(myName.length() >= 5); // False
       System.out.println(myName.length() == 5); // False

  }
  
}
