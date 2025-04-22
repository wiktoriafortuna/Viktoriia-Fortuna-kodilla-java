package com.kodilla.testing.shape;

    public class Triangle implements Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public String getName() {
            return "Triangle";
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }
    }


