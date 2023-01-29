package com.tslp.dca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tslp.dca.models.Cart;
import com.tslp.dca.models.CartProduct;
import com.tslp.dca.repository.CartProductRepository;
import com.tslp.dca.repository.CartRepository;
//First and last 
//second
//third
@RestController
public class Controller {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private CartProductRepository cartProductRepository;
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCartProduct(@PathVariable("id") Integer id){
		Cart c = this.cartRepository.findById(id).get();
		c.getCartProducts().remove(0);
		CartProduct cp = cartProductRepository.findById(id).get();
		cartProductRepository.deleteById(id);
		System.out.println(c.getCartProducts().size());
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	@GetMapping("/")
	public ResponseEntity<?> getCart(){
		Cart cart = this.cartRepository.findById(1).get();
		System.out.println(cart.getCartProducts().size());
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
