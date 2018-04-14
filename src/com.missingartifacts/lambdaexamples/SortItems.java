package com.missingartifacts.lambdaexamples;

import java.util.*;
import java.util.stream.Collectors;


/*Item

Oranges, 14
Apples, 13
Lemon, 11
Cherry, 16
Pear, 13
Peach, 15
Banana, 14
Strawberry, 12
Melon, 9

please create a function which finds the elements with the 3rd highest cost*/

public class SortItems {
    public static void main(String args[]){
        Map<String, Double> items = getItems();
        String result = items.entrySet().stream()
                .filter(map -> findNthBiggestPrice(items.values(),3) == map.getValue())
                .map(map -> map.getKey())
                .collect(Collectors.joining(","));

        System.out.println(result);
    }

   public static double findNthBiggestPrice(Collection<Double> prices, int nthBiggest){
        List<Double> priceList = new ArrayList<>(new HashSet<>(prices));
        Collections.sort(priceList);
        return priceList.get(priceList.size()-nthBiggest);
    }

    public static Map<String, Double> getItems(){
        Map<String, Double> items = new HashMap<String,Double>();
        items.put("Oranges",14.0);
        items.put("Apples",13.0);
        items.put("Lemon", 11.0);
        items.put("Cherry", 16.0);
        items.put("Pear", 13.0);
        items.put("Peach", 15.0);
        items.put("Banana", 14.0);
        items.put("Strawberry",12.0);
        items.put("Melon", 9.0);

        return items;
    }
}
