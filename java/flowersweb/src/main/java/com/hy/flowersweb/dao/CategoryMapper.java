package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.Category;
import com.hy.flowersweb.entity.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryMapper {
    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    long countByExample(CategoryExample example);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int deleteByExample(CategoryExample example);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int insert(Category record);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int insertSelective(Category record);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    Category selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int updateByPrimaryKey(Category record);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int batchInsert(@Param("list") List<Category> list);

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Category> list, @Param("selective") Category.Column ... selective);
}