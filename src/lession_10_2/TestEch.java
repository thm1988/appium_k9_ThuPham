package lession_10_2;

public class TestEch {
    public static void main(String[] args) {
        Ech ech;
        // Demo polymorphism
        boolean isEnoughTime = true;
        if(isEnoughTime) {
            ech = new NongNoc();
        } else {
            ech = new TrungEch();
        }

        Ech trungEch = new TrungEch();
        Ech nongNoc = new NongNoc();
        trungEch = new NongNoc();
    }
}
