package com.kodilla.testing.shape;


    public class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public String getName() {
            return "Square";
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }


