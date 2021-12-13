package com.greenfoxacademy;

import com.greenfoxacademy.printable.*;

import java.util.ArrayList;
import java.util.List;

public class PrintableMain {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();

        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 6));
        dominoes.add(new Domino(1, 2));

        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("Buy milk", "High", true));
        todoList.add(new Todo("Empty trash", "Medium", true));
        todoList.add(new Todo("Read a book", "Low", false));

        for (Domino domino : dominoes) {
            domino.printAllFields();
        }

        for (Todo todo : todoList) {
            todo.printAllFields();
        }
    }
}
