package chess.view;

import chess.Player;

public class OutputView {

    public static void printResult(Player whitePlayer) {
        if (whitePlayer.isKingDie()) {
            System.out.println("블랙 승리!");
            return;
        }
        System.out.println("화이트 승리!");
    }
}
