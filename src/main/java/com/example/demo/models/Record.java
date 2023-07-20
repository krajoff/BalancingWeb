package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "records")
@Data
@AllArgsConstructor
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int ID;
    static int count;
    @Column(name = "rate")
    private String mode;
    @Column(name = "mVibration")
    private double magnitudeVibration;
    @Column(name = "pVibration")
    private double phaseVibration;
    private Complex complexVibration;
    @Column(name = "mWeight")
    private double magnitudeWeight;
    @Column(name = "pWeight")
    private double phaseWeight;
    private Complex complexWeight;
    @Column(name = "reference")
    private int reference;
    private double magnitudeTotalWeight;
    private double phaseTotalWeight;
    private Complex complexTotalWeight;
    private double phaseReferenceWeight;
    private double magnitudeTargetWeight;
    private double phaseTargetWeight;
    private Complex complexTargetWeight;
    static int[] sml = new int[]{3, 7, 17};

    public enum Stage {On, Off}

    private Stage stage;

    public Record(String mode,
                  double magnitudeVibration,
                  double phaseVibration,
                  double magnitudeWeight,
                  double phaseWeight,
                  int reference,
                  Stage stage) {
        this.ID = count;
        count++;
        this.mode = mode;
        this.magnitudeVibration = magnitudeVibration;
        this.phaseVibration = phaseVibration;
        this.complexVibration = Transform.toComplex(
                magnitudeVibration, phaseVibration);
        this.magnitudeWeight = magnitudeWeight;
        this.phaseWeight = phaseWeight;
        this.complexWeight = Transform.toComplex(
                magnitudeWeight, phaseWeight);
        this.reference = reference;
        this.magnitudeTotalWeight = 0;
        this.phaseTotalWeight = 0;
        this.complexTotalWeight = Transform.toComplex(
                magnitudeTotalWeight, phaseTotalWeight);
        this.phaseReferenceWeight = -1;
        this.magnitudeTargetWeight = -1;
        this.phaseTargetWeight = -1;
        this.complexTargetWeight = Transform.toComplex(
                magnitudeTargetWeight, phaseTargetWeight);
        this.stage = stage;

    }

    Record(double magnitudeVibration,
           double phaseVibration,
           double magnitudeWeight,
           double phaseWeight) {
        this.mode = "None";
        this.reference = -1;
        this.stage = Stage.Off;
    }

    public int getId() {
        return ID;
    }

    public void setMagnitudeTotalWeight(double magnitudeTotalWeight) {
        this.magnitudeTotalWeight = magnitudeTotalWeight;
    }

    public void setPhaseTotalWeight(double phaseTotalWeight) {
        this.phaseTotalWeight = phaseTotalWeight;
    }

    public void setComplexTotalWeight(Complex complexTotalWeight) {
        this.complexTotalWeight = complexTotalWeight;
    }

    public void setPhaseReferenceWeight(double phaseReferenceWeight) {
        this.phaseReferenceWeight = phaseReferenceWeight;
    }

    public void setComplexTargetWeight(Complex complexTargetWeight) {
        this.complexTargetWeight = complexTargetWeight;
    }

    public void setMagnitudeTargetWeight(double magnitudeTargetWeight) {
        this.magnitudeTargetWeight = magnitudeTargetWeight;
    }

    public void setPhaseTargetWeight(double phaseTargetWeight) {
        this.phaseTargetWeight = phaseTargetWeight;
    }

    public Complex getComplexTotalWeight() {
        return complexTotalWeight;
    }

    public Complex getComplexVibration() {
        return complexVibration;
    }

    public Complex getComplexWeight() {
        return complexWeight;
    }

    public String getMode() {
        return mode;
    }

    public int getReference() {
        return reference;
    }

    public Stage getStage() {
        return stage;
    }

    public double getPhaseReferenceWeight() {
        return phaseReferenceWeight;
    }
}
