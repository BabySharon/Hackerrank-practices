import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> scores = Arrays.stream(sc.nextLine().split(" ")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
        int max = scores.get(0), min = scores.get(0), maxCount = 0, minCount = 0;
        for (int num:scores) {
            if(num > max) {
                max = num;
                maxCount++;
            }
            if(num < min) {
                min = num;
                minCount++;
            }
        }
        System.out.println(maxCount+" "+minCount);
    }
}
