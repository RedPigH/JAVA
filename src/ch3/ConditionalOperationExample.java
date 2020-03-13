package ch3;
/*
삼항연산자
세개의 피연산자를 필요로하는 연산(조건식, 피연산자, 피연산자)
? 앞의 조건식에 따라 : 앞뒤의 피연산자가 선택됨
조건식이 true라면 콜론(:) 앞에 있는 피연산자가 조건식의 결과가 되고
false라면 뒤에있는 피연산자가 조건식의 결과가 된다
*/

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grede = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grede + "등급입니다.");
    }
}
