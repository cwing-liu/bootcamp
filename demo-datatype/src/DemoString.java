public class DemoString {
  public static void main(String[] arg) {
    System.out.println("hello world !!!! ");
    // "hello world !!!!" -> String value

    // String is not a primitive !!!!
    String s;
    s = "abc";

    String s2 = "def"; // "def" is a String value, and then assign to String variable
    // String s3 = 3;
    // String s4 = true;

    String s3 ="3"; // It's ok, but you cannot perform Math Operation
    s3 = s3 + 1; // append meaning, but not + 1
    // String value + int value
    // String value + String value
    System.out.println(s3); // "31"

    s3 = s3 + true;
    System.out.println(s3); // "31true"

    String s4 = "Welcome to Hong Kong !!!";
    s4 = s4 + "香港歡迎你!!!";
    System.out.println(s4);

    // Example 1
    char grade = 'A';
    System.out.println("My grade of English is " + grade + ".");

    // +=
    // Example 
    String firstName = "Wing";
    String lastName = "Liu";
    String fullName = "";
    fullName += lastName + " " + firstName;
    System.out.println(fullName);

    // In String, there is no +, -, *, /, %

     // Primitive -> Math Operation, Comparison (>, <, >=, <=, ==, !=)
     // String -> Not Primitive, we use method (tool) to compare their values
     String s10 = "Hello";
     String s20 = "Hello";
     System.out.println(s10.equals(s20)); // true

     // equals()
     boolean isValueSame = "abc".equals(s20);
     System.out.println(isValueSame); 

     // charAt()
     char result = s10.charAt(1); // 2nd char of String value
     System.out.println(result);// "e"
     System.out.println(s10.charAt(0)); // "H"
     // System.out.println(s10.charAt(-1)); // index negative -> runtime error
     // System.out.println(s10.charAt(5)); // out of range -> runtime error
     // s10.charAt(1L);
     // s10.charAt(1.0);
     System.out.println(s10.charAt(0) == 'H'); // true


     // length()
     System.out.println(s10.length()); // 5
     System.out.println(s10.length() >= 5); // true

  }
  
}
