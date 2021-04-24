package com.lesson33;

public class Main {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.encrypt("STEPANENKO ANTON", 25);
        System.out.println();
        coder.decrypt("RSDOZMDMJN ZMSNM", 25);
    }
}
