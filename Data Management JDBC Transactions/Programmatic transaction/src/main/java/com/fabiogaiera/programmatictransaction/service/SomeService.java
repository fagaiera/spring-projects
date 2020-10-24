package com.fabiogaiera.programmatictransaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class SomeService {

    private TransactionTemplate transactionTemplate;

    public SomeService(PlatformTransactionManager transactionManager) {
        this.transactionTemplate = new TransactionTemplate(transactionManager);
    }


    public Double someServiceMethod1() {
        return transactionTemplate.execute(new TransactionCallback<Double>() {
            @Override
            public Double doInTransaction(TransactionStatus transactionStatus) {
                // Code here works inside a transaction;
                return 5.2;
            }
        });
    }

    public void someServiceMethod2() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            public void doInTransactionWithoutResult(TransactionStatus status) {
                // Code here works inside a transaction
            }
        });
    }

}