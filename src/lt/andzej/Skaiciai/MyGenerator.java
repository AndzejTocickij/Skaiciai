package lt.andzej.Skaiciai;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class MyGenerator implements IntegerGenerator {
    int from;
    int to;
    Integer counter;

    public MyGenerator(int from, int to) {
        this.from = from;
        this.to = to;
        counter = from;
    }

    @Override
    public Integer getNext() {
        if (counter > to) {
            return null;
        } else {
            return counter++;
        }
    }
}
