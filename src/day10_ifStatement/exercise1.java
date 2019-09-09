package day10_ifStatement;

public class exercise1 {
	
	public static void main(String[] args) {
        /*
         * int n1=2; int n2=2; int n3=2; (This is the all equal part. An extra
         * possibility which is done also.
         */
        int n1 = 42;
        int n2 = 22;
        int n3 = 12;
        String output = "";
        if (n1 > n2 && n1 > n3) {
            output = "n1 is bigger";
        }
        if (n2 > n1 && n2 > n3) {
            output = "n2 is bigger";
        }
        if (n3 > n2 && n3 > n1) {
            output = "n3 is bigger";
        }
        if (n1 == n2 && n2 == n3) {
            output = "n1, n2, n3... They are all same";
        }
        System.out.println(output);
    }

}
