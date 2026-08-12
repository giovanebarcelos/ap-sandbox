#include <iostream>
using namespace std;

class Termometro {
    private:
        double temperaturaCelsius;

    public:
        Termometro(double temperaturaCelsius) {
            this->temperaturaCelsius = temperaturaCelsius;
        }

        double getTemperaturaCelsius() {
            return temperaturaCelsius;
        }

        double getTemperaturaFahrenheit() {
            return temperaturaCelsius * 9.0 / 5.0 + 32;
        }
};

int main() {
    Termometro t1(25.0);
    cout << t1.getTemperaturaCelsius() << " C = " << t1.getTemperaturaFahrenheit() << " F" << endl;
    return 0;
}
