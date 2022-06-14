package lab_07_02;

import java.util.Arrays;
import java.util.List;

public class AnimalController {

    public static void main(String[] args) {

        Animal kiki = new Dog();
        Animal hihi = new Horse();
        Animal gugu = new Tiger();

        List<Integer> speedList = Arrays.asList(kiki.speed(),hihi.speed(),gugu.speed());
        System.out.println(speedList.toString());
        int winnerInt = speedList.get(0);
        int indexAnimalReturn = 0;
        for (int indexAnimal = 1; indexAnimal < speedList.size(); indexAnimal++) {
            if (speedList.get(indexAnimal) > winnerInt){
                winnerInt = speedList.get(indexAnimal);
                indexAnimalReturn = indexAnimal;
            }
        }
        switch (indexAnimalReturn){
            case 0:
                System.out.printf("Winner is " +Dog.class.getSimpleName()+ " with speed: " + winnerInt);
                break;
            case 1:
                System.out.printf("Winner is " +Horse.class.getSimpleName()+ " with speed: " + winnerInt);
                break;
            case 2:
                System.out.printf("Winner is " +Tiger.class.getSimpleName()+ " with speed: " + winnerInt);
                break;
            default:
                System.out.println("ERR: not define!!!");
        }

    }

}
