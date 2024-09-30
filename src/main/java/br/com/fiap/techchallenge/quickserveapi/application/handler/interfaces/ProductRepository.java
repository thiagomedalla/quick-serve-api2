package br.com.fiap.techchallenge.quickserveapi.application.handler.interfaces;
import br.com.fiap.techchallenge.quickserveapi.application.handler.entities.CategoryEnum;
import br.com.fiap.techchallenge.quickserveapi.application.handler.entities.OrderEntity;
import br.com.fiap.techchallenge.quickserveapi.application.handler.entities.ProductEntity;

import java.util.List;

public interface ProductRepository {
    ProductEntity save(ProductEntity product);
    ProductEntity findById(Long id);
    List<ProductEntity> findByCategory(CategoryEnum category);
    List<ProductEntity> findAll();
    List<ProductEntity> findByOrder(OrderEntity order);
    String delete(Long id);
    ProductEntity update(Long id,ProductEntity customer);
}
