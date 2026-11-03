package com.example.websecurity26.service;

import com.example.websecurity26.model.Item;
import com.example.websecurity26.repository.ItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
public class ItemService {
    private final ItemRepository repo;

    public ItemService(ItemRepository repo) { this.repo = repo; }

    public List<Item> findAll() { return repo.findAll(); }

    public Item findById(String id) {
        return repo.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found"));
    }

    public Item create(Item item) {
        item.setId(null);
        return repo.save(item);
    }

    public Item update(String id, Item in) {
        Item item = findById(id);
        item.setName(in.getName());
        item.setDescription(in.getDescription());
        return repo.save(item);
    }

    public void delete(String id) { repo.delete(findById(id)); }
}
