package com.company;

public class App {
    /**
     * This method takes in two int parameters to add.
     */
    private static int sum2(int num1, int num2){
        return num1 + num2; }
    /**
     * This method takes in 3 int parameters to add.
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3; }

        /**
         * modifying methods to computeSum()
         */
        private static int computeSum(int num1, int num2) {
            return num1 + num2;
        }

        private static int computeSum(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }
        /**
         * method to return greater int value
         */
        public static int greaterValue(int Num1, int Num2) {

            if (Num1 > Num2) {
                return Num1;
            } else {
                return Num2;
            }
        }
        /**
         * method to return greater double value
         */
        public static double greaterValue(double Num1, double Num2) {

            if (Num1 > Num2) {
                return Num1;
            } else {
                return Num2;
            }
        }

        public static void main(String[] args) throws Exception {
            System.out.println("Hello, World!");
            /**
             * using overloading
             */

            System.out.println("Sum of two numbers 43 and 67: " + computeSum(43, 67));
            System.out.println("Sum of three numbers 25, 45 , 30: " + computeSum(25, 45, 30));
            System.out.println("================================================");
            /**
             * Call the greaterValue method with integer parameters
             */
            System.out.println("The greater value between 50 and 100 is " + greaterValue(50,100));

            /**
             * Call the greaterValue method with double parameters
             */
            System.out.println("The greater value between 6.2 and 2.6 is " + greaterValue(6.2,2.6));

        }
}

