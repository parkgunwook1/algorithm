package com.algo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[]args) throws IOException {
        //BufferdReader를 사용하기 위해서는 throws IOException 사용해야한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //readLine으로 받은 입력 데이터 String 이다.
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
