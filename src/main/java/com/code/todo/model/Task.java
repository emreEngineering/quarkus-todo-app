package com.code.todo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Task extends PanacheEntity {
    public String title;
    public boolean completed;
}
