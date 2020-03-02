package lt.andzej.Skaiciai;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class MyFilteredGenerator implements IntegerGenerator {
    IntegerGenerator integerGenerator;
    NumberFilter numberFilter;
    Integer temp;

    public MyFilteredGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        this.integerGenerator = integerGenerator;
        this.numberFilter = numberFilter;
    }

    @Override
    public Integer getNext() {
        Integer skaicius;
        while ( (skaicius = integerGenerator.getNext() ) != null) {
            if (numberFilter.accept(skaicius) ) {
                return skaicius;
            }
        }
        return null;
    }
}
