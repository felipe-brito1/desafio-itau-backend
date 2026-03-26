package com.felipebrito.desafio_itau.controllers;

import com.felipebrito.desafio_itau.dto.TransactionDTO;
import com.felipebrito.desafio_itau.model.Transaction;
import com.felipebrito.desafio_itau.services.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping(value = "/transacao")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Void> insertTransaction(@Valid @RequestBody TransactionDTO transactionDto){
        if (transactionDto.getDataHora().isAfter(OffsetDateTime.now())|| transactionDto.getValor() <= 0){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        }
        transactionService.addTransactions(new Transaction(transactionDto.getValor(), transactionDto.getDataHora()));
        return ResponseEntity.status((HttpStatus.CREATED)).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTransactions(){
        transactionService.clearTransactions();
        return ResponseEntity.ok().build();
    }


}
