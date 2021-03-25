import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportEstates {
    public static ArrayList<Estate> readFile(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("#");
        while (scanner.hasNext()) {
            String row = scanner.next();
            String[] part = row.split(",");
            double area = Double.parseDouble(part[1]);
            double price = Double.parseDouble(part[2]);
            int rooms = Integer.parseInt(part[3]);
            Estate estate = new Estate(part[0], price, area, rooms);
            EstateList.addProperty(estate);

        }

        return EstateList.getListOfEstate();
    }

}
