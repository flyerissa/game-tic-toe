package com.sigma_octantis.tictactoe;

import com.alla.com.alla.javastudy.study.tic_tac_toe.GameController;import com.alla.com.alla.javastudy.study.tic_tac_toe.Table;import com.alla.com.alla.javastudy.study.tic_tac_toe.User; /**
 * Created with IntelliJ IDEA.
 * User: aili
 * Date: 23.10.13
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    public void startNewGame() {
        User player1 = new User();
        User player2 = new User();
        Table.eraseTable();
        Table.showTable();
    }

    public void stopGame() {
        if (GameController.checkWin()) {
            System.out.println("Game is over!");
        }
    }
}
