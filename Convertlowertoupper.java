package stringprograms;

import java.util.Scanner;

public class Convertlowertoupper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    String str1=str.toUpperCase();
    System.out.println(str1);
}
}
