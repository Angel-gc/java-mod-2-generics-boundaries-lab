import java.util.Arrays;
import java.util.List;

public class Main {
    // implement the public averageList method here
    public static <E> Double averageList(List<? extends Number> numberList){
        double average = 0;
        double sum = 0;
        for (Number num : numberList){
            sum += num.doubleValue();
        }
        average = sum / numberList.size();
        return average;
    }
    
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(averageList(intList)); // 3.0

        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(averageList(doubleList)); // 3.0       
    }
}
