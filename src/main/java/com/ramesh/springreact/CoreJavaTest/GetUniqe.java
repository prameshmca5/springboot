package com.ramesh.springreact.CoreJavaTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetUniqe {
    public static void main(String[] args) {
        // Program 1
        List<Integer> intArr = Arrays.asList(1,2,3,4,5,1,2,3,4,5);
        List<Integer> convList = intArr.stream().distinct().collect(Collectors.toList());
        System.out.println(convList);

        // Anagram Program
        
    }

}
