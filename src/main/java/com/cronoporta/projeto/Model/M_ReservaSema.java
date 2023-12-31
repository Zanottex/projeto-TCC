package com.cronoporta.projeto.Model;


import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservas_semanais")
public class M_ReservaSema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean segunda;
    private boolean terça;
    private boolean quarta;
    private boolean quinta;
    private boolean sexta;
    private boolean sabado;
    private boolean domingo;
    private Time data_abertura;
    private Time data_fechamento;
    private int id_porta;
    private LocalDateTime data_Inicio;
    private LocalDateTime data_Fim;

    public LocalDateTime getData_Inicio() {
        return data_Inicio;
    }

    public void setData_Inicio(LocalDateTime data_Inicio) {
        this.data_Inicio = data_Inicio;
    }

    public LocalDateTime getData_Fim() {
        return data_Fim;
    }

    public void setData_Fim(LocalDateTime data_Fim) {
        this.data_Fim = data_Fim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSegunda() {
        return segunda;
    }

    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }

    public boolean isTerça() {
        return terça;
    }

    public void setTerça(boolean terça) {
        this.terça = terça;
    }

    public boolean isQuarta() {
        return quarta;
    }

    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }

    public boolean isQuinta() {
        return quinta;
    }

    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }

    public boolean isSexta() {
        return sexta;
    }

    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }

    public boolean isSabado() {
        return sabado;
    }

    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }

    public boolean isDomingo() {
        return domingo;
    }

    public void setDomingo(boolean domingo) {
        this.domingo = domingo;
    }

    public Time getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(Time data_abertura) {
        this.data_abertura = data_abertura;
    }

    public Time getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(Time data_fechamento) {
        this.data_fechamento = data_fechamento;
    }

    public int getId_porta() {
        return id_porta;
    }

    public void setId_porta(int id_porta) {
        this.id_porta = id_porta;
    }
}
