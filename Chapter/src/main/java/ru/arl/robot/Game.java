package ru.arl.robot;

public class Game {
    public static void main(String[] args) {
        int boardSizeX = 10;
        int boardSizeY = 10;
        Board board = new Board(boardSizeX, boardSizeY);
        Robot robot = board.getRobot();
        System.out.printf("Доска размером %dx%d создана. \n", boardSizeX, boardSizeY);
        System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", robot.getX(),robot.getY());
        System.out.println("Введите команду из списка:"+ '\n' + "Вверх, Вниз, Вправо, Влево, Конец");

        Joystick joystick = new Joystick();
        for(;;) {
            final Command userCommand = joystick.getUserCommand();
            switch (userCommand) {
                case QUIT: return;
                case UNKNOWN:
                    System.out.println("Неизвестная команда");
                    break;
                case UP:
                    System.out.println("Робот шагает вверх");
                    try {
                        robot.goUp();
                    } catch (OutOfBorderException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case DOWN:
                    System.out.println("Робот шагает вниз");
                    try {
                        robot.goDown();
                    } catch (OutOfBorderException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case LEFT:
                    System.out.println("Робот шагает влево");
                    try {
                        robot.goLeft();
                    } catch (OutOfBorderException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case RIGHT:
                    System.out.println("Робот шагает вправо");
                    try {
                        robot.goRight();
                    } catch (OutOfBorderException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", robot.getX(),robot.getY());
        }

//        System.out.println("Робот шагает вверх");
//        robot.goUp();
//        System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", robot.getX(),robot.getY());
//        System.out.println("Робот шагает");
//        robot.goDown();
//        robot.goLeft();
//        System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", robot.getX(),robot.getY());
    }
}
