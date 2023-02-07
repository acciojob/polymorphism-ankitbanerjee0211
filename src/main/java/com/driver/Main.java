package com.driver;

public class Main {
    class Product{
        public int product(int x, int y) {
            return x*y;
        }
    
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        
        public double product(double x, double y) {
            double pro = x*y;
            return pro;
        }
    }
    
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(2, 5));
        System.out.println(p.product(2, 5, 10));
        System.out.println(p.product(1.2, 5.5));
    }
}
