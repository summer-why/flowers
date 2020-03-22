package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.Orders;
import com.hy.flowersweb.entity.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrdersMapper {
    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    long countByExample(OrdersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByExample(OrdersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByPrimaryKey(Integer order_number);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insert(Orders record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insertSelective(Orders record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    Orders selectByPrimaryKey(Integer order_number);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKey(Orders record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsert(@Param("list") List<Orders> list);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Orders> list, @Param("selective") Orders.Column ... selective);
}