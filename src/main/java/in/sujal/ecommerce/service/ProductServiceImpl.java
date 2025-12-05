package in.sujal.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.sujal.ecommerce.model.Product;
import in.sujal.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
  private final ProductRepository productRepository;
  public ProductServiceImpl(ProductRepository productRepository){this.productRepository=productRepository;}

  @Override public Product save(Product p){ return productRepository.save(p); }
  @Override public List<Product> findAll(){ return productRepository.findAll(); }
  @Override public Optional<Product> findById(Long id){ return productRepository.findById(id); }
}