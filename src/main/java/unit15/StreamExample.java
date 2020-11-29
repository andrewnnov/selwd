package unit15;

import org.testng.annotations.Test;

import java.util.ArrayList;
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







}
