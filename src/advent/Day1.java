import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1 {
    public static void part1() {
        int[] data = Util.loadIntArray("day1.txt");
        int count = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i-1] < data[i]) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void part2() {
        int[] data = Util.loadIntArray("day1.txt");
        int[] avgs = new int[data.length-2];
        int count = 0;

        for (int i = 2; i < data.length; i++) {
            avgs[i-2] = (data[i-2] + data[i-1] + data[i]);
        }

        for (int i = 1; i < avgs.length; i++) {
            if (avgs[i-1] < avgs[i]) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        part2();
    }
}
