package exercises.homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkDay2 {
    static void homework2Ex3() {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = new ArrayList<>();
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.nextLine());
        List<String> newWords = new ArrayList<>();
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i).toCharArray().length <= 4) {
                newWords.add(wordsList.get(i));
            }
        }
        System.out.println(newWords);
    }

    static int homework2Ex2(int[] numbs) {
        int sum = 0;
        for (int element: numbs) {
            sum = sum + element;
        }
        return sum;
    }

    static void homework2Ex1() {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        System.out.println("Enter 5 words.");
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a word: ");
            words[i] = scanner.nextLine();
        }
        String temp;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0 ; j < words.length; j++) {
                if (words[i].charAt(0) == 'a') {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (String name : words) {
            System.out.println( name + " ");
        }
    }
}
