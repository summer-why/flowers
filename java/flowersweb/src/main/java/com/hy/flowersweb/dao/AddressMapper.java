package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.Address;
import com.hy.flowersweb.entity.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddressMapper {
    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    long countByExample(AddressExample example);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int deleteByExample(AddressExample example);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int insert(Address record);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int insertSelective(Address record);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    List<Address> selectByExample(AddressExample example);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    Address selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int updateByPrimaryKey(Address record);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int batchInsert(@Param("list") List<Address> list);

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Address> list, @Param("selective") Address.Column ... selective);
}