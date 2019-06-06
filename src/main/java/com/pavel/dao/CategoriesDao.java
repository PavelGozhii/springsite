package com.pavel.dao;

import com.pavel.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoriesDao {

    Optional<List<Category>> getAll();
}
