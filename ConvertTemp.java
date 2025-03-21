/**
*   question : 2469. Convert the Temperature
*/

import java.util.Arrays;

public class ConvertTemp{
    public static void main(String[] args){
        System.out.print(Arrays.toString(convertTemperature(36.50)));
    }
    static public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}