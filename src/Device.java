public class Device {
    protected String name;
    protected String protocol1;
    protected String status;
    Device(String name, String protocol1) {
        this.name = name;
        this.protocol1 = protocol1;
        this.status = "of";
    }

    public abstract boolean setProperty(String property, String value);
    public abstract String getInfo();

    public boolean validProtocol1(String protocol1) {
        return protocol1.equals("Wifi") || protocol1.equals("Bluetooth");
    }
    public String getName(){
        return name;
    }
    public String getProtocol1(){
        return protocol1;
    }
    public String getStatus(){
        return status;
    }

}
