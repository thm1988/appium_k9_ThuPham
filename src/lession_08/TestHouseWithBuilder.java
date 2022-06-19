package lession_08;

import static lession_08.HouseWithBuilder.Builder;

public class TestHouseWithBuilder {
    public static void main(String[] args) {
        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        builder.setDoorNum(3);
        builder.setHouseColor("White");
        builder.setRoofColor("Pink");
        HouseWithBuilder house = builder.build();

        System.out.println(house);
    }
}
