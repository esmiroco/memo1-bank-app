package com.aninfo.repository;

import com.aninfo.exceptions.TransaccionesNoEncontradasException;
import com.aninfo.model.Account;
import com.aninfo.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    List<Transaction> findByCbu(Long cbu);
    List<Transaction> findByType(String type);
}
