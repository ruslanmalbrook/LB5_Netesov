import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Ruslan Malbrook\\Documents\\data.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) System.out.println(scanner.nextLine());

        scanner.close();
    }
}