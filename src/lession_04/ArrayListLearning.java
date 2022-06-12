package lession_04;

import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        // Declare a List to contain integer value
        List<Integer> userArrayList = Arrays.asList(1, 5, 6, 8);

        for (Integer integer : userArrayList) {
            if(integer % 2 != 0){
                integer = integer + 1;
            }
        }
        System.out.println(userArrayList);

    }
}
