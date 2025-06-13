package problem_2;

public class Temperature {
    private double temperature;
    private char scale;

    public Temperature() { 
        this.temperature = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) { 
        this.temperature = value;
        this.scale = 'C';
    }

    public Temperature(char scale) { 
        this.temperature = 0.0;
        this.scale = scale; 
    }

    public Temperature(double value, char scale) { 
        this.temperature = value;
        this.scale = scale;
    }
    
    public double getTemperature() {
    	return temperature;
    }
    
    public char getScale() {
        return scale;
    }

    
    public double toCelsius() {
        if (scale == 'C') {
            return temperature;
        } else {
            return 5 * (temperature - 32) / 9;
        }
    }

    public double toFahrenheit() {
        if (scale == 'F') {
            return temperature;
        } else {
            return 9 * (temperature / 5) + 32;
        }
    }


    public void setTemperature(double value) {
        this.temperature = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.temperature = value;
        this.scale = scale;
    }

    public String toString() {
        return "Temperature: " + getTemperature() + "° " + getScale();
    }
}
