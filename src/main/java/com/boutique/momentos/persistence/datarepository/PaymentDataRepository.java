package com.boutique.momentos.persistence.datarepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.boutique.momentos.persistence.entity.Payment;

public interface PaymentDataRepository extends CrudRepository<Payment, Integer> {
    Optional<List<Payment>> findByIdUser (String domainIdUser);
}
