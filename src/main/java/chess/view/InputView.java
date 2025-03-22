package chess.view;

import chess.Location;
import chess.piece.Bishop;
import chess.piece.King;
import chess.piece.Piece;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InputView {
    private final static Scanner SCANNER = new Scanner(System.in);
    public static void printBoard(List<Piece> white, List<Piece> black) {
        String[][] board = new String[8][8];
        System.out.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7");

        for (Piece piece : white) {
            int row = piece.getLocation().getX();
            int col = piece.getLocation().getY();

            board[row][col] = piece.getName() + " | ";
        }

        for (Piece piece : black) {
            int row = piece.getLocation().getX();
            int col = piece.getLocation().getY();

            board[row][col] = piece.getName() + " | ";
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    board[i][j] = "  | ";
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static Location getWantToMovePieceLocation(Boolean isWhiteTurn) {
        if (isWhiteTurn) {
            System.out.println("화이트 차례입니다.");
        }

        if (!isWhiteTurn) {
            System.out.println("블랙 차례입니다.");
        }

        System.out.println("움직일 기물의 위치를 입력해 주세요.");
        return getLocation(isWhiteTurn);
    }

    public static Location getWantToMovePieceDestination(Boolean isWhiteTurn) {
        System.out.println("해당 기물의 목적지를를 입력해 주세요.");
        return getLocation(isWhiteTurn);
    }

    private static Location getLocation(Boolean isWhiteTurn) {
        try {
            String location = getUserInput();
            String[] rowAndCol = location.split(",");
            int row = parseInt(rowAndCol[0]);
            int col = parseInt(rowAndCol[1]);
            return new Location(row, col);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getWantToMovePieceLocation(isWhiteTurn);
        }
    }

    private static int parseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 좌표 값은 숫자만 입력해 주세요.");
        }
    }

    public static String getUserInput() {
        return SCANNER.nextLine();
    }
}
