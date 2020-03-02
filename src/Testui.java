import lt.andzej.Skaiciai.Interfeisui;
import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.test.BaseTest;

public class Testui extends BaseTest {
    @Override
    protected Exercises createExercises() {
        return new Interfeisui();
    }
}
