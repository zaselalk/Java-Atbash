public class Atbash {
    public static void main(String[] args) {
        String text = convert("Asela");
        System.out.println(text);
        System.out.println(convert(text));
    }

    public static String convert(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (!Character.isLetter(c)) {
                sb.append(c);
                continue;
            }

            if (Character.isUpperCase(c)) {
                sb.append((char) ('Z' - (c - 'A')));
            } else {
                sb.append((char) ('z' - (c - 'a')));
            }
        }

        return sb.toString();
    }
}
