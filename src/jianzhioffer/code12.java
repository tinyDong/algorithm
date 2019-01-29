package jianzhioffer;

public class code12 {
    public static void main(String[] args) {

    }

    public static double Power(double base, int exponent) {

        if (exponent == 0){
            return 1.0;
        }else if (exponent<0){
            return powerWithExponent(1/base,-exponent);
        }else {
            return powerWithExponent(base,exponent);
        }
    }

    public static double powerWithExponent(double base, int exponent) {
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

}
