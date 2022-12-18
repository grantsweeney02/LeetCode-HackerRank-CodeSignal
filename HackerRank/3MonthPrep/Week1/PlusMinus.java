import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double numPositives = 0;
        double numNegatives = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0) {
                numPositives++;
            }
            if(arr.get(i) < 0) {
                numNegatives++;
            }
        }
        double numZeros = arr.size() - numPositives - numNegatives;
        DecimalFormat numberFormat = new DecimalFormat("#.000000");
        System.out.println(numberFormat.format(numPositives/arr.size()));
        System.out.println(numberFormat.format(numNegatives/arr.size()));
        System.out.println(numberFormat.format(numZeros/arr.size()));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
