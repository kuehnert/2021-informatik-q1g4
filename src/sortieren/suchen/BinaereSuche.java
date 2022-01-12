package sortieren.suchen;

public class BinaereSuche {
    public BinaereSuche() {
        String[] namen = {"Constantin", "Jonas", "Patrick", "Robin", "Tim"};
        System.out.println(binaereSuche(namen, "Constantin"));
        System.out.println(binaereSuche(namen, "Jonas"));
        System.out.println(binaereSuche(namen, "Patrick"));
        System.out.println(binaereSuche(namen, "Robin"));
        System.out.println(binaereSuche(namen, "Tim"));
        System.out.println(binaereSuche(namen, "Gibsnich"));
    }

    public static int binaereSuche(String[] strings, String gesucht) {
        int links = 0;
        int rechts = strings.length - 1;

        while (links <= rechts) {
            int mitte = (links + rechts) / 2;
            int vergleich = strings[mitte].compareToIgnoreCase(gesucht);
            if (vergleich < 0) {
                links = mitte + 1;
            } else if (vergleich > 0) {
                rechts = mitte - 1;
            } else {
                return mitte;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        new BinaereSuche();
    }
}
