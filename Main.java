import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numberList = {1,2,3,4,5,6,7,8,9};
        double sum = 0;

        for (double item : numberList) {
            sum += 1 / item;
        }

        System.out.println(Arrays.toString(numberList) + " Dizisinin");
        System.out.println("Harmonik Ortalama : " + numberList.length / sum);
    }
}