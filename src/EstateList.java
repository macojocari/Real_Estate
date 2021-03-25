import java.util.ArrayList;

public class EstateList {
    private static ArrayList<Estate> listOfEstate = new ArrayList<>();

    public static ArrayList<Estate> getListOfEstate() {
        return listOfEstate;
    }

    public static void addProperty(Estate estate) {
        listOfEstate.add(estate);
    }

    public static void findEstates
            (double minPrice, double maxPrice, double minArea, double maxArea, int minRooms, int maxRooms) {
        for (Estate estate : listOfEstate) {
            if (estate.getPrice() >= minPrice && estate.getPrice() <= maxPrice
                    && estate.getArea() >= minArea && estate.getArea() <= maxArea
                    && estate.getRooms() >= minRooms && estate.getRooms() <= maxRooms) {
                System.out.println(estate);
            }

        }
    }

    public static void removeEstate(String estateName) {
        for (int i = 0; i < listOfEstate.size(); i++) {
            if (estateName.equals(listOfEstate.get(i).getEstateName())) {
                listOfEstate.remove(listOfEstate.get(i).getEstateName());
            }
        }

    }

}
