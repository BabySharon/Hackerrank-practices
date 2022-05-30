import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> ids = Arrays.stream(sc.nextLine().split(" ")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
        Map<Integer, Integer> idMap = new HashMap<>();
        int maxValue = 0, maxKey = ids.get(0);
        Collections.sort(ids);
        for (int id : ids) {
            if(idMap.keySet() != null && idMap.keySet().contains(id)){
                int value = idMap.get(id);
                idMap.put(id, ++value);
                if(maxValue < value) {
                    maxValue = value;
                    maxKey = id;
                }
            }
            else
                idMap.put(id, 1);
        }
        System.out.println(maxKey);
    }
}
