package ru.netology.javacore;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Todos {
    //...
    private static final int takSize = 7;
    private final Set<String> tasks = new TreeSet<>();

    public Set<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        //...
        if (tasks.size() < takSize) {
            tasks.add(task);
        }
    }

    public void removeTask(String task) {
        //...
        tasks.remove(task);
    }

    public String getAllTasks() {
        //...
        return tasks.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }

}