package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    void testOddNumbersExterminatorEmptyList() {
//        Given
        List<Integer>actual=new ArrayList<>();

//       when
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer>result=oddNumbersExterminator.exterminate(actual);


//        Then
        Assertions.assertEquals(List.of(),result);
    }


    @DisplayName("test testujacy usuwanie liczb nieparzystych z listy"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
//       Given
        List<Integer>actual=new ArrayList<>();

        actual.add(2);
        actual.add(5);

//       when
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer>result=oddNumbersExterminator.exterminate(actual);


//        Then
        Assertions.assertEquals(List.of(2),result);
    }

}
