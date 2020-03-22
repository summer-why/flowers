package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.Store;
import com.hy.flowersweb.entity.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StoreMapper {
    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    long countByExample(StoreExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByExample(StoreExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insert(Store record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insertSelective(Store record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    List<Store> selectByExample(StoreExample example);


//    List<Store> selectByStore();

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    Store selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKeySelective(Store record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKey(Store record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsert(@Param("list") List<Store> list);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Store> list, @Param("selective") Store.Column ... selective);
}