public class CheckStringProperties {
    public static boolean isAlphabetic(String s) {
        return s.codePoints().allMatch(Character::isAlphabetic);
    }

    public static boolean isJavaIdentifier(String s) {
        return s.codePoints().allMatch(Character::isJavaIdentifierPart);
    }

    public static void main(String[] args) {
        System.out.println(isAlphabetic("Hello")); // true
        System.out.println(isAlphabetic("Hello123")); // false
        System.out.println(isJavaIdentifier("Hello")); // true
        System.out.println(isJavaIdentifier("123Hello")); // true
    }
}
