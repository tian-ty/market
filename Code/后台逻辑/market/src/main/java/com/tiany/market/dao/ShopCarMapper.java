package com.tiany.market.dao;

import com.tiany.market.entity.ShopCar;
import com.tiany.market.entity.ShopCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopCarMapper {
    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    long countByExample(ShopCarExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByExample(ShopCarExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insert(ShopCar record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insertSelective(ShopCar record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    List<ShopCar> selectByExample(ShopCarExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    ShopCar selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    ShopCar selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") ShopCar record, @Param("example") ShopCarExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExample(@Param("record") ShopCar record, @Param("example") ShopCarExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKeySelective(ShopCar record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKey(ShopCar record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByExample(@Param("example") ShopCarExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsert(@Param("list") List<ShopCar> list);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsertSelective(@Param("list") List<ShopCar> list, @Param("selective") ShopCar.Column ... selective);
}