package jp.ac.uryukyu.ie.e165742;

/**
 * Created by e165742 on 2017/02/06.
 */
public class main {
    public static void main(String[] args) {
        //変数の初期化。
        /*必要な変数
         * タイトル、ルール文、答えの格納される配列、
         * 入力された数字の格納される配列。
         * ヒット数、ブロー数、チャレンジの回数
         */
        String title = "*** CodeBreaker ***";// タイトル
        String rule = "隠された5つの数字をあてます。\n"
                + "1つの数字は0から9の間です。\n"
                + "5つの答えの中に同じ数字はありません。\n"
                + "入力した数字の、"
                + "位置と数字が当たってたらgood、\n"
                + "数字だけあってたらnearとカウントします。\n"
                + "全部当てたら(5つともgoodになったら)"
                + "終了です\n\n";
        //タイトルとルールの表示
        System.out.println(title);
        System.out.println(rule);

        Answer answer = new Answer();
        Player player = new Player();


        while (player.getGood() < 5) {
            player.Input();
            player.judge(answer.getAnswer());
        }
        System.out.println("\\\\\\こんぐらんちゅれいしょんず///");



    }
}
