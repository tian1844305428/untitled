package com;

import java.util.Scanner;

public class MoneyTest {

    public static void main(String[] args) {


        while (true) {
            System.out.println("请选择对应的题");
            Scanner sc = new Scanner(System.in);
            //苹果的斤数
            Scanner sca = new Scanner(System.in);
e
            //草莓的斤数
            Scanner scr = new Scanner(System.in);
            //芒果的斤数
            Scanner maog = new Scanner(System.in);
            Title.title();
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    shuiguochushihua.chushi();
                    System.out.print("请输入对应苹果的斤数：");
                    int chageAP = sca.nextInt();
                    System.out.print("请输入对应草莓的斤数：");
                    int chageSC = scr.nextInt();
                    int total = chageAP * 8 + chageSC * 13;
                    System.out.println("总价为：" + total);
                    break;
                case 2:
                    shuiguochushihua.chushi1();
                    System.out.print("苹果");
                    System.out.print("请输入对应苹果的斤数：");
                    int chageAP2 = sca.nextInt();
                    System.out.print("请输入对应草莓的斤数：");
                    int chageSC2 = scr.nextInt();
                    System.out.print("请输入对应芒果的斤数：");
                    int mao2 = maog.nextInt();
                    int total2 = chageAP2 * 8 + chageSC2 * 13 + mao2 * 20;
                    System.out.println("总价为：" + total2);
                    break;
                case 3:
                    shuiguochushihua.chushi1();
                    System.out.print("苹果");
                    System.out.print("请输入对应苹果的斤数：");
                    int chageAP3 = sca.nextInt();
                    System.out.print("请输入对应草莓的斤数：");
                    int chageSC3 = scr.nextInt();
                    System.out.print("请输入对应芒果的斤数：");
                    int mao3 = maog.nextInt();
                    double total3 = chageAP3 * 8 + chageSC3 * 13 + mao3 * 20 * 0.08;
                    System.out.println("总价为：" + total3);
                    break;
                case 4:
                    shuiguochushihua.chushi1();

                    System.out.print("苹果");
                    System.out.print("请输入对应苹果的斤数：");
                    int chageAP4 = sca.nextInt();
                    System.out.print("请输入对应草莓的斤数：");
                    int chageSC4 = scr.nextInt();
                    System.out.print("请输入对应草莓的斤数：");
                    int mao4 = maog.nextInt();
                    int total4 = chageAP4 * 8 + chageSC4 * 13 + mao4 * 20;
                    if (total4 > 100) {
                        int total6 = total4 - 10;
                        System.out.println("总价为：" + total6);
                    } else {
                        System.out.println("总价为：" + total4);
                    }
                    break;
                default:
                    System.out.println("输入指令错误，请输入正确指令");
                    break;
            }
        }

    }
}
