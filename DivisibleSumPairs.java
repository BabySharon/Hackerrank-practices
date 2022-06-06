import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, count = 0;
        List<Integer> params = Arrays.stream(sc.nextLine().split(" ")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
        List<Integer> arr = Arrays.stream(sc.nextLine().split(" ")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
        n = params.get(0);
        k = params.get(1);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr.get(i) + arr.get(j))%k == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
