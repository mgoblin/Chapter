package ru.arl.robot;

public class Game {
    public static void main(String[] args) {
        int boardSizeX = 10;
        int boardSizeY = 10;
        Board board = new Board(boardSizeX, boardSizeY);
        Robot robot = board.getRobot();
        System.out.printf("Доска размером %dx%d создана. \n", boardSizeX, boardSizeY);
        System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", robot.getX(),robot.getY());

        System.out.println("Робот шагает вверх");
        robot.goUp();
        System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", robot.getX(),robot.getY());
        System.out.println("Робот шагает");
        robot.goDown();
        robot.goLeft();
        System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", robot.getX(),robot.getY());
    }
}
