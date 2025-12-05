package in.sujal.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sujal.ecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
