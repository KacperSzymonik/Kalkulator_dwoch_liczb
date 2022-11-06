public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 2; i < 83; i += 1) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
