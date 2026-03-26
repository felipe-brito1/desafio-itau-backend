package com.felipebrito.desafio_itau.dto;

import com.felipebrito.desafio_itau.model.Transaction;

import java.time.OffsetDateTime;

public class TransactionDTO {

    private Double valor;
    private OffsetDateTime dataHora;

    public TransactionDTO() {
    }

    public TransactionDTO(Transaction transaction){
        this.valor = transaction.getValor();
        this.dataHora = transaction.getDataHora();
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
