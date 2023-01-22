package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.ItemDto;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired private ItemService itemService;
	
	@GetMapping
	public List<ItemDto> getAllItems(){
		return itemService.findAll();
	}

}
