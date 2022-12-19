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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyintegerOnlyPairs(List<Integer> a) {
        int ans = 0;
        for(int i: a) {
            ans ^= i;
        }
        return ans;
    }

    public static int lonelyinteger(List<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer integer : a) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entrySet: map.entrySet()) {
            if(entrySet.getValue() == 1) {
                return entrySet.getKey();
            }
        }
        return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
