package com.hy.flowersweb.service.impl;

import com.hy.flowersweb.dao.CategoryMapper;
import com.hy.flowersweb.entity.Category;
import com.hy.flowersweb.entity.CategoryExample;
import com.hy.flowersweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> categoryList() {
        CategoryExample example = new CategoryExample();
        List<Category> categoryList = categoryMapper.selectByExample(example);
        return categoryList;
    }

    @Override
    public Category categoryDetail(int id) {
        Category categoryDetail = categoryMapper.selectByPrimaryKey(id);
        return categoryDetail;
    }

    @Override
    public int addCategory(Category category) {
        return categoryMapper.insertSelective(category);
    }

    @Override
    public int updateCategory(Category category) {
        CategoryExample example = new CategoryExample();
        example.or().andIdEqualTo(category.getId());
        return categoryMapper.updateByExampleSelective(category,example);
    }

    @Override
    public int delCategory(int id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }
}
