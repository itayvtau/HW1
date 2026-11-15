public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 2;
        int[] terms = {1, 1};
        System.out.print(terms[0] + " " + terms[1] + " ");
        for (int i = 2; i < x; i++) {
            int next = terms[0]+terms[1];
            if (next % 2 != 0) 
                numOdd++;
            if (i%2==0)
                terms[0] = next;
             else
                terms[1] = next;
            System.out.print(next);
            if (i < x - 1) 
                System.out.print(" ");
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
