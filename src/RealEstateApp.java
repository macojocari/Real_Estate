import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class RealEstateApp {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("apart.txt");
        ImportEstates.readFile(file);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello guest! Please introduce your preferences");

        System.out.print("Min price: ");
        double minPrice = scanner.nextDouble();

        System.out.print("Max price: ");
        double maxPrice = scanner.nextDouble();

        System.out.print("Min area: ");
        double minArea = scanner.nextDouble();

        System.out.print("Max area: ");
        double maxArea = scanner.nextDouble();

        System.out.print("Min rooms: ");
        int minRooms = scanner.nextInt();

        System.out.print("Max rooms: ");
        int maxRooms = scanner.nextInt();

        EstateList.findEstates(minPrice, maxPrice, minArea, maxArea, minRooms, maxRooms);
        EstateList.removeEstate("Central5");


    }
}
