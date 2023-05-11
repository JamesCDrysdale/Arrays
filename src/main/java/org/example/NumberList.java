package org.example;

import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers) {
        this.numbers = new ArrayList<>();
    }

    public int getNumberCount(){
        return this.numbers.size();
    }

    public void addNumber(int number){
        this.numbers.add(number);
    }

    public int getItemAtIndex(int index){
        return numbers.get(index);
    }

    public void clearNumbers(){
        numbers.clear();
    }

    public boolean findNumber(int numToFind){
        return numbers.contains(numToFind);
    }

    public int removeFromIndex(int index){
        return numbers.remove(index);
    }

//    USING A STANDARD FOR LOOP
//
//    public int getTotal(){
//        int total = 0;
//
//        for(int i = 0; i < getNumberCount(); i++){
//            total += getItemAtIndex(i);
//        } return total;
//    }

//    REFACTORED TO USE ENHANCED FOR LOOP
    public int getTotal(){
        int total = 0;

        for(int number : this.numbers ){
            total += number;
        } return total;
    }

}
