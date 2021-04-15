package com.silnov.thinkingjavaexercises.chapter12.exercise26;

import java.util.*;
import java.nio.file.*;

public class MainException {
    // Pass exceptions to the console:
    private static String fileInExercisePath = "Exercise26/src/com/silnov/thinkingjavaexercises/exercise26/";
    private static String exercisePath = System.getProperty("user.dir") + "/";

    public static void main(String[] args) throws Exception {
        // Open the file:
        List<String> lines = Files
                .readAllLines(Paths.get(exercisePath + fileInExercisePath + "MainException.java" + "removreIt"));
        // Use the file ...
    }
}