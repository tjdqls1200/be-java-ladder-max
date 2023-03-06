package kr.codesquad;

import java.util.Scanner;

public class Screen {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputPlayerNumber() {
        System.out.println("참여할 사람은 몇 명인가요?");

        return scanner.nextInt();
    }

    public static int inputLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");

        return scanner.nextInt();
    }

    public static void printLadderMap(String ladderMap) {
        System.out.println(ladderMap);
    }
}
