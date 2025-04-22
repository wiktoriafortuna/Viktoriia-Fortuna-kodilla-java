package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
@DisplayName("ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {


        private ShapeCollector collector;

        @BeforeEach
        void setUp() {
            collector = new ShapeCollector();
        }

        @Nested
        @DisplayName("Tests for addShape() method")
        class AddShapeTests {
            @Test
            @DisplayName("Should add a shape to the collector")
            void testAddShape() {
                Shape square = new Square(4.0);

                collector.addShape(square);
                assertEquals(square, collector.getShape(0));
            }
        }

        @Nested
        @DisplayName("Tests for removeShape() method")
        class RemoveShapeTests {
            @Test
            @DisplayName("Should remove a shape successfully")
            void testRemoveExistingShape() {
                Shape circle = new Circle(2.5);
                collector.addShape(circle);

                boolean removed = collector.removeShape(circle);

                assertTrue(removed);
                assertNull(collector.getShape(0));
            }

            @Test
            @DisplayName("Should return false when removing a shape not in the list")
            void testRemoveNonExistingShape() {
                Shape triangle = new Triangle(3.0, 5.0);
                boolean removed = collector.removeShape(triangle);

                assertFalse(removed);
            }
        }

        @Nested
        @DisplayName("Tests for getShape() method")
        class GetShapeTests {
            @Test
            @DisplayName("Should return shape at given index")
            void testGetShapeByIndex() {
                Shape triangle = new Triangle(2, 3);
                collector.addShape(triangle);

                Shape result = collector.getShape(0);
                assertEquals(triangle, result);
            }

            @Test
            @DisplayName("Should return null for invalid index")
            void testGetShapeInvalidIndex() {
                Shape result = collector.getShape(10);
                assertNull(result);
            }
        }

        @Nested
        @DisplayName("Tests for getAllShapeNames() method")
        class GetAllShapeNamesTests {
            @Test
            @DisplayName("Should return all shape names as one string")
            void testGetAllShapeNames() {
                collector.addShape(new Circle(1.0));
                collector.addShape(new Square(2.0));
                collector.addShape(new Triangle(3.0, 4.0));

                String names = collector.getAllShapeNames();
                assertEquals("Circle Square Triangle", names);
            }

            @Test
            @DisplayName("Should return empty string when no shapes are in the list")
            void testGetAllShapeNamesEmptyList() {
                String names = collector.getAllShapeNames();
                assertEquals("", names);
            }
        }
    }


