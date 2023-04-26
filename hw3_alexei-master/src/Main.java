import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        double numbers[] = {3.9, -1.3, 3.2, 2.9, -2.3, 3.3, 4.8, 3.8, 2.2, 9.8, -4.8, 3.4, -2.1, 9.5, -9.0};

        double sum = 0.0;
        double count = 0.0;

       // Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {
                for (int i1 = i + 1; i1 < numbers.length; i1++) {

                    if(numbers[i1]>0){
                        sum = sum + numbers[i1];
                        count++;
                    }
                }
                break;
            }
        }
        System.out.println("Среднее арифметтическое: " + sum / count);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double num = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = num;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}
