package org.example;

public class MeasureSI implements Measure {
    private MeasureImperial imperial;

    private final double METERS_PER_INCH = 0.0254;
    private final double KILOGRAMS_PER_POUND = 0.45359237;
    private final double LITERS_PER_PINT = 0.568;
    private final double CELSIUS_PER_FAHRENHEIT = 5.0/9.0;
    private final double CELSIUS_DIFF_FAHRENHEIT = 32.0;

    public MeasureSI() {
        this.imperial = new MeasureImperial();
    }

    public MeasureSI(MeasureImperial imperial) {
        this.imperial = imperial;
    }
    @Override
    public double getMass() {
        return this.imperial.getMass() * KILOGRAMS_PER_POUND;
    }

    @Override
    public double getLength() {
        return this.imperial.getLength() * METERS_PER_INCH;
    }

    @Override
    public double getVolume() {
        return this.imperial.getVolume() * LITERS_PER_PINT;
    }

    @Override
    public double getTemperature() {
        return (this.imperial.getTemperature() - CELSIUS_DIFF_FAHRENHEIT) * CELSIUS_PER_FAHRENHEIT;
    }

    @Override
    public void setMass(double value) {
        this.imperial.setMass(value / KILOGRAMS_PER_POUND);
    }

    @Override
    public void setLength(double value) {
        this.imperial.setLength(value / METERS_PER_INCH);
    }

    @Override
    public void setVolume(double value) {
        this.imperial.setVolume(value / LITERS_PER_PINT);
    }

    @Override
    public void setTemperature(double value) {
        this.imperial.setTemperature((value + CELSIUS_DIFF_FAHRENHEIT) / CELSIUS_PER_FAHRENHEIT);
    }
}
