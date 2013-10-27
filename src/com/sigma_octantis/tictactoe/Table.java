package com.sigma_octantis.tictactoe;

/**
 * Created with IntelliJ IDEA.
 * User: aili
 * Date: 23.10.13
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
public class Table {
    private static final int DEFAULT_TABLE_SIZE = 3;
    private static final char DEFAULT_CELL_VALUE = ' ';
    private static final char[][] table = new char[DEFAULT_TABLE_SIZE][DEFAULT_TABLE_SIZE];

    public static char[][] getTable() {
        return table;
    }

    public static void setCell(int x, int y) {
        Cell cell = new Cell();
        table[x][y] = cell.getType();
    }

    private static void showCell(int x, int y) {
        System.out.print("[" + table[x][y] + "]");
    }

    private static void showLine(int lineNumber) {
        for (int i = 0; i < DEFAULT_TABLE_SIZE; i++) {
            showCell(i, lineNumber);
        }
    }

    private static void eraseLine(int lineNumber) {
        for (int i = 0; i < DEFAULT_TABLE_SIZE; i++) {
            table[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    public static void eraseTable() {
        for (int i = 0; i < DEFAULT_TABLE_SIZE; i++) {
            eraseLine(i);
        }
    }

    public static void showTable() {
        System.out.println();

        for (int i = 0; i < DEFAULT_TABLE_SIZE; i++) {
            showLine(i);
            System.out.println();
        }
        System.out.println();

    }
}
