package ch3;

public class InputDataCheckNaNExample2 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        if(Double.isNaN(val)){
            System.out.println("NaN이 입력되어 처리 불가");
            val = 0.0;
        }

        currentBalance += val;

        System.out.println(currentBalance);
    }
}
