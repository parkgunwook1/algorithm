package com.algo;

public class Work {
    boolean userState = false;
    //유저 로그인 상태 확인 값
    String session = new String();
    //현재 로그인한 유저의 정보를 담는 값

    Member[] users = new Member[10];
    //회원 저장하기위한 저장소
    int index = 0;
    //user 배열 데이터 갯수를 저장하는 변수

void register(String id, String pw) {
        Member user = new Member(id, pw);
        //회원가입시 아이디 패스워드를 소유한 user 객체 생성
        users[index++] = user;
        //유저 리스트에 방금 생성한 유저의 객체를 저장하고 index 값 1 늘린다.

        for (int i = 0; i < index; i++) {
            System.out.println(users[i].toString());
            //정상적으로 회원가입이 됐는지 확인하기 위해서 회원 리스트 출력한다.
        }
    }

void login(String id, String pw) {
        int pwIndex = 0;
        //ID가 존재할경우 해당 비밀번호를 검사하기 위한 저장소

        for (int i = 0; i < index; i++) {
            if (users[i].userId().equals(id)) {
                pwIndex = i;
                //사용자가 입력한 ID가 존재할경우 해당 순서를 저장

                if (users[pwIndex].userPw().equals(pw)) {
                    //사용자가 입력한 비밀번호가 해당 아이디 정보랑 같다면 실행
                    System.out.println("로그인 성공");

                    userCheck();
                    //로그인 상태를 true로 반환해준다.

                    session = id;
                    //현재 로그인한 유저의 정보를 session 에 저장한다.
                    //회원 탈퇴에 활용하기 위해서 저장

                    return;
                } else {
                    System.out.println("비밀번호가 틀립니다.");
                    return;
                }
            }
        }
    System.out.println("아이디가 없습니다.");
}
void userCheck() {
      userState = !userState;
      //로그인 체크를 해준다.
      //로그아웃 상태이면 로그인 상태로

    if(userState == false) {
        session = new String();
        //로그아웃일 경우 session 값을 비워준다.
    }
}
void withDraw() {
    //회원 탈퇴 기능 함수

    int gap = 0;
    //현재 로그인한 유저의 배열 위치를 담는 변수

    for(int i = 0; i < index; i++) {
        if(users[i].userId().equals(session)) {
            gap = i;
            //로그인한 유저의 정보를 담은 배열의 유저위치를 저장한다.
        }
    }
    for(int i = gap; i < index; i++) {
        users[gap] = users[gap + 1];
        //해당 유저의 배열을 다음 배열을 앞당겨 정보를 지우며 다음 정보 계속 앞당긴다.

    }
    index--;

    userCheck();
    }
}
