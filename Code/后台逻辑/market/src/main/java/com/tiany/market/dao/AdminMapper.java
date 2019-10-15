package com.tiany.market.dao;

import com.tiany.market.entity.Admin;
import com.tiany.market.entity.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {
    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    long countByExample(AdminExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByExample(AdminExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insert(Admin record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insertSelective(Admin record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKey(Admin record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsert(@Param("list") List<Admin> list);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsertSelective(@Param("list") List<Admin> list, @Param("selective") Admin.Column ... selective);
}