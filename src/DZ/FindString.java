package DZ;

public class FindString {
    public static void main(String[] args) {

        String str = """
            The String class represents character strings.
            All string literals in Java programs, such as \\"abc\\",
            are implemented as instances of this class.
            HTTPS://DOCS.ORACLE.COM/JAVASE/8/DOCS/API/JAVA/LANG/STRING.HTML
            Read more about class String at the Oracle website...
            HTTPS://DOCS.ORACLE.COM/EN/JAVA/INDEX.HTML";
            """;

        // 1. Знайти та отримати підрядки адрес сайтів
        System.out.println("Адреси сайтів у нижньому регістрі:");
        extractAndPrintUrls(str);

        // 2. Знайти усі входження підрядка "String"
        System.out.println("\nПозиції підрядка 'String' з урахуванням регістру:");
        findSubstringPositions(str, "String", false);

        System.out.println("\nПозиції підрядка 'String' незалежно від регістру:");
        findSubstringPositions(str, "String", true);
    }

    // Метод для отримання підрядків адрес сайтів
    private static void extractAndPrintUrls(String str) {
        String lowerCaseStr = str.toLowerCase();
        int start = 0;
        while ((start = lowerCaseStr.indexOf("https://", start)) != -1) {
            int end = lowerCaseStr.indexOf( "\n", start);
            if (end == -1) {
                end = lowerCaseStr.length();
            }
            System.out.println(lowerCaseStr.substring(start, end));
            start = end;
        }
    }

    // Метод для знаходження позицій підрядка "String"
    private static void findSubstringPositions(String str, String target, boolean ignoreCase) {
        int length = target.length();
        for (int i = 0; i <= str.length() - length; i++) {
            if (str.regionMatches(ignoreCase, i, target, 0, length)) {
                System.out.println("Знайдено підрядок на позиції: " + i);
            }
        }
    }
}


