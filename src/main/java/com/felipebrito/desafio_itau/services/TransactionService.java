package com.felipebrito.desafio_itau.services;

import com.felipebrito.desafio_itau.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class TransactionService {
    private final Queue<Transaction> transactionQueue = new ConcurrentLinkedQueue<>();

    public void addTransactions(Transaction transaction){
        transactionQueue.add(transaction);
    }

    public void clearTransactions(){
        transactionQueue.clear();
    }

    public DoubleSummaryStatistics getStatistics(){
        OffsetDateTime now = OffsetDateTime.now();
        return transactionQueue.stream().filter(t -> t.getDataHora()
                .isAfter(now.minusSeconds(60)))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    }
}
