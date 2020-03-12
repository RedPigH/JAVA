package ch3;

/*
NaN과 실수 연산을 수행하면 반드시 NaN이 되어 데이터가 엉망이된다
문자열을 입력받을 때에는 반드시 NaN인지 조사하고 만약 NaN이라면 산술연산을 수행해서는 안된다.
*/

public class InputDataCheckNaNExample1 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        currentBalance += val;

        System.out.println(currentBalance);
    }
}
