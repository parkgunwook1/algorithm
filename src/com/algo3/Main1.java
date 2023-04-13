package com.algo3;

import java.util.Scanner;

//두 정수 a와 b를 입력받은 다음, a+b를 출력하는 프로그램 작성
public class Main1 { //10951
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt()) {

            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
        in.close();
    }

}
