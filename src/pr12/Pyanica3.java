package pr12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pyanica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] cards = input.split(" ");

        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();


        for (int i = 0; i < 5; i++) {
            player1.addFirst(Integer.parseInt(cards[i].substring(0, 1)));
            player2.addFirst(Integer.parseInt(cards[i + 5].substring(0, 1)));
        }

        int moves = 0;
        while (moves <= 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.removeLast();
            int card2 = player2.removeLast();

            if (card1 > card2) {
                player1.addFirst(card2);
                player1.addFirst(card1);
            } else {
                player2.addFirst(card1);
                player2.addFirst(card2);
            }

            moves++;
        }

        if (player1.isEmpty() && !player2.isEmpty()) {
            System.out.println("second " + moves);
        } else if (!player1.isEmpty() && player2.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("botva");
        }
    }
}

