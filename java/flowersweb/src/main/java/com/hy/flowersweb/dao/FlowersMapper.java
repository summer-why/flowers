package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.Flowers;
import com.hy.flowersweb.entity.FlowersExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FlowersMapper {
    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    long countByExample(FlowersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int deleteByExample(FlowersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int insert(Flowers record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int insertSelective(Flowers record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    List<Flowers> selectByExampleWithBLOBs(FlowersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    List<Flowers> selectByExample(FlowersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    Flowers selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int updateByExampleSelective(@Param("record") Flowers record, @Param("example") FlowersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") Flowers record, @Param("example") FlowersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int updateByExample(@Param("record") Flowers record, @Param("example") FlowersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int updateByPrimaryKeySelective(Flowers record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(Flowers record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int updateByPrimaryKey(Flowers record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int batchInsert(@Param("list") List<Flowers> list);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Flowers> list, @Param("selective") Flowers.Column ... selective);
}