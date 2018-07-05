package com.web.library.dao.generate.entity;

import com.web.library.dao.generate.entity.TUserInfo;
import com.web.library.dao.generate.entity.TUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    long countByExample(TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int deleteByExample(TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int insert(TUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int insertSelective(TUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    List<TUserInfo> selectByExample(TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    TUserInfo selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int updateByExampleSelective(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int updateByExample(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int updateByPrimaryKeySelective(TUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    int updateByPrimaryKey(TUserInfo record);
}