package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.User;
import com.hy.flowersweb.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insert(User record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     * @param id
     */
    User selectByPrimaryKey(int id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKey(User record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsert(@Param("list") List<User> list);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsertSelective(@Param("list") List<User> list, @Param("selective") User.Column ... selective);
}