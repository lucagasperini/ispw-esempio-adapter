package org.example;

/*
Si vuole disporre di un unico tipo di dato che
consenta di gestire informazioni su grandezze
fisiche nel sistema internazionale di unità di
misura (e.g., lunghezza, massa, temperatura,
etc.).
Come requisito si ha l’obbligo di riutilizzare
implementazioni di tipi di dato esistenti che
però sono basati sul sistema imperiale. Si
assuma di avere a disposizione un tipo per
ogni singola grandezza fisica.
Proporre una o più soluzioni che risolvano il
problema e valutare/discutere il coupling tra
le classi coinvolte.
*/

public class Main {
    private static void printMeasure(Measure m) {
        System.out.println("######## CURRENT MEASURE ########");
        System.out.println("Volume: " + m.getVolume());
        System.out.println("Length: " + m.getLength());
        System.out.println("Temperature: " + m.getTemperature());
        System.out.println("Mass: " + m.getMass());
    }
    public static void main(String[] args) {
        MeasureImperial imp = new MeasureImperial();
        imp.setVolume(1);
        imp.setLength(1);
        imp.setTemperature(32);
        imp.setMass(1);
        printMeasure(imp);

        MeasureSI si = new MeasureSI(imp);
        printMeasure(si);

        si.setVolume(1);
        si.setLength(1);
        si.setTemperature(-32);
        si.setMass(1);
        printMeasure(si);
    }
}