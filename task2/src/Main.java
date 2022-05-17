import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inputPath = getFile();

        Scanner input = new Scanner(inputPath);

        String[] centerPoint = input.nextLine().split(" ");

        Circle circle = new Circle(new Point(Float.parseFloat(centerPoint[0]), Float.parseFloat(centerPoint[1])), input.nextFloat());

        input.close();

        File outputPath = getFile();

        Scanner output = new Scanner(outputPath);

        while (output.hasNextLine()) {
            String[] point = output.nextLine().split(" ");
            System.out.println(circle.getPointLocation(new Point(Float.parseFloat(point[0]), Float.parseFloat(point[1]))));
        }

        output.close();
    }


    public static File getFile() {
        Scanner inputPath = new Scanner(System.in);
        File inputFile = new File(inputPath.nextLine());
        return inputFile;
    }
}
