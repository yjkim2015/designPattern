package BehavioralPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class LifeMain {
    public static void main(String[] args) {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
        Life life = new Life();

        life.setTime("1000 B.C.");
        savedTimes.add(life.saveToMemonto());
        life.setTime("1000 A.D");
        savedTimes.add(life.saveToMemonto());
        life.setTime("2000 A.D.");
        savedTimes.add(life.saveToMemonto());
        life.setTime("4000 A.D.");
        savedTimes.add(life.saveToMemonto());

        life.restoreFromMemento(savedTimes.get(0));
    }
}
