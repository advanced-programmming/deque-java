package com.co.pa;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque();
        deque.add("Hola");
        deque.add("mundo");
        deque.addFirst("Que viva");
        deque.addLast("Mexico cabrones");
        System.out.printf(deque.toString());
    }
}
