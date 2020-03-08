package ch2;
/*
Casting시 주의할점
변환할 값의 손실이 발생하면 안되므로 타입 변환 후에도 값의 손실이 발생하지 않는지 검사하여야 함

각 타입별 최대값, 최소값 상수
최대값 상수 : 타입.MAX_VALUE
최소값 상수 : 타입.MIN_VALUE
*/

public class CheckValueBeforeCasting {
    public static void main(String[] args) {
        int i = 128;

        if((i<Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)){
            System.out.println("Byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인해 주세요");
        }else{
            byte b = (byte) i;
            System.out.println(b);
        }
    }
}
