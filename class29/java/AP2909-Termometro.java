class Termometro {
    private double temperaturaCelsius;

    Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaCelsius * 9.0 / 5.0 + 32;
    }
}

public class Main {
    public static void main(String[] args) {
        Termometro t1 = new Termometro(25.0);
        System.out.println(t1.getTemperaturaCelsius() + " C = " + t1.getTemperaturaFahrenheit() + " F");
    }
}
