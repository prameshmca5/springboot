package com.ramesh.springreact.CoreJavaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class arrayCollection {

    public static void main(String[] args) {

        List<Integer> lstArr = Arrays.asList(1,2,3,4,5,6,2,1,3,4,2,3,4,4);
        Map<Integer, Long> getList = lstArr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(getList);

        List<String> lstStr = Arrays.asList("Ramesh", "Kavin", "Muhamad", "Ramesh", "Kannan");
        Map<String, Long> strLst = lstStr.stream().filter(s->s.equals("Ramesh")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(strLst);
    }
}
