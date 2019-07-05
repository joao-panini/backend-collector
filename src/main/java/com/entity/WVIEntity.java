package com.entity;


import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "woman_indicators")
@Entity
@Component
public class WVIEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id",nullable = false)
    private Long id;
    @Column(name ="ano")
    private int ano;
    @Column(name ="mes")
    private String mes;
    @Column(name ="num_Ameacas")
    private int numAmeacas;
    @Column(name ="num_Lesoes_Corporais")
    private int numLesoesCorporais;
    @Column(name ="num_Estupros")
    private int numEstupros;
    @Column(name ="num_Feminicidio_Consumado")
    private int numFeminicidioConsumado;
    @Column(name ="num_FeminicidioTentado")
    private int numFeminicidioTentado;

    public WVIEntity(){ }

    public WVIEntity(int ano, String mes, int numAmeacas, int numLesoesCorporais, int numEstupros, int numFeminicidioConsumado, int numFeminicidioTentado) {
        this.ano = ano;
        this.mes = mes;
        this.numAmeacas = numAmeacas;
        this.numLesoesCorporais = numLesoesCorporais;
        this.numEstupros = numEstupros;
        this.numFeminicidioConsumado = numFeminicidioConsumado;
        this.numFeminicidioTentado = numFeminicidioTentado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getNumAmeacas() {
        return numAmeacas;
    }

    public void setNumAmeacas(int numAmeacas) {
        this.numAmeacas = numAmeacas;
    }

    public int getNumLesoesCorporais() {
        return numLesoesCorporais;
    }

    public void setNumLesoesCorporais(int numLesoesCorporais) {
        this.numLesoesCorporais = numLesoesCorporais;
    }

    public int getNumEstupros() {
        return numEstupros;
    }

    public void setNumEstupros(int numEstupros) {
        this.numEstupros = numEstupros;
    }

    public int getNumFeminicidioConsumado() {
        return numFeminicidioConsumado;
    }

    public void setNumFeminicidioConsumado(int numFeminicidioConsumado) {
        this.numFeminicidioConsumado = numFeminicidioConsumado;
    }

    public int getNumFeminicidioTentado() {
        return numFeminicidioTentado;
    }

    public void setNumFeminicidioTentado(int numFeminicidioTentado) {
        this.numFeminicidioTentado = numFeminicidioTentado;
    }
}
