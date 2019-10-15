package com.tiany.market.dao;

import com.tiany.market.entity.Goods;
import com.tiany.market.entity.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsMapper {
    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    long countByExample(GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByExample(GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insert(Goods record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int insertSelective(Goods record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    Goods selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    Goods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Goods record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int updateByPrimaryKey(Goods record);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByExample(@Param("example") GoodsExample example);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int logicalDeleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsert(@Param("list") List<Goods> list);

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    int batchInsertSelective(@Param("list") List<Goods> list, @Param("selective") Goods.Column ... selective);
}