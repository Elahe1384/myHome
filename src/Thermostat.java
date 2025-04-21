public class Thermostat extends Device {
    private int temperature;
    Thermostat(String name, String protocol1) {
        super(name, protocol1);
        this.temperature = 20;
    }

    @Override
    public boolean setProperty(String property, String value) {
        switch (property) {
            case "status":
                if (value.equals("on") || value.equals("off")) {
                    this.status = value;
                    return true;
                }
                return false;
            case "temperature":
                try {
                    int temp = Integer.parseInt(value);
                    if (temp >= 10 && temp <= 30) {
                        this.temperature = temp;
                        return true;
                    }
                    return false;
                } catch (NumberFormatException e) {
                    return false;
                }
            default:
                return false;
        }
    }
    @Override
    public String getInfo() {
        return name + " " + status + " " + temperature + "C " + protocol1;
    }
}
