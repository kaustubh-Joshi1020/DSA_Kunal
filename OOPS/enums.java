package com.kj;

public class enums {

        enum Months{
                jan, feb, mar, apr, may, june, july, aug, sept, oct, nov, dec
        }

        public static void main(String[] args) {
                Months obj ;
                obj = Months.jan;
                System.out.println(obj);

        }
}
