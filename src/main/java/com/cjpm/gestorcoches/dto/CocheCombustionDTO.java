package com.cjpm.gestorcoches.dto;

import com.cjpm.gestorcoches.entities.CocheCombustion;

import java.io.Serializable;

public class CocheCombustionDTO extends CocheDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean motorCombustion;

    public CocheCombustionDTO() {

    }
    public CocheCombustionDTO(boolean motorCombustion) {
        this.motorCombustion = motorCombustion;
    }
    public CocheCombustionDTO(CocheCombustion cocheCombustion) {

    }

    public CocheCombustionDTO(long idCoche, String marca, String modelo, String color, Boolean aireAcondicionado, Boolean motor, Boolean bateria, boolean motorCombustion) {
        super(idCoche, marca, modelo, color, aireAcondicionado, motor, bateria);
        this.motorCombustion = motorCombustion;
    }

    public boolean isMotorCombustion() {
        return motorCombustion;
    }

    public void setMotorCombustion(boolean motorCombustion) {
        this.motorCombustion = motorCombustion;
    }

    @Override
    public String toString() {
        return "CocheCombustion{" +
                ", motorCombustion=" + motorCombustion +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", aireAcondicionado=" + aireAcondicionado +
                ", motor=" + motor +
                ", bateria=" + bateria +
                '}';
    }
}
