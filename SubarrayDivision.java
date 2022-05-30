import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SubarrayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> segments = Arrays.stream(sc.nextLine().split(" ")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
        List<Integer> params = Arrays.stream(sc.nextLine().split(" ")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
        int d = params.get(0), m = params.get(1), sum = 0, count = 0;
        // m = 1, d = 1
        for (int i = 0; i < n-m+1; i++) {
            sum = 0;
            for (int j = 0; j < m; j++)
                sum += segments.get(i+j);
            if(sum == d)
                count += 1;
        }
        System.out.println(count);
    }
}
