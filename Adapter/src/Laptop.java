public class Laptop {
    private USB usbPort;

    public void setUsbPort(USB usbPort) {
        this.usbPort = usbPort;
    }

    public void connect() {
        usbPort.connectWithUsbCable();
    }

    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();
        USB memoryCardAdapter = new MemoryCardAdapter(memoryCard);

        Laptop laptop = new Laptop();
        laptop.setUsbPort(memoryCardAdapter);
        laptop.connect();
    }
}
