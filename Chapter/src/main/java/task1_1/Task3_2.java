package task1_1;

import java.util.Scanner;
import java.util.Random;

public class Task3_2 {
    private static Random random = new Random();

    private static String getRandomWord(String[] words) {
        return words[random.nextInt(words.length - 1)];
    }


    private static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String word = getRandomWord(words);
        int lenWord = word.length();
        System.out.println("Я загадал фрукт, попробуй отгадать его");
        System.out.println(word);

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
            String answer = scanner.nextLine();

            if (answer.equals("")) {
                break;
            } else if (word.equals(answer)) {
                System.out.println("Вы угадали слово, игра закончена!!!");
                break;
            } else {
                char[] charMarks = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',};
                System.out.println(getHelp(answer,charMarks,word));
            }
        }
        while (true);
    }

    public char[] charMarks = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',};

    public static StringBuilder getHelp(String answer, char[] charMarks,String word){
        char[] charsAnswer = answer.toCharArray();
        for (int i = 0; i < charMarks.length; i++) {
            if (i >= charsAnswer.length) break;
            if (word.charAt(i) == charsAnswer[i]) charMarks[i] = charsAnswer[i];
            }
        StringBuilder mark = new StringBuilder();
        for (int i = 0; i < charMarks.length; i++) {
            mark.append(charMarks[i]);
        }
        return mark;
        }

    public static void main(String[] args) {
        guessWord();
    }
}
//переписать. Сначала решетки 15, потом заменить в них на буквы. Больше методов