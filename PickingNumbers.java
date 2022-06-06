import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loc = 1, max = 0;
        sc.nextLine();
        List<Integer> arr = Arrays.stream(sc.nextLine().split(" ")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
        Collections.sort(arr);
        for (int i = 0; i < n-1; i=i+loc) {
            int j = 1;
            boolean flag = false;
                while ((i + j != n) && (arr.get(i + j) - arr.get(i) <= 1)) {
                    if (arr.get(i + j) - arr.get(i) == 1 && flag == false) {
                        loc = j;
                        flag = true;
                    }
                    j++;
                }
                if (j > max)
                    max = j ;
                if(flag == false)
                    loc = j;

        }
        System.out.println(max);
    }
}
