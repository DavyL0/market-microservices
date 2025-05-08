package br.com.dlopes.vendasonline.repository;

import br.com.dlopes.vendasonline.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {


    Optional<Object> findByCpf(Long cpf);
}
