public class Estate {
    private String estateName;
    private double price;
    private double area;
    private int rooms;

    public Estate(String estateName, double price, double area, int rooms) {
        this.estateName = estateName;
        this.price = price;
        this.area = area;
        this.rooms = rooms;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return String.format("%s: price:%.0f,area:%.1f,rooms:" +
                "%d", estateName, price, area, rooms);
    }
}
