package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.ItemDto;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired private ItemRepository itemRepository;
	@Autowired private ModelMapper modelMapper;

	@Override
	public List<ItemDto> findAll() {
		return itemRepository.findAll().parallelStream()
				.map(item -> modelMapper.map(item, ItemDto.class)).collect(Collectors.toList());
	}

}
