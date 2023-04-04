package com.algo;

public class Member { //회원 인적사항 관리하는 class
    private String id;
    private String pw;
    //외부에서 접근할 수 없도록 접근제어자 private을 줘 해당 클래스만 접근 가능

    Member(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }
    // Member 생성자 this 사용해 초기화

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[id: "+ id + "pw" + pw + "]";
        //toString 오버라이드 해서 객체를 문자열로 출력
    }
    public String userId() {
        return id;
    }
    public String userPw() {
        return pw;
    }
}
