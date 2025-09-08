package lab1;

public class Multiples {

    public static void main(String[] args) {
        System.out.println(multiples(10, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int i = 1;
        int j = 0;
        while (i < n) {
            i++;
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3 && divisibleBy5) {
                j++;
            }
            else {
                if (divisibleBy3) {
                    j++;
                }
                if (divisibleBy5) {
                    j++;
                }
            }

        }

    return j;
    }
}
