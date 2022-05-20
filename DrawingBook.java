import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        int page = Integer.parseInt(sc.next());
        if(page == total || page == 1)
            System.out.println(0);
        else{
            int mid = total/2;
            if(page <= mid){
                if(page % 2 == 0)
                    System.out.println(((page-1)/2)+1);
                else
                    System.out.println(((page-1)/2));
            }
            else{
                if(total%2 == 0)
                    if(((total-1)/2)%2 == 0)
                        if(page%2 == 0)
                            System.out.println(((total-page)/2));
                        else
                            System.out.println(((total-page)/2)+1);
                    else
                        System.out.println(((total-page)/2)+1);
                else
                    System.out.println((total-page)/2);
            }
        }
    }
}
