public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        int k = 1;
        while (k <= n) {
            double sign = Math.pow(-1, k+1);
            double fraction = 1.0 / (2 * k - 1);
            approxPi += sign * fraction;
            k++;
        }
        approxPi *= 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
