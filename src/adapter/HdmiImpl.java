package adapter;

public class HdmiImpl implements Hdmi{
    @Override
    public void connect() {
        System.out.println("Signal from HDMI");
    }
}
