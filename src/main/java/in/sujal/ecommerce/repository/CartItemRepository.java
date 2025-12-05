package in.sujal.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sujal.ecommerce.model.CartItem;
import in.sujal.ecommerce.model.User;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
	  List<CartItem> findByUser(User user);
}
