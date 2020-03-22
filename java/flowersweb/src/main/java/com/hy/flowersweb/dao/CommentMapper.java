package com.hy.flowersweb.dao;

import com.hy.flowersweb.entity.Comment;
import com.hy.flowersweb.entity.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommentMapper {
    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    long countByExample(CommentExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByExample(CommentExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insert(Comment record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int insertSelective(Comment record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int updateByPrimaryKey(Comment record);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsert(@Param("list") List<Comment> list);

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Comment> list, @Param("selective") Comment.Column ... selective);
}