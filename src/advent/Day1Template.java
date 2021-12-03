package advent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1Template {
    public static void part1() throws IOException {
        Path p = Paths.get("src/advent/day1.txt");
        List<String> stringList = Files.readAllLines(p, StandardCharsets.UTF_8);
        int[] data = new int[stringList.size()];

        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            data[i] = Integer.parseInt(s);
        }

        // Hier müssen Sie hin
    }

    public static void main(String[] args) throws IOException {
        part1();
    }
}
