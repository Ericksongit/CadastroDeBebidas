package com.example.cadastrodebebidas;

public class Bebidas {

    private String UID;
    private String nomeBebida;
    private String precoBebida;

    public Bebidas(String UID, String nomeBebida, String precoBebida) {

        this.UID = UID;
        this.nomeBebida = nomeBebida;
        this.precoBebida = precoBebida;

    }

    public Bebidas () {}

    public String getUID() { return UID; }

    public void setUID(String UID) { this.UID = UID; }

    public String getNomeBebida() { return nomeBebida; }

    public void setNomeBebida(String nomeBebida) { this.nomeBebida = nomeBebida; }

    public String getPrecoBebida() { return precoBebida; }

    public void setPrecoBebida(String precoBebida) { this.precoBebida = precoBebida; }

    @Override
    public String toString() {
        return "Bebida{" +
                "UID='" + UID + '\'' +
                ", nomeBebida='" + nomeBebida + '\'' +
                ", precoBebida='" + precoBebida + '\'' +
                '}';
    }
}
