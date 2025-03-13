package com.gustavocata.sb_kafka_producer.dto;

import java.math.BigDecimal;

public class PagamentoDTO {
    private Integer numero;
    private String descricao;
    private BigDecimal calor;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getCalor() {
        return calor;
    }

    public void setCalor(BigDecimal calor) {
        this.calor = calor;
    }
}
