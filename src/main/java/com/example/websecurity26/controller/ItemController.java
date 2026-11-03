package com.example.websecurity26.controller;

import com.example.websecurity26.model.Item;
import com.example.websecurity26.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    private final ItemService service;

    public ItemController(ItemService service) { this.service = service; }

    @GetMapping
    public List<Item> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Item one(@PathVariable String id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item create(@RequestBody Item item) { return service.create(item); }

    @PutMapping("/{id}")
    public Item update(@PathVariable String id, @RequestBody Item item) { return service.update(id, item); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) { service.delete(id); }
}
