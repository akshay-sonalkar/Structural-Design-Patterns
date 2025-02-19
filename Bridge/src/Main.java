
public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemoteControl(tv);
        basicRemote.turnOn();
        basicRemote.setVolume(50);
        basicRemote.turnOff();

        Device radio = new Radio();
        RemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.turnOn();
        advancedRemote.setVolume(70);
        ((AdvancedRemoteControl) advancedRemote).mute();
        advancedRemote.turnOff();
    }
}