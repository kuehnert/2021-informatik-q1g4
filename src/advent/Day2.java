import java.util.List;

public class Day2 {
    public static void part1() {
        List<String> commands = Util.loadStringList("day2.txt");
        int x = 0;
        int depth = 0;

        for (String command : commands) {
            String[] parts = command.split(" ");
            int n = Integer.parseInt(parts[1]);

            switch (parts[0]) {
                case "forward":
                    x += n;
                    break;
                case "down":
                    depth += n;
                    break;
                case "up":
                    depth -= n;
                    break;
                default:
                    System.err.println("Error!");
            }
        }

        System.out.println("x: " + x);
        System.out.println("depth: " + depth);
        System.out.println("prod: " + depth * x);
    }

    public static void part2() {
        List<String> commands = Util.loadStringList("day2.txt");
        int horizontal = 0;
        int depth = 0;
        int aim = 0;

        for (String command : commands) {
            String[] parts = command.split(" ");
            int n = Integer.parseInt(parts[1]);

            switch (parts[0]) {
                case "forward":
                    horizontal += n;
                    depth += aim * n;
                    break;
                case "down":
                    aim += n;
                    break;
                case "up":
                    aim -= n;
                    break;
                default:
                    System.err.println("Error!");
            }

            System.out.println("aim: " + aim);
            System.out.println("horizontal: " + horizontal);
            System.out.println("depth: " + depth);
            System.out.println("------------------------");
        }

        System.out.println("prod: " + depth * horizontal);
    }

    public static void main(String[] args) {
        part2();
    }
}
