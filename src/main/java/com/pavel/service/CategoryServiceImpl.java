package com.pavel.service;

import com.pavel.dao.CategoriesDao;
import com.pavel.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoriesDao categoriesDao;

    @Override
    public Optional<List<Category>> getAll() {
        return categoriesDao.getAll();
    }
}
