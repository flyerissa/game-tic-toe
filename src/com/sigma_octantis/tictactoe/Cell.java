package com.sigma_octantis.tictactoe;

/**
 * Created with IntelliJ IDEA.
 * User: aili
 * Date: 23.10.13
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
public class Cell {
    private Character type;

    public void setType(Character type) {
        if (type.equals('X') || type.equals('O')) {
            this.type = type;
        } else
            System.out.println("Enter X or O (capital letter o, not symbol) to continue.");
    }

    public Character getType() {
        return type;
    }
}
