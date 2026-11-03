package com.example.websecurity26.repository;

import com.example.websecurity26.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {}
