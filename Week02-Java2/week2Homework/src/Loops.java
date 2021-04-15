public class Loops {
  // Jennifer Lynn Week 2 homework

  public static void main(String[] args) throws Exception {

    // 5.a while loop - evens from 0-100
    System.out.println("evens from 0-100");
    int i = 0;
    while (i <= 100) {
      System.out.println(i);
      i += 2;
    }

    // 5.b while loop - count every 3rd back from 100
    System.out.println("by 3s back from 100");
    i = 100;
    while (i > 0) {
      System.out.println(i);
      i -= 3;
    }

    // 5.c for loop - odds 1-100
    System.out.println("by odds from 1 to 100");
    for (int j = 1; j < 100; j += 2) {
      System.out.println(j);
    }
    // 5.d for loop - numbers 0-100, div 3 hello, div 5 world, div 3 and 5 hello
    // world
    System.out.println("hello world loop");
    for (int j = 0; j < 101; j++) {
      if (j % 3 == 0 && j % 5 == 0) {
        System.out.println(j + ": Hello World");
      } else if (j % 3 == 0) {
        System.out.println(j + ": Hello");
      } else if (j % 5 == 0) {
        System.out.println(j + ": World");
      } else {
        System.out.println(j);
      }
    }
    // ending brackets
  }
}
