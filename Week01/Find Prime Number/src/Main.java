// finding prime number between 1 and 100

public class Main {
    public static void main(String[] args) {

        int count=0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
            count = 0;
        }

    }

}