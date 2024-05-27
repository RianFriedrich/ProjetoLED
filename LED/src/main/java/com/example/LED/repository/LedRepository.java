package com.example.LED.repository;

import com.example.LED.model.Estado;
import org.springframework.data.repository.CrudRepository;

public interface LedRepository extends CrudRepository<Estado,Integer> {
}
