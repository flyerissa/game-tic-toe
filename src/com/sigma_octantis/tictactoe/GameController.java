package com.sigma_octantis.tictactoe;

import com.alla.com.alla.javastudy.study.tic_tac_toe.Table; /**
 * Created with IntelliJ IDEA.
 * User: aili
 * Date: 23.10.13
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
public class GameController {
    private static boolean win;

    public static boolean isWin() {
        return win;
    }

    public static boolean checkWin() {
        Table.getTable();
        return true;

    }
}
