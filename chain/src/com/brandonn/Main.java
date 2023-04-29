package com.brandonn;

import com.brandonn.logic.ChainBO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChainBO chainBO;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the input");
        String input = scanner.nextLine();
        System.out.println("Input: " + input);
        chainBO = new ChainBO(input);
        chainBO.printAllMethodsFacade();
    }
}
