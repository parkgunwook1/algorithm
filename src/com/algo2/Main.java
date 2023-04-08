package com.algo2;

import java.util.Scanner;

public class Main { // 1316번 그룹 단어 체커

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = in.next();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i); //i 번째 문자 저장

            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {

                //해당 문자가 처음 나오는경우 (false 인 경우)
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;      //true로 바꿔준다.
                    prev = now;                   // 다음 턴을 위해 prev 도 바꿔준다.
                }
                //해당 문자가 이미 나온적이 있는 경우 (그룹단어 X)
                else {
                    return false; //함수종료
                }
            }
            //앞선 문자와 i번째 문자가 같다면? (연속된 문자)
            else {
                continue;
            }
        }return true;
    }
}

