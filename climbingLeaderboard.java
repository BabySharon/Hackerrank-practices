import java.util.*;
import java.util.stream.Collectors;

public class climbingLeaderboard {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        List<Integer> player = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int onBoard = sc.nextInt();
        while (onBoard > 0) {
            ranked.add(sc.nextInt());
            onBoard--;
        }
        int plays = sc.nextInt();
        while (plays > 0) {
            player.add(sc.nextInt());
            plays--;
        }

        List<Integer> res = ranked.stream().distinct().sorted().collect(Collectors.toList());
        int prev = 0;
        int size = res.size();
        int pSize = player.size(),p=0, elem = player.get(0), i;
        for (i = 0; i < size; i++) {
            if(p==pSize)
                break;
            if(i==size-1){
                while (p<pSize) {
                    System.out.println(1);
                    p++;
                }
                break;
            }

            while(elem < res.get(i)){
                System.out.println(size+1);
                p++;
                if(p==pSize)
                    break;
                elem = player.get(p);

            }
            while(elem >= res.get(i) && res.get(i+1) > elem ){
                System.out.println(size - i);
                p++;
                if(p==pSize)
                    break;
                elem = player.get(p);

            }
        }




//            int start = 0, end = res.size()-1;
//            int mid = (start + (end-start)/2);
//            int search = player.get(i);
//            while (start <= end) {
////                System.out.println(start+" "+end+" "+mid);
//                if (res.get(mid) == search) {
//                    System.out.println(mid+1);
//                    break;
//                } else if (search < res.get(mid)){
//                    if(mid==size-1 || search > res.get(mid+1)){
//                        System.out.println(mid+2);
//                        break;
//                    }
//                    else
//                        start = mid + 1;
//                }
//                else {
//                    if(mid == 0 || search < res.get(mid-1)){
//                        System.out.println(mid+1);
//                        break;
//                    }
//                    else
//                        end = mid - 1;
//                }
//                mid = (start + (end-start)/2);
//            }
//        }


//        for (int i = 0; i < player.size(); i++) {
//            List<Integer> testList = new ArrayList<>(demoRanked);
//            testList.add(player.get(i));
//            Collections.sort(testList);
//            Collections.reverse(testList);
//            LinkedHashSet set = new LinkedHashSet<>();
//            for (Integer elem:testList) {
//                set.add(elem);
//                if(set.contains(player.get(i))) {
//                    System.out.println(set.size());
//                    break;
//                }
//            }
////            List res = (List) demoRanked.stream().distinct().collect(Collectors.toList());
////            System.out.println(res.indexOf(player.get(i))+1);
        sc.close();
    }
}


