package lt.andzej.Skaiciai;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;
import lt.itakademija.exam.test.BaseTest;

import java.util.*;

public class Interfeisui implements Exercises {
    List<Integer> list = new ArrayList<>();


    @Override
    public Integer findSmallest(List<Integer> list) {
        Integer min = list.get(0);
        for (Integer item:
             list) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        Integer max = list.get(0);
        for (Integer item:
                list) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o == o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> sarasas = new ArrayList<>();
        while(iterator.hasNext()) {
            Integer myInteger = iterator.next();
//            int myInt = myInteger.intValue();
            sarasas.add(myInteger);
        }
        return sarasas;
    }

    @Override
    public int computeSumOfNumbers(int number) {
        int sum = 0;
        int counter = number;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int computeSumOfNumbers(int number, NumberFilter numberFilter) {
        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            if (numberFilter.accept(i) ) {
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {
        List<Integer> integeriai = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            integeriai.add(i);
        }
        return integeriai;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        HashMap <Integer, Integer> mapas = new HashMap<>();
        for (Integer item:
             list) {
           if (mapas.containsKey(item) ) {
               int skaitiklis = mapas.get(item);
               skaitiklis++;
               mapas.put(item, skaitiklis);
           } else  {
               mapas.put(item,1);
           }
        }
       return mapas;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int from, int to) {
        if (from >= to) {
            throw new IllegalArgumentException("'from' must be greater than 'to'");
        }
        return new MyGenerator(from, to);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new MyFilteredGenerator(integerGenerator,numberFilter);
    }
}
