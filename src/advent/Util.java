import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Util {
    public static int[] loadIntArray(String filename) {
        List<String> stringList = loadStringList(filename);
        int[] data = new int[stringList.size()];

        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            data[i] = Integer.parseInt(s);
        }

        return data;
    }

    public static List<String> loadStringList(String filename) {
        try {
            Path p = Paths.get("./" + filename);
            return Files.readAllLines(p, StandardCharsets.UTF_8);
        } catch (IOException e) {
            return new ArrayList<String>();
        }
    }
}
