import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> check = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            check.add(i);
        }


        int m = scanner.nextInt();

        int number;
        do {
            if (m > check.size()) {
                for (int i = 1; i <= n; i++) {
                    check.add(i);
                }
            }
            System.out.print(check.get(0));

            for (int i = 0; i < m - 1; i++) {
                check.remove(0);
            }

            //System.out.println(Arrays.toString(check.toArray()));
            number = check.get(0);

        }
        while (number != 1);
    }
}