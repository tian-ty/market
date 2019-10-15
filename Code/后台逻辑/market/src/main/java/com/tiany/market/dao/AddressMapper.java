package com.tiany.market.dao;

import com.tiany.market.entity.Address;
import com.tiany.market.entity.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddressMapper {
    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    long countByExample(AddressExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByExample(AddressExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insert(Address record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insertSelective(Address record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    List<Address> selectByExample(AddressExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    Address selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    Address selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKey(Address record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByExample(@Param("example") AddressExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsert(@Param("list") List<Address> list);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsertSelective(@Param("list") List<Address> list, @Param("selective") Address.Column ... selective);
}