import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Inner Class to encapsulate character and its pattern
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Centralized Pattern Library
    private static final Map<Character, CharacterPattern> patternLibrary = new HashMap<>();

    // Static block to initialize patterns
    static {
        addPattern('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        });

        addPattern('P', new String[]{
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        });

        addPattern('S', new String[]{
                " ****",
                "**   ",
                "**   ",
                " *** ",
                "   **",
                "   **",
                "**** "
        });
    }

    // Method to add patterns to library
    private static void addPattern(char ch, String[] pattern) {
        patternLibrary.put(ch, new CharacterPattern(ch, pattern));
    }

    public static void main(String[] args) {

        String banner = "OOPS";
        printBanner(banner);
    }

    // Method to print banner
    public static void printBanner(String banner) {

        StringBuilder output = new StringBuilder();

        for (int row = 0; row < 7; row++) {
            for (int i = 0; i < banner.length(); i++) {

                CharacterPattern cp = patternLibrary.get(banner.charAt(i));

                if (cp != null) {
                    output.append(cp.getPattern()[row]).append("  ");
                } else {
                    output.append("      "); // space if pattern not found
                }
            }
            output.append("\n");
        }

        System.out.println(output);
    }
}