package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;
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
        List<Integer>emptyList=new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
//        When
        List<Integer> result= oddNumbersExterminator.exterminate(emptyList);
//        Then
        Assertions.assertEquals(0,result.size());
    }
//

    @DisplayName("test testujacy usuwanie liczb nieparzystych z listy"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer>emptyList=new ArrayList<>();
        emptyList.add(1);
        emptyList.add(2);
        emptyList.add(3);
        emptyList.add(4);
        emptyList.add(5);

        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        List<Integer> result= oddNumbersExterminator.exterminate(emptyList);
        Assertions.assertEquals(2,result.size());
    }
//

}
