import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.lang.System.in;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for(int g=0; g<grades.size(); g++){
            Integer rem = grades.get(g) %5;
            if(grades.get(g) < 38 || rem == 0)
                continue;
            else{
                if(Arrays.asList(0, 4, 3).contains(rem))
                    grades.set(g, grades.get(g)+(5-rem));
            }
        }
        return grades;
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        result.forEach(res-> System.out.print(res+","));

        bufferedReader.close();
    }
}
