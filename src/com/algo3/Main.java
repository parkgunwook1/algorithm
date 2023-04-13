package com.algo3;

import java.util.Scanner;
// 두 정수 a와 b룰 입력받은 다음, a+b를 출력하는 프로그램을 작성
public class Main { //백준 10952번
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        while(true){

            int A=in.nextInt();
            int B=in.nextInt();

            if(A==0 && B==0){
                in.close();
                break;
            }
            System.out.println(A+B);
        }
    }
}