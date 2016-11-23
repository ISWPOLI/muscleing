package com.example.cristian.muscleregistrationylogin;

/**
 * Created by cristian on 18/11/2016.
 */

public class ProveedorDeRutinas {
    private int rutine_poster_resurce;
    private String rutine_title;
    private String rutine_reps;



    public int getRutine_poster_resurce() {
        return rutine_poster_resurce;
    }

    public ProveedorDeRutinas(int rutine_poster_resurce, String rutine_title, String rutine_reps)
    {
        this.setRutine_poster_resurce(rutine_poster_resurce);
        this.setRutine_title(rutine_title);
        this.setRutine_reps(rutine_reps);
    }
    public void setRutine_poster_resurce(int rutine_poster_resurce) {
        this.rutine_poster_resurce = rutine_poster_resurce;
    }

    public String getRutine_title() {
        return rutine_title;
    }

    public void setRutine_title(String rutine_title) {
        this.rutine_title = rutine_title;
    }

    public String getRutine_reps() {
        return rutine_reps;
    }

    public void setRutine_reps(String rutine_reps) {
        this.rutine_reps = rutine_reps;
    }
}
