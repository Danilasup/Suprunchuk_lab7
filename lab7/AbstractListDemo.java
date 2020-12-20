package ru.mirea.gib04.lab7;

import java.util.*;

public class AbstractListDemo {
    public static void main(String args[]) {

        AbstractList<String>
                list = new LinkedList<String>();

        list.add("Danila");
        list.add("Elvin");
        list.add("228");
        list.add("1337");

        System.out.println("AbstractList: " + list);
    }
}