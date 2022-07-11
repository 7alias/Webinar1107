public class Pow {
    public static double pow(double x, int n) {
        double answer = 1;
        if (n < 0) {

            if (x == 0) {
                return 0;
            }
            n *= -1;
            x = 1 / x;

        }
        for (int i = 0; i < n; i++) {
            answer *= x;
        }
        return answer;
    }

    public static void main(String[] args) {
        double x = 0;
        int n = 1;
        System.out.println(pow(x, n));
    }
}
