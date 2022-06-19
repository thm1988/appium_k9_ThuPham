package lession_08;

public class House {
    private int doorNum;
    private String rootColor;
    private String houseColor;

    public House() {
    }

    public House(int doorNum) {
        this.doorNum = doorNum;
    }

    public House(String rootColor) {
        this.rootColor = rootColor;
    }

    public House(String rootColor, String houseColor) {
        this.rootColor = rootColor;
        this.houseColor = houseColor;
    }

    public House(int doorNum, String rootColor, String houseColor) {
        this.doorNum = doorNum;
        this.rootColor = rootColor;
        this.houseColor = houseColor;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public void setRootColor(String rootColor) {
        this.rootColor = rootColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "doorNum=" + doorNum +
                ", rootColor='" + rootColor + '\'' +
                ", houseColor='" + houseColor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house = new House();
        house.setHouseColor("Yellow");
        house.setDoorNum(1);

        System.out.println(house);
    }
}
