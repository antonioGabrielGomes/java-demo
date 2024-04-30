package com.mycompany.aula02;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampar;
    private String cor;
    
    public Caneta(String m, String c, float p) {
        this.tampar();
        this.setPonta(p);
        this.modelo = m;
        this.cor = c;
    }
    
    public void status() {
        System.out.println("tampada: " + this.tampar);
        System.out.println("cor: " + this.cor);
        System.out.println("modelo: " + this.getModelo());
    }
        
    public void tampar() {
        this.tampar = true;
    }
    
    public void destampar() {
        this.tampar = false;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
   
}
