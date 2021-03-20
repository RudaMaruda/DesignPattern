package adapter;

public class HdmiToUsbAdapter implements HdmiToUsb{

    private  Hdmi hdmi;

    public HdmiToUsbAdapter(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
// metody wykorzystujace obiekt niepasujacy (wejsciowy)
    @Override
    public void connect() {

        hdmi.connect();
        System.out.println("Signal convertered");
    }
}
