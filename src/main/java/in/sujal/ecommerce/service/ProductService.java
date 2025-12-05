package in.sujal.ecommerce.service;

import java.util.List;
import java.util.Optional;

import in.sujal.ecommerce.model.Product;

public interface ProductService {
  Product save(Product p);
  List<Product> findAll();
  Optional<Product> findById(Long id);
}