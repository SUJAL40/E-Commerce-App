package in.sujal.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sujal.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
