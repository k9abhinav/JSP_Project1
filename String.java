import java.nio.charset.Charset;
import java.util.*;

public class first {

    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = {'J', 'a', 'v', 'a'};
        StringBuffer stringBuffer = new StringBuffer("StringBuffer");

        System.out.println("charAt(1): " + str.charAt(1));

        System.out.println("codePointAt(1): " + str.codePointAt(1));

        System.out.println("codePointBefore(1): " + str.codePointBefore(1));

        System.out.println("codePointCount(0, 5): " + str.codePointCount(0, 5));

        System.out.println("compareTo(): " + str.compareTo("Hello"));

        System.out.println("compareToIgnoreCase(): " + str.compareToIgnoreCase("hello, world!"));

        System.out.println("concat():" + str.concat("!!"));

        System.out.println("contains: " + str.contains("World"));

        System.out.println("contentEquals(): " + str.contentEquals("Hello, World!"));

        System.out.println("contentEquals(new StringBuffer()): " + str.contentEquals(new StringBuffer("Hello, World!")));

        System.out.println("copyValueOf(charArray): " + String.copyValueOf(charArray));

        System.out.println("copyValueOf(charArray, 1, 2): " + String.copyValueOf(charArray, 1, 2));

        System.out.println("endsWith(): " + str.endsWith("!"));

        System.out.println("equals(): " + str.equals("Hello, World!"));

        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase("hello, world!"));

        // static String format(Locale l, String format, Object... args)
        System.out.println("format(): " + String.format(Locale.US, "Hello %s", "World"));

        System.out.println("format(): " + String.format("Hello %s", "World"));

        System.out.println("getBytes(): " + new String(str.getBytes()));

        System.out.println("getBytes(Charset.forName(\"UTF-8\")): " + new String(str.getBytes(Charset.forName("UTF-8"))));

        try {
            System.out.println("getBytes(\"UTF-8\"): " + new String(str.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        char[] dst = new char[5];
        str.getChars(0, 5, dst, 0);
        System.out.println("getChars(0, 5, dst, 0): " + new String(dst));

        System.out.println("hashCode(): " + str.hashCode());

        System.out.println("indexOf('o'): " + str.indexOf('o'));

        System.out.println("indexOf('o', 5): " + str.indexOf('o', 5));

        System.out.println("indexOf(\"World\"): " + str.indexOf("World"));

        System.out.println("indexOf(\"World\", 5): " + str.indexOf("World", 5));

        System.out.println("intern(): " + str.intern());

        System.out.println("isEmpty(): " + str.isEmpty());

        System.out.println("join(): " + String.join(", ", "one", "two", "three"));

        System.out.println("join(): " + String.join(", ", List.of("one", "two", "three")));

        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));

        System.out.println("lastIndexOf('o', 5): " + str.lastIndexOf('o', 5));

        System.out.println("lastIndexOf(\"World\"): " + str.lastIndexOf("World"));

        System.out.println("lastIndexOf(\"World\", 5): " + str.lastIndexOf("World", 5));

        System.out.println("length(): " + str.length());

        System.out.println("matches(): " + str.matches(".World."));

        // int offsetByCodePoints(int index, int codePointOffset)
        System.out.println("offsetByCodePoints(0, 5): " + str.offsetByCodePoints(0, 5));

        // boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        System.out.println("regionMatches(true, 0, \"hello,\", 0, 5): " + str.regionMatches(true, 0, "hello,", 0, 5));

        // boolean regionMatches(int toffset, String other, int ooffset, int len)
        System.out.println("regionMatches(0, Hello, 0, 5): " + str.regionMatches(0, "Hello,", 0, 5));

        // String replace(char oldChar, char newChar)
        System.out.println("replace('o', 'O'): " + str.replace('o', 'O'));

        // String replace(CharSequence target, CharSequence replacement)
        System.out.println("replace(World, Java): " + str.replace("World", "Java"));

        // String replaceAll(String regex, String replacement)
        System.out.println("replaceAll(World, Java): " + str.replaceAll("World", "Java"));

        // String replaceFirst(String regex, String replacement)
        System.out.println("replaceFirst(World, Java): " + str.replaceFirst("World", "Java"));

        String[] splitStr = str.split(",");
        System.out.println("split(,): " + String.join("|", splitStr));

        String[] splitStrLimit = str.split(",", 2);
        System.out.println("split(\",\", 2): " + String.join("|", splitStrLimit));

        System.out.println("startsWith(hello): " + str.startsWith("Hello"));

        System.out.println("startsWith(World, 7): " + str.startsWith("World", 7));

        System.out.println("subSequence(0, 5): " + str.subSequence(0, 5));

        System.out.println("substring(7): " + str.substring(7));

        System.out.println("substring(0, 5): " + str.substring(0, 5));

        System.out.println("toCharArray(): " + new String(str.toCharArray()));

        System.out.println("toLowerCase(): " + str.toLowerCase());

        System.out.println("toLowerCase(Locale.US): " + str.toLowerCase(Locale.US));

        System.out.println("toString(): " + str.toString());

        System.out.println("toUpperCase(): " + str.toUpperCase());

        System.out.println("toUpperCase(Locale.US): " + str.toUpperCase(Locale.US));

        System.out.println("trim(): " + "   Hello, World!   ".trim());

        System.out.println("valueOf(true): " + String.valueOf(true));

        System.out.println("valueOf('a'): " + String.valueOf('a'));

        System.out.println("valueOf(charArray): " + String.valueOf(charArray));

        System.out.println("valueOf(charArray, 1, 2): " + String.valueOf(charArray, 1, 2));

        System.out.println("valueOf(1.23): " + String.valueOf(1.23));

        System.out.println("valueOf(1.23f): " + String.valueOf(1.23f));

        System.out.println("valueOf(123): " + String.valueOf(123));

        System.out.println("valueOf(123L): " + String.valueOf(123L));

        System.out.println("valueOf(new Object()): " + String.valueOf(new Object()));
    }
}