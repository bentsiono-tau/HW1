public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        long curr = 1;
        long prev = 1;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (prev % 2 != 0)
                numOdd++;
            System.out.print(prev);
        
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            long next = curr + prev;
            prev = curr;
            curr = next;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
