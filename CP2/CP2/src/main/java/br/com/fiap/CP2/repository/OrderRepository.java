package br.com.fiap.CP2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.CP2.model.OrderModel;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {

}