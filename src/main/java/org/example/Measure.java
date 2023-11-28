package org.example;

public interface Measure {
    double getMass();
    double getLength();
    double getVolume();
    double getTemperature();

    void setMass(double value);
    void setLength(double value);
    void setVolume(double value);
    void setTemperature(double value);
}
