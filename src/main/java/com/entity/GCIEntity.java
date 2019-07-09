package com.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "general_crime_indicators")
@Entity
@Component
public class GCIEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id",nullable = false)
    private Long id;
    @Column(name ="ano")
    private int ano;
    @Column(name ="mes")
    private String mes;
    @Column(name ="homicidio_Doloso")
    private int homicidioDoloso;
    @Column(name ="latrocinio")
    private int latrocinio;
    @Column(name ="furto")
    private int furto;
    @Column(name ="estelionato")
    private int estelionato;
    @Column(name ="posse_Entorpecente")
    private int posseEntorpecente;

    public GCIEntity(){ }

    public GCIEntity(int ano, String mes, int homicidioDoloso, int latrocinio, int furto, int estelionato, int posseEntorpecente) {
        this.ano = ano;
        this.mes = mes;
        this.homicidioDoloso = homicidioDoloso;
        this.latrocinio = latrocinio;
        this.furto= furto;
        this.estelionato = estelionato;
        this.posseEntorpecente = posseEntorpecente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getHomicidioDoloso() {
        return homicidioDoloso;
    }

    public void setHomicidioDoloso(int homicidioDoloso) {
        this.homicidioDoloso = homicidioDoloso;
    }

    public int getLatrocinio() {
        return latrocinio;
    }

    public void setLatrocinio(int latrocinio) {
        this.latrocinio = latrocinio;
    }

    public int getFurto() {
        return furto;
    }

    public void setFurto(int furto) {
        this.furto = furto;
    }

    public int getEstelionato() {
        return estelionato;
    }

    public void setEstelionato(int estelionato) {
        this.estelionato = estelionato;
    }

    public int getPosseEntorpecente() {
        return posseEntorpecente;
    }

    public void setPosseEntorpecente(int posseEntorpecente) {
        this.posseEntorpecente = posseEntorpecente;
    }
}
