package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.ViewWeboguanRecommend;
import org.jinyuanjava.litemall.db.domain.ViewWeboguanRecommendExample;
import org.jinyuanjava.litemall.db.domain.ViewWeboguanRecommendWithBLOBs;

public interface ViewWeboguanRecommendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    long countByExample(ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    int deleteByExample(ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    int insert(ViewWeboguanRecommendWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    int insertSelective(ViewWeboguanRecommendWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewWeboguanRecommend selectOneByExample(ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewWeboguanRecommendWithBLOBs selectOneByExampleSelective(@Param("example") ViewWeboguanRecommendExample example, @Param("selective") ViewWeboguanRecommendWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewWeboguanRecommendWithBLOBs selectOneByExampleWithBLOBs(ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ViewWeboguanRecommendWithBLOBs> selectByExampleSelective(@Param("example") ViewWeboguanRecommendExample example, @Param("selective") ViewWeboguanRecommendWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    List<ViewWeboguanRecommendWithBLOBs> selectByExampleWithBLOBs(ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    List<ViewWeboguanRecommend> selectByExample(ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewWeboguanRecommendWithBLOBs record, @Param("example") ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ViewWeboguanRecommendWithBLOBs record, @Param("example") ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewWeboguanRecommend record, @Param("example") ViewWeboguanRecommendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_weboguan_recommend
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ViewWeboguanRecommendExample example);
}