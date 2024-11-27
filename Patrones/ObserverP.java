import java.util.ArrayList;
import java.util.List;

// Interfaz Observador
interface Observer {
    void update(String message);
}

// Sujeto
class Subject {
    private List<Observer> observers = new ArrayList<>();

    // Agregar un observador
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Eliminar un observador
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Notificar a todos los observadores
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Observador concreto: Notificación por Email
class EmailObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Email Notification: " + message);
    }
}

// Observador concreto: Notificación por SMS
class SMSObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

// Clase principal para demostrar el patrón Observer
public class ObserverP {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer emailObserver = new EmailObserver();
        Observer smsObserver = new SMSObserver();

        subject.attach(emailObserver);
        subject.attach(smsObserver);

        // Enviar notificaciones
        subject.notifyObservers("Pedido enviado.");
        subject.notifyObservers("Pago recibido.");
    }
}
