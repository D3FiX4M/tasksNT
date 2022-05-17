import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner path = new Scanner(System.in);
        File file = new File(path.nextLine());
        path.close();

        Scanner scanner = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
            numbers.add(num);
        }

        scanner.close();

        //System.out.println(Arrays.toString(numbers.toArray()));

        int avgNum = sum / numbers.size();
        boolean flag = false;
        int counter = 0;

        while (!flag) {

            //System.out.println(Arrays.toString(numbers));

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) != avgNum) {
                    if (numbers.get(i) > avgNum) {
                        numbers.set(i, numbers.get(i) - 1);
                    } else {
                        numbers.set(i, numbers.get(i) + 1);
                    }
                    counter++;
                    flag = false;
                    break;
                }
                flag = true;

            }
        }
        System.out.println(counter);
    }


}
