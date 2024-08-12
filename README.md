# bootcamp
## Week 1
- Primitives (int, double, byte, short, long, float, char, boolean)

  - Higher/Lower level types (byte, short, int, long, float, double)
   - integer (byte, short, int, long) 
   - decimal (float, double)
   - char (single character only)
   - boolean (comparison)
  
  - concept:
    - int x = 3; // put 3 into x
    - double y = 3.0; // put 3.0 into y
      double y1 = 30.0d;
    - float floatValue = 37.3f;
    - long bigNumber = 1023400000L;
    - byt smallestNumber = 10;
    - char a = "abcdef"; // put "abcdef" into a
    - boolean isRight = false; // put false into isRight

  - Math Operations
  - Comparison Operators
  - byte (integer) (smallest)
    byte hours = 24
    System.out.println("There are " + hours + " a day. ");

    double (decimal)
    double salary = 20000.0; 
    System.out.println("Wing's monthly salary is $" + salary);

    char (character)
    char c = 'A';
    System.out.println(c); // A

    boolean isTrue = false;
    System.out.println(isTrue); // false

- Strings 
  methods (length, equals, charAt(integer index))
   - Operator 
          - length()
       String myName = "Wing";
       length(myName); // 4

     - equals()
       String s1 = "Wing";
       String s2 = "Rain";
       System.out.println(s1.equals(s2)); // False

     - charAt() 
        char = Character
        char hello = "Hello" 
        charAt(0);// H, 
        charAt(1); // e
        charAt(4); // o  

- Math Opertor
 - Assignment (=, +=, -=, *=, /=)
 - Arithmetic (+, -, ++, --, /, %, *)
 - Relational (>, >=, <, <=, ==, !=)
 - Logical (!, ||, &&)
 
- if-else
  if (constraint) {
    (show if meet the constraint)
  } else {
    (show if not)
  }

- switch

- for Loop
  - count = 0;
  - for (int i = 0; i < str.length; i++) // ascending order
  - for (int i = 10; i > -1 ; i--) // descending order