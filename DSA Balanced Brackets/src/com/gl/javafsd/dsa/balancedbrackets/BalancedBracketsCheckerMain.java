package com.gl.javafsd.dsa.balancedbrackets;

public class BalancedBracketsCheckerMain {

    public static void main(String[] args) {

        test("([[{}]])");

        test("([[{}]]))");

        test("");

        test("[]");

        test("[)");

        test("[[[]]]");

    }


    static void test(String brackets) {

        BalancedBracketsChecker checker = new BalancedBracketsChecker(brackets);

        boolean result = checker.check();
        if (result) {
            System.out.println("The entered String " + brackets + " has Balanced Brackets");
        } else {
            System.out.println("The entered String " + brackets + " do not contains Balanced Brackets");
        }
    }
}