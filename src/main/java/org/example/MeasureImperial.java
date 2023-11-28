package org.example;

public class MeasureImperial implements Measure {
    private double pound; // Mass
    private double inch; // Length
    private double pint; // Volume
    private double fahrenheit;// Temperature

    public MeasureImperial() {
        this.pound = 0;
        this.inch = 0;
        this.pint = 0;
        this.fahrenheit = 0;
    }

    @Override
    public double getLength() {
        return this.inch;
    }

    @Override
    public double getMass() {
        return this.pound;
    }

    @Override
    public double getTemperature() {
        return this.fahrenheit;
    }

    @Override
    public double getVolume() {
        return this.pint;
    }

    @Override
    public void setVolume(double value) {
        this.pint = value;
    }

    @Override
    public void setMass(double value) {
        this.pound = value;
    }

    @Override
    public void setTemperature(double value) {
        this.fahrenheit = value;
    }

    @Override
    public void setLength(double value) {
        this.inch = value;
    }
}
