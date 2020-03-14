package ch4;
/*
Math.random() 메소드는 0.0과 1.0사이에 속하는 double 타입의 난수 하나를 리턴
*/

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) +1;

        if(num == 1) {
            System.out.println("1번이 나왓습니다");
        }else if(num == 2){
            System.out.println("2번이 나왓습니다");
        }else if(num == 3){
            System.out.println("3번이 나왓습니다");
        }else if(num == 4){
            System.out.println("4번이 나왓습니다");
        }else if(num == 5){
            System.out.println("5번이 나왓습니다");
        }else{
            System.out.println("6번이 나왓습니다");
        }
    }
}
