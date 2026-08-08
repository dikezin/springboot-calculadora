package com.dike.calculadoraapi.model;

public class Resultado {
    private String operacion;
    private int resultado;
    public Resultado (){

    }
    public Resultado (String operacion, int resultado ){
        this.operacion=operacion;this.resultado=resultado;
    }

    public int getResultado() {
        return resultado;
    }
    public String getOperacion(){
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
