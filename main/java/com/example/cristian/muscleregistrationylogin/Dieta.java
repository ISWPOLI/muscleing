package com.example.cristian.muscleregistrationylogin;

import java.util.Date;

/**
 * Created by Yeison Fernando on 20/10/2016.
 */
public class Dieta {
    private Date horario;
    private String desayuno;

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getOnces() {
        return onces;
    }

    public void setOnces(String onces) {
        this.onces = onces;
    }

    public String getMediasNueves() {
        return mediasNueves;
    }

    public void setMediasNueves(String mediasNueves) {
        this.mediasNueves = mediasNueves;
    }

    private String almuerzo;
    private String cena;
    private String onces;
    private String mediasNueves;

    public Dieta(Date horario,String desayuno,String almuerzo, String cena, String onces, String mediasNueves){
        this.horario=horario;
        this.desayuno=desayuno;
        this.almuerzo=almuerzo;
        this.cena=cena;
        this.onces=onces;
        this.mediasNueves=mediasNueves;
    }

}
