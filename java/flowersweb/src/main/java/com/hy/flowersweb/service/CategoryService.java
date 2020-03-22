package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.Category;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
public interface CategoryService {
    List<Category> categoryList();
    Category categoryDetail(int id);
    int addCategory(Category category);
    int updateCategory(Category category);
    int delCategory(int id);
}
