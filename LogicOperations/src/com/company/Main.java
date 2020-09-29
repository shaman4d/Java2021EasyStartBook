package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean a = true;
	    boolean b = false;
	    boolean c = true;
	    boolean d = false;
	    boolean result1 = a && b;
        System.out.println("result1:" + result1);
	    boolean result2 = a && c;
        System.out.println("result2:" + result2);

		boolean result3 = a || b;
		System.out.println("result3:" + result3); // результат: true
		boolean result4 = d || b;
		System.out.println("result4:" + result4); // результат: false
		boolean result5 = b || d || a;
		System.out.println("result5:" + result5); // результат: true

		boolean result6 = a ^ b;
		System.out.println("result6:" + result6); // результат: true
		boolean result7 = a ^ c;
		System.out.println("result7:" + result7); // результат: false

		boolean result8 = !a;
		System.out.println("result8:" + result8); // результат: false
		boolean result9 = !b;
		System.out.println("result9:" + result9); // результат: true
    }
}
