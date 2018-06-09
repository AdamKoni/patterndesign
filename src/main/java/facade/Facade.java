package facade;

public class Facade {
    private Lights light = new Lights();
    private Window window = new Window();
    private Alarm alarm = new Alarm();

    public  void enterRoom() {
        light.on();
        window.open();
        alarm.turnOff();
    }

    public void exitRoom() {
        light.off();
        window.close();
        alarm.turnOn();
    }
}
