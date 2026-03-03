import java.util.HashMap;
import java.util.Map;

public class UC7 {

    // Static Inner Class to encapsulate character and its pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    private static final Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

    static {
        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        }));

        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
                " ****",
                "**   ",
                "**   ",
                " *** ",
                "   **",
                "   **",
                "**** "
        }));
    }

    public static void main(String[] args) {

        String banner = "OOPS";
        StringBuilder output = new StringBuilder();

        for (int row = 0; row < 7; row++) {
            for (int i = 0; i < banner.length(); i++) {
                CharacterPatternMap cp = patternLibrary.get(banner.charAt(i));
                if (cp != null) {
                    output.append(cp.getPattern()[row]).append("  ");
                }
            }
            output.append("\n");
        }

        System.out.println(output.toString());
    }
}