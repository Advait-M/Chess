/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 *
 * @author advai
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChessGame cgame = new ChessGame();
        System.out.println(cgame.getChessBoard().toString());
        System.out.println("---------------------");
        System.out.println("---------------");
        cgame.getChessBoard().placePieceAt(cgame.getChessBoard().getPieceAt(new Point (0, 0)), new Point(3, 0));
        
        cgame.getChessBoard().getPieceAt(new Point (0, 6)).updateThreateningLocations();
        cgame.getChessBoard().getPieceAt(new Point (0, 6)).printThreateningLocations();
        System.out.println("sadasdasdsadsadsda");
        System.out.println(cgame.getChessBoard().toString());
        try {
            cgame.getChessBoard().createGraphics(8, 8);
        } catch (IOException ex) {
            Logger.getLogger(Chess.class.getName()).log(Level.SEVERE, null, ex);
        }
//        ChessBoard gt = new ChessBoard();
//        try {
//            gt.chessBoard(8, 8);
//        } catch (IOException ex) {
//            Logger.getLogger(Chess.class.getName()).log(Level.SEVERE, null, ex);
//        }
        cgame.getChessBoard().getPieceAt(new Point (1, 1)).updateThreateningLocations();
        
//        cgame.getChessBoard().getPieceAt(new Point (1, 1)).updateMovableLocations();
        System.out.println("----");
        cgame.getChessBoard().getPieceAt(new Point (1, 1)).printThreateningLocations();
        System.out.println("----");
//        cgame.getChessBoard().getPieceAt(new Point (1, 1)).printMovableLocations();
        cgame.getChessBoard().graphics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cgame.getChessBoard().graphics.pack();
        cgame.getChessBoard().graphics.setVisible(true);
        
        
    }
    
}