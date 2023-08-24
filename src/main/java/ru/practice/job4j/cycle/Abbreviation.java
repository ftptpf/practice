package ru.practice.job4j.cycle;

public class Abbreviation {
    public static String collect(String s) {
        s = "Chief Executive Officer";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i - 1) == ' ') {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}
