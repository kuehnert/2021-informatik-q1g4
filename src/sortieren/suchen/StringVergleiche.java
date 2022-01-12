package sortieren.suchen;

public class StringVergleiche {
    public StringVergleiche() {
        // 1. Vergleich: Ist "Romy" gleich "Jonas" !=> "Romy" == "Jonas"
        /*
        System.out.println("Romy" == "Tim");
        System.out.println("Romy" == "Romy");
        System.out.println("RomySchneider".substring(0,4));
        System.out.println("RomySchneider".substring(0,4) == "Romy");
         */
        System.out.println("Romy".equals("Tim"));
        System.out.println("RomySchneider".substring(0,4).equals("Romy"));

        // 2. Ist a vor oder nach b in alphabetischer Sortierung: Ist "Romy" vor "Jonas" im Alphabet?
        System.out.println("AAAA".compareTo("BBBB"));  // => -1   < 0
        System.out.println("BBBB".compareTo("AAAA"));  // => 1    > 0
        System.out.println("AAA".compareTo("AAA"));    // => 0   == 0
        System.out.println("AAA".compareTo("AAB"));    // => -1   < 0
        System.out.println("AAM".compareTo("AAA"));    // => 12   > 0
        System.out.println("BCBD".compareTo("AAAA"));  // =>  1   > 0

        // 3. Groß-Klein-Schreibung?
        System.out.println("Luca".equalsIgnoreCase("LUCA"));
        System.out.println("Öl".equalsIgnoreCase("OEL"));
        System.out.println("Luca".compareToIgnoreCase("LUCA"));
        System.out.println("Straße".compareToIgnoreCase("STRASSE"));
    }

    public static void main(String[] args) {
        new StringVergleiche();
    }
}
