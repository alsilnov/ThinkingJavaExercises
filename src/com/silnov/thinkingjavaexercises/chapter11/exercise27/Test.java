package com.silnov.thinkingjavaexercises.chapter11.exercise27;

import java.nio.file.*;
import java.util.*;

/**
 * Command
 */
class Command {
    static long count = 0;
    String str;

    Command() {
        ++count;
        str = count + " ";
    }

    void operation() {
        System.out.print(str);
    }
}

/**
 * CommandUser
 */
class CommandBuilder {
    Queue<Command> make() {
        Queue<Command> com = new LinkedList<Command>();
        for (int i = 1; i < 10; ++i) {
            com.offer(new Command());
        }
        return com;
    }
}

/**
 * Test
 */
public class Test {
    static void commandUse(Queue<Command> com) {
        for (Command c : com) {
            c.operation();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CommandBuilder comB = new CommandBuilder();
        commandUse(comB.make());
    }
}