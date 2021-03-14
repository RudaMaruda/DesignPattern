package builder;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean isUSBEnabled;
    private boolean isBluetoothEnabled;

private Computer(ComputerBuilder computerBuilder){
    this.HDD=computerBuilder.HDD;
    this.RAM=computerBuilder.RAM;
    this.isUSBEnabled=computerBuilder.isUSBEnabled;
    this.isBluetoothEnabled=computerBuilder.isBluetoothEnabled;

}


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isUSBEnabled() {
        return isUSBEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isUSBEnabled=" + isUSBEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    //Builder class
    public static class ComputerBuilder{

        //required elements
        private String HDD;
        private String RAM;

        //optional element
        private boolean isUSBEnabled;
        private boolean isBluetoothEnabled;



        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setUSBEnabled(boolean USBEnabled) {
            isUSBEnabled = USBEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }


        public Computer build(){
            return new Computer(this);
        }
    }
}
