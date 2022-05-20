import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();
        String[] str = values.split(" ");
        int x1 = Integer.parseInt(str[0]);
        int x2 = Integer.parseInt(str[2]);
        int v1 = Integer.parseInt(str[1]);
        int v2 = Integer.parseInt(str[3]);
        if(v2 == v1 && x1 != x2)
            System.out.println("NO");
        else if(v2 == v1 && x1 == x2)
            System.out.println("YES");
        else{
            int rem = (x1 - x2) % (v2 - v1);
            if(rem == 0 && v1 > v2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }


    }
}
