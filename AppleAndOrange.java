import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        int appleCount=0, orangeCount=0;
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
       Scanner sc1 = new Scanner(sc.nextLine());
       Scanner sc2 = new Scanner(sc.nextLine());
       sc.close();
        while(sc1.hasNext())
           apples.add(sc1.nextInt());
       sc1.close();
       while(sc2.hasNext())
           oranges.add(sc2.nextInt());
        sc2.close();

        for (int i = 0; i < apples.size(); i++) {
            if((apples.get(i)+a)>=s  && (apples.get(i)+a)<=t)
                appleCount++;
        }
        for (int i = 0; i < oranges.size(); i++) {
            if((oranges.get(i)+b)>=s  && (oranges.get(i)+b)<=t)
                orangeCount++;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}