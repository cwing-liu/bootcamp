public class DemoIf {
  public static void main(String[] args) {
    int x = 30;

    if (x >= 30) {
      System.out.println("x >= 30");
    } else {
      System.out.println("x < 30");
    }

    boolean isXLargerThan30 = x >= 30; // true

    if (isXLargerThan30) {
      System.out.println("x >= 30");
    } else {
      System.out.println("x < 30");
    }
    // 8 primitives, String (equals(), charAt(), length())


    // Example 1
    // 1. Else-if (Avoid overlapping events)

    int number = -3;
    if (number > 0) {
      System.out.println("The nubmer is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }


    // "The number is positive."
    // "The nubmer is negative."

    // Example 2 (Avoid overlap)
    int score = 85;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    // Example 3
    int a = 10;
    int b = 20;
    int max;
    int min;
    if (a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min + ".");

    // "b is larger than a."


    // Example 4
    String day = "Wednesday";

    // Approach 1
    if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day)
        || "Thursday".equals(day) || "Friday".equals(day)) {
      System.out.println(day + " is weekday.");
    } else {
      System.out.println(day + " is weekend. ");
    }
    // Approach 2
    boolean weekday =
        "Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day)
            || "Thursday".equals(day) || "Friday".equals(day) ? true : false;
    if (weekday) {
      System.out.println(day + " is weekday.");
    } else {
      System.out.println(day + "is weekend.");
    }
    // "Wednesday is weekday."

    // "Sunday is weekend."
    // "Saturday is weekend."

    // Example 5
    int num = 7;
    if (num % 2 == 1) {
      System.out.println(num + " is an odd number. ");
    } else {
      System.out.println(num + "is an even number. ");
    }
    // "7 is an odd number."
    // "8 is an even number."

    // Example 6
    String str = "hello";
    if (str.length() == 0) {
      System.out.println("This is an empty string.");
    } else {
      System.out.println(
          "The last character of str is " + str.charAt(str.length() - 1));
    }
    // The last character of str is o
    // This is an empty String

    // Example 7
    // Reversed String
    String s = "abc";
    s = "" + s.charAt(2) + s.charAt(1) + s.charAt(0);
    System.out.println("The reversed string is " + s + ".");
    // The reversed string is cba.

    // Example 8
    // Leap Year
    // 1. Divided by 4
    // 2. Not divided by 100
    // 3. Or divided by 400

    int year = 2000;
    boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    boolean isLeap = false;

    // if (year % 4 == 0) { //2004
    // if (year % 100 == 0) {
    // if (year % 400 == 0) {
    // isLeap = true;
    // }else{
    // isLeap = false;
    // }else{
    // isLeap = false;
  }
  // }else

  // Sample output:
  // 1900 is not a leap year
  // 2000 is a leap year
  // 2004 is a leap year
  // 2003 is not a leap year

  // Example 9
  int age = 20;
  boolean isCitizen = false; 
  if(age>=18&&isCitizen==true) {
    System.out.println("Eligible to vote");
  }else if(age<18&&isCitizen==false)
  {
    System.out.println("Not eligible. Age < 18 and not a citizen. ");
  }else if(age<18)
  {
    System.out.println("Not eligible. Age < 18. ");
  }else if(isCitizen==false)
  {
    System.out.println("Not eligible. Not a citizen.");
  }

  // age 18 or above and he is a citizen -> Eligible to vote.

  // Eligible to vote.
  // Not eligible. Age < 18.
  // Not eligible. Not a citizen.
  // Not eligible. Age < 18 and not a citizen.

  // Example 10
  double totalPurchase = 250.0;
  double discount = 0.0d;
  double amountToPay = totalPurchase - discount;if(totalPurchase>=500.0)
  {
    discount = totalPurchase * 0.2;
  }else if(totalPurchase>=200.0&&totalPurchase<500.0)
  {
    discount = totalPurchase * 0.1;
  }else if(totalPurchase>0&&totalPurchase<200.0)
  {
    discount = 0;
  }
  // >= 500.0 -> 20% off
  // >= 200.0 -> 10% off
  // < 200.0 -> no discount

  System.out.println("Discount amount="+discount);System.out.println("Amount to Pay="+amountToPay);

  // Example 11
  char c = 'a';
  // a e i o u -> vowel

  // a is vowel.
  // c is consonant.

  // Teaching
  // contains()
  // String s1 = "hello";
  // System.out.println(s1.contains("ll")); // true
  // System.out.println(s1.contains("lll")); // false
  // s1 = "helloll";
  // System.out.println(s1.contains("ll")); // true

  // Example 12
  String password = "Admin1234567#";

  // Strong password definition:
  // # ! @ $ -> special character
  // password length >= 12
  boolean withoutSpecialCharacter = false;
  if(password.length() >= 12) {
      withoutSpecialCharacter = !password.contains("#") //
      && !password.contains("!") //
      && !password.contains("#") //
      && !password.contains("$") //
      &&password.contains("@")
    }else{ // < 12
    System.out.println("This is a weak password.");
  }

  // It is a strong password.
  // It is a weak password. No special character.
  // It is a weak password. Length < 12.

  // testcase
  // Admin1234567# -> xxx
  // Admin1234
  // Admin123
  // Admin1234567
}}


