package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title) { //
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        String answer = scanner.nextLine();
        return answer;    }//String scanner metodu

    public static int requireNumber(String title) { // int scanner metodu
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        int answer = scanner.nextInt();
        return answer;    }
}
