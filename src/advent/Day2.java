package advent;

import java.util.List;

public class Day2 {
    private int x = 0;
    private int z = 0;

    public Day2() {
        List<String> commands = Util.loadStringList("day2test.txt");

        for (String command : commands) {
            String[] parts = command.split(" ");
            int n = Integer.parseInt(parts[1]);

            switch (parts[0]) {
                case "forward": x+=n; break;
                case "down": z+=n; break;
                case "up": z-=n; break;
                default:
                    System.err.println("Error!");
            }
        }

        System.out.println("x: " + x);
        System.out.println("z: " + z);
        System.out.println("prod: " + z * x);
    }

    public static void main(String[] args) {
        new Day2();
    }
}
