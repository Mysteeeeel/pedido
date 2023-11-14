package com.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedido.entities.Pedido;


public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
