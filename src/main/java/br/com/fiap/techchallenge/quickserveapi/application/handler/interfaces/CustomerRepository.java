package br.com.fiap.techchallenge.quickserveapi.application.handler.interfaces;
import br.com.fiap.techchallenge.quickserveapi.application.handler.entities.CustomerEntity;

import java.util.List;

public interface CustomerRepository {
    CustomerEntity findById(Long id);
    CustomerEntity findByCpf(String cpf);
    List<CustomerEntity> findAll();

    CustomerEntity save(CustomerEntity customer);
    String delete(Long id);
    CustomerEntity update(Long id,CustomerEntity customer);
}
