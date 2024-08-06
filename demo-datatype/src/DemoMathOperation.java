public class DemoMathOperation {
  public static void main(String[] args){
    int x = 10 + 3;
    System.out.println(x); //13

    x = x + 3 - 9;
    System.out.println(x); // 7

    x = x - 5 * 2; // 5 x 2 first
    System.out.println(x); // -3

    x = (x - 1) / 2; 
    System.out.println(x);

    // Special operator -> %
    int remainder = 5 % 2; // 1
    System.out.println(remainder);


    int remainder2 = 10 % 2; // 0
    System.out.println(remainder2);

    System.out.println(0 / 10); // 0
    // System.out.println(10 / 0);
    // as developer, you should avoid divided by zero

    int j = 2;
    System.out.println(10 / j); // 5
    // You should avoid j become 0, before you decide to "10 / j"

    // double
    // +, -, *, /, %
    // / zero
    double d = 10.0 / 5.0;
    System.out.println(d); // 2.0

    double d2 = 10.0 / 5; // double/int -> double/double
    System.out.println(d2); // 2.0


    // 3 is int value while 3.0 is double value

    // ++x, x++, --x, x--

    int k = 0;
    int o = k++ + 3;
    // 1. k + 3
    // 2. Assignment (assign to o)
    // 3. k + 1 ( k++ = k + 1)
    System.out.println(o); // 3
    System.out.println(k); // 1

    int u = 0;
    int e = ++u + 3;
    // 1. u + 1
    // 2. u + 3
    // 3. Assignment (assign to e)
    System.out.println(e); // 4
    System.out.println(u); // 1

    // practice x-- and --x

    
    
    
    
    
    
    



  }
  

}
