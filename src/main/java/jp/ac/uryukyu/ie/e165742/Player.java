package jp.ac.uryukyu.ie.e165742;


import java.util.Scanner;

/**
 * Created by e165742 on 2017/02/06.
 */
public class Player {
    int good = 0, near = 0, count = 0, input[];

    public void Input() {
        good=0;
        near=0;
        input = new int[5];
        System.out.println("数値を入力して下さい。");

        Scanner scan = new Scanner(System.in);

        System.out.print("input[0] ： ");
        input[0] = scan.nextInt();

        System.out.print("input[1] ： ");
        input[1] = scan.nextInt();

        System.out.print("input[2] ： ");
        input[2] = scan.nextInt();

        System.out.print("input[3] ： ");
        input[3] = scan.nextInt();

        System.out.print("input[4] ： ");
        input[4] = scan.nextInt();


    }

    public void judge(int[] answer) {
        count++;
        System.out.println("*** " + count + "回目 ***");
        //答えの判断
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[i] == answer[j]) {
                    if (j == i) {
                        good++;
                    } else {
                        near++;
                    }
                }
            }
        }
        System.out.println("good = "+ good + "  near = "+ near + "\n\n\n\n\n");

    }
    public int getGood() {return good;}
}
