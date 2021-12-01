package advent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1 {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src/advent/day1.txt");
        List<String> stringList = Files.readAllLines(p, StandardCharsets.UTF_8);
        int[] data = new int[stringList.size()];
        System.out.println(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);

        }

        int count = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i-1] < data[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
