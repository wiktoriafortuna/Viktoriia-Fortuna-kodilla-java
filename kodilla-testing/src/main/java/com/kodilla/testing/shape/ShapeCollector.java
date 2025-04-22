package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


        private List<Shape> shapes;

        public ShapeCollector() {
            this.shapes = new ArrayList<>();
        }

        public void addShape(Shape shape) {
            shapes.add(shape);
        }

        public boolean removeShape(Shape shape) {
            return shapes.remove(shape);
        }

        public Shape getShape(int index) {
            if (index >= 0 && index < shapes.size()) {
                return shapes.get(index);
            }
            return null;
        }

        public String getAllShapeNames() {
            StringBuilder names = new StringBuilder();
            for (Shape shape : shapes) {
                names.append(shape.getName()).append(" ");
            }
            return names.toString().trim();
        }
    }


