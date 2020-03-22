package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.Shopcar;
import com.hy.flowersweb.entity.ShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopcarMapper {
    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    long countByExample(ShopcarExample example);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int deleteByExample(ShopcarExample example);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int insert(Shopcar record);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int insertSelective(Shopcar record);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    List<Shopcar> selectByExample(ShopcarExample example);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    Shopcar selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int updateByExample(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int updateByPrimaryKeySelective(Shopcar record);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int updateByPrimaryKey(Shopcar record);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int batchInsert(@Param("list") List<Shopcar> list);

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Shopcar> list, @Param("selective") Shopcar.Column ... selective);
}