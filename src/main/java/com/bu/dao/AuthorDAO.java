package com.bu.dao;

import com.bu.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDAO extends JpaRepository<Author, Integer> {


}
