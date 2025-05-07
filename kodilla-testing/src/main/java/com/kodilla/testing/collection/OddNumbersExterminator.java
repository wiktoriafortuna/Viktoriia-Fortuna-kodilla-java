package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer>parzyste=new ArrayList<>();

        for(Integer liczba:numbers){
            if(liczba%2==0){
                parzyste.add(liczba);
            }

        }
        return parzyste;

    }
}
