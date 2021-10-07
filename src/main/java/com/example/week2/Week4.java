package com.example.week2;
public class Week4 {

    /**
     * Find max of two numbers.
     * @param a first number
     * @param b second number
     * @return max of $a and $b
     */

    public static int max2Int(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * Find min number in array.
     * @param arr array of numbers
     * @return min of array $arr
     */
    
    public static int minArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result < arr[i] ? result : arr[i];
        }
        return result;
    }

    /**
     * Calculate BMI.
     * @param weight in kg
     * @param height in m
     * @return BMI index
     */

    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (18.5 <= bmi && bmi < 23) {
            return "Bình thường";
        } else if (23 <= bmi && bmi < 25) {
            return "Thừa cân";
        } else if (bmi >= 25) {
            return "Béo phì";
        }
        return "";
    }
}