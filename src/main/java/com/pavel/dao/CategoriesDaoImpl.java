package com.pavel.dao;

import com.pavel.dao.templates.CategoryJdbcTemplate;
import com.pavel.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriesDaoImpl implements CategoriesDao {

    @Autowired
    private CategoryJdbcTemplate template;


    @Override
    public Optional<List<Category>> getAll() {
        return template.getAll();
    }
}
