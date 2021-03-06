package com.egypt.daily.life.shopping.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egypt.daily.life.shopping.model.Cart;
import com.egypt.daily.life.shopping.model.User;

@Repository
@Transactional
public interface CartRepository extends CrudRepository<Cart, Long>{
	
	List<Cart> findByUser(User user) ;
	List<Cart> findAllByUserId(Long id) ;
	
	List<Cart> findAllByIsOrdered(boolean b) ;
	
	List<Cart> findAllByIsOrderedAndUserId(boolean b , Long id) ;
	
	Cart findByUserId(Long id) ;
}
