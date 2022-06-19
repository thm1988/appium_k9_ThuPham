package lession_08;

import java.util.Locale;

public class HouseWithBuilder {
    private int doorNum;
    private String roofColor;
    private String houseColor;

    // Default Constructor
    public HouseWithBuilder() {

    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "doorNum=" + doorNum +
                ", roofColor='" + roofColor + '\'' +
                ", houseColor='" + houseColor + '\'' +
                '}';
    }
// Create protected object

    protected HouseWithBuilder(Builder builder){
        doorNum = builder.doorNum;
        roofColor = builder.roofColor;
        houseColor = builder.houseColor;
    }
    // READ ONLY

    public int getDoorNum() {
        return doorNum;
    }

    public String getRoofColor() {
        return roofColor;
    }

    public String getHouseColor() {
        return houseColor;
    }

    // Create Inner Class
    public static class Builder{
        private int doorNum;
        private String roofColor;
        private String houseColor;

        // WRITE ONLY


        public void setDoorNum(int doorNum) {
            this.doorNum = doorNum;
        }

        public void setRoofColor(String roofColor) {
            this.roofColor = roofColor;
        }

        public void setHouseColor(String houseColor) {
            this.houseColor = houseColor;
        }

        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }


}

