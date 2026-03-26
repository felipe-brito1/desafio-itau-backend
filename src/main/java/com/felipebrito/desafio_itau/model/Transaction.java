package com.felipebrito.desafio_itau.model;

import java.time.OffsetDateTime;

public class Transaction {

    private Double valor;
    private OffsetDateTime dataHora;

    public Transaction() {
    }

    public Transaction(Double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }

}
