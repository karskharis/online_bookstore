package com.karkharis.onlinebookstore.repository;

import com.karkharis.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}
