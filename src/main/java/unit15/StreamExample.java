package unit15;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    @Test
    public void regular() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Marina");
        list.add("Taya");
        list.add("Vitaliy");
        list.add("Andrew");
        list.add("Irina");
        int countNameWithCondition = 0;

        for (int i = 0; i < list.size(); i++) {
            String actualName = list.get(i);
            if(actualName.startsWith("A")) {
                countNameWithCondition++;
            }
        }

        System.out.println(countNameWithCondition);
    }

    @Test
    public void streamFilter() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Marina");
        list.add("Taya");
        list.add("Vitaliy");
        list.add("Andrew");
        list.add("Irina");
        list.add("Alex");

        long count = list.stream().filter(s->s.startsWith("A")).count(); //
        System.out.println(count);

        long d = Stream.of("Marina", "Taya", "Vitaliy", "Andrew", "Irina", "Alex").filter(s->{
            s.startsWith("A");
            return false;
        }).count();
        System.out.println(d);


        //print all the names of ArrayList
        list.stream().filter(s->s.length()>4).forEach(s -> System.out.println(s)); //only more than 4 characters
        list.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s)); //only one from range
    }

    @Test
    public void streamMap() {

        //print the names with last letter is "a" with Uppercast
        Stream.of("Marina", "Taya", "Vitaliy", "Andrew", "Irina", "Alex").filter(s -> s.endsWith("a")).map(s ->
                s.toUpperCase()).forEach(s -> System.out.println(s));
    }

    @Test
    public void streamMapSorted() {
        //print names which have first lettet as A and sorted
        List<String> names = Arrays.asList("Marina", "Taya", "Vitaliy", "Andrew", "Irina", "Alex");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }

    @Test
    public void streamMapMerge() {

        ArrayList<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Simka");
        listOfNames.add("Barsik");
        listOfNames.add("Mishka");
        listOfNames.add("Murzik");
        listOfNames.add("Kosha");


        //print names which have first lettet as A and sorted
        List<String> names = Arrays.asList("Marina", "Taya", "Vitaliy", "Andrew", "Irina", "Alex");
        //names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        //merge 2 list
        Stream<String> newStream = Stream.concat(listOfNames.stream(), names.stream());
        newStream.sorted().forEach(s -> System.out.println(s));

        //check if new list have name from input array
//        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Mishka"));
//        Assert.assertTrue(flag);
    }

    @Test
    public void streamCollect() {

        List<String> listFromStream = Stream.of("Marina", "Taya", "Vitaliy", "Andrew", "Irina", "Alex").filter(s -> s.endsWith("a")).map(s ->
                s.toUpperCase()).collect(Collectors.toList());
        System.out.println(listFromStream.get(0));

    }

    @Test
    public void streamUniqueAndSort() {

       List<Integer> numberList = Arrays.asList(3, 2, 2, 2, 7, 5, 1, 9, 8);
       //print unique number
        numberList.stream().distinct().forEach(s-> System.out.println(s));

        //sorted
        List<Integer> inList = numberList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(inList);
        inList.stream().forEach(s-> System.out.println(s));
    }








}
