package com.example.balancing.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "records")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
   // static int count;
    @Column(name = "mode")
    private String mode;
    @Column(name = "mvibration")
    private double mvibration;
    @Column(name = "pvibration")
    private double pvibration;
//    private Complex complexVibration;
    @Column(name = "mweight")
    private double mweight;
    @Column(name = "pweight")
    private double pweight;
//    private Complex complexWeight;
    @Column(name = "reference")
    private double reference;
//    private double magnitudeTotalWeight;
//    private double phaseTotalWeight;
//    private Complex complexTotalWeight;
//    private double phaseReferenceWeight;
//    private double magnitudeTargetWeight;
//    private double phaseTargetWeight;
//    private Complex complexTargetWeight;
    @Column(name = "stage")
    public int stage;


//    public Record(String mode,
//                  int magnitudeVibration,
//                  int phaseVibration,
//                  int magnitudeWeight,
//                  int phaseWeight,
//                  int reference,
//                  boolean stage) {
//      //  this.id = count;
//        //count++;
//        this.mode = mode;
//        this.magnitudeVibration = magnitudeVibration;
//        this.phaseVibration = phaseVibration;
////        this.complexVibration = Transform.toComplex(
////                magnitudeVibration, phaseVibration);
//        this.magnitudeWeight = magnitudeWeight;
//        this.phaseWeight = phaseWeight;
////        this.complexWeight = Transform.toComplex(
////                magnitudeWeight, phaseWeight);
//        this.reference = reference;
////        this.magnitudeTotalWeight = 0;
////        this.phaseTotalWeight = 0;
////        this.complexTotalWeight = Transform.toComplex(
////                magnitudeTotalWeight, phaseTotalWeight);
////        this.phaseReferenceWeight = -1;
////        this.magnitudeTargetWeight = -1;
////        this.phaseTargetWeight = -1;
////        this.complexTargetWeight = Transform.toComplex(
////                magnitudeTargetWeight, phaseTargetWeight);
//        this.stage = stage;

//    }

//    Record(int magnitudeVibration,
//           int phaseVibration,
//           int magnitudeWeight,
//           int phaseWeight) {
//        this.mode = "None";
//        this.reference = -1;
//        this.stage = false;
//    }
//
//    public int getId() {
//        return ID;
//    }

//    public void setMagnitudeTotalWeight(double magnitudeTotalWeight) {
//        this.magnitudeTotalWeight = magnitudeTotalWeight;
//    }
//
//    public void setPhaseTotalWeight(double phaseTotalWeight) {
//        this.phaseTotalWeight = phaseTotalWeight;
//    }
//
//    public void setComplexTotalWeight(Complex complexTotalWeight) {
//        this.complexTotalWeight = complexTotalWeight;
//    }
//
//    public void setPhaseReferenceWeight(double phaseReferenceWeight) {
//        this.phaseReferenceWeight = phaseReferenceWeight;
//    }

//    public void setComplexTargetWeight(Complex complexTargetWeight) {
//        this.complexTargetWeight = complexTargetWeight;
//    }
//
//    public void setMagnitudeTargetWeight(double magnitudeTargetWeight) {
//        this.magnitudeTargetWeight = magnitudeTargetWeight;
//    }
//
//    public void setPhaseTargetWeight(double phaseTargetWeight) {
//        this.phaseTargetWeight = phaseTargetWeight;
//    }
//
//    public Complex getComplexTotalWeight() {
//        return complexTotalWeight;
//    }
//
//    public Complex getComplexVibration() {
//        return complexVibration;
//    }
//
//    public Complex getComplexWeight() {
//        return complexWeight;
//    }

//    public String getMode() {
//        return mode;
//    }
//
//    public int getReference() {
//        return reference;
//    }
//
//    public boolean getStage() {
//        return stage;
//    }

//    public double getPhaseReferenceWeight() {
//        return phaseReferenceWeight;
//    }
}
