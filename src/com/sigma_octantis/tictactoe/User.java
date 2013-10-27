package com.sigma_octantis.tictactoe;

/**
 * Created with IntelliJ IDEA.
 * User: aili
 * Date: 23.10.13
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
public class User {

    public User addUser() {
        return new User();
    }

    public void makeStep(Character character, int x, int y) {
        Cell cell = new Cell();
        cell.setType(character);
        Table.setCell(x, y);
    }
}