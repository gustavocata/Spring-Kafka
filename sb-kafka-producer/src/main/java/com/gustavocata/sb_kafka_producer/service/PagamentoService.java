package com.gustavocata.sb_kafka_producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gustavocata.sb_kafka_producer.dto.PagamentoDTO;
import com.gustavocata.sb_kafka_producer.producer.PagamentoResquestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired private PagamentoResquestProducer pagamentoResquestProducer;

    public String integrarPagamento (PagamentoDTO pagamento) {
        try {
           return pagamentoResquestProducer.sendMessage(pagamento);
        } catch (JsonProcessingException e) {
           return "Houve um erro ao solicitar pagamento" + e.getMessage();
        }
    }
}
