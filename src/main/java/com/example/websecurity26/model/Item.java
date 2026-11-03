package com.example.websecurity26.model;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document("items")
public class Item {
    @Id private String id;
    private String name;
    private String description;

    @CreatedDate private Instant createdDate;
    @LastModifiedDate private Instant lastModifiedDate;
    @CreatedBy private String createdBy;
    @LastModifiedBy private String lastModifiedBy;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Instant getCreatedDate() { return createdDate; }
    public Instant getLastModifiedDate() { return lastModifiedDate; }
    public String getCreatedBy() { return createdBy; }
    public String getLastModifiedBy() { return lastModifiedBy; }
}
