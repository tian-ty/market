package com.tiany.market.dao;

import com.tiany.market.entity.User;
import com.tiany.market.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insert(User record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    User selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKey(User record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByExample(@Param("example") UserExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsert(@Param("list") List<User> list);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsertSelective(@Param("list") List<User> list, @Param("selective") User.Column ... selective);
}