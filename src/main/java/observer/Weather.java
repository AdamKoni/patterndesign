package observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {
    private int currentTemperature;
    private List<Person> observers = new ArrayList<>();

    public void addObservers(Person... person) {
        observers.addAll(Arrays.asList(person));
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Person observer : observers) {
            if (observer.getTempMax() <= currentTemperature) {
                observer.update(currentTemperature);
            }
        }
    }


}
