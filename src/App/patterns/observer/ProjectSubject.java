package App.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ProjectSubject implements Subject {
    private static volatile ProjectSubject instance;
    private final List<Observer> observers = new ArrayList<>();

    private ProjectSubject() {}

    public static ProjectSubject getInstance(){
        if (instance == null){
            synchronized (ProjectSubject.class){
                if (instance == null){
                    instance = new ProjectSubject();
                }
            }
        }
        return instance;
    }

    @Override
    public synchronized void attach(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public synchronized void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public synchronized void notifyObservers(String eventType, Object data) {
        for (Observer observer : observers) {
            observer.update(eventType, data);
        }
    }

}
