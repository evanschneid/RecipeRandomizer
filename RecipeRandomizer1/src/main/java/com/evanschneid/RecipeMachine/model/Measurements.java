package com.evanschneid.RecipeMachine.model;

public class Measurements {

    private int measurementId;
    private String measurementName;

    public Measurements() {}

    public Measurements(int measurementId, String measurementName) {
        this.measurementId = measurementId;
        this.measurementName = measurementName;
    }

    public int getMeasurementId() {
        return measurementId;
    }
    public void setMeasurementId(int measurementId) {
        this.measurementId = measurementId;
    }

    public String getMeasurementName() {
        return measurementName;
    }
    public void setMeasurementName(String measurementName) {
        this.measurementName = measurementName;
    }

    @Override
    public String toString() {
        return "Measurements{" +
                "measurementId=" + measurementId +
                ", measurementName='" + measurementName + '\'' +
                '}';
    }
}

