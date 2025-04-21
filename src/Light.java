public class Light extends Device {
    private int brightness;

    Light(String name, String protocol1) {
        super(name, protocol1);
        this.brightness = 50;
    }
}
