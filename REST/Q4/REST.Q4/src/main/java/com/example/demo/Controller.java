package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	service card;

	@GetMapping("/card/{cardNo}")
	public String getCard(@PathVariable long cardNo) {
		return card.getCardType(cardNo);
	}
}