package com.web.library.dao.ex.entity;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TBookInfoMapperEx {


  /**
   * @method: TBookInfoMapperEx
   * @discription:
   * @projectPass: library_web.com.web.library.dao.ex.entity.TBookInfoMapperEx.java
   * @return List<TBookInfoEx>
   */
  List<TBookInfoEx> selectBookInfo();

  /**
   * @method: TBookInfoMapperEx
   * @discription:
   * @projectPass: library_web.com.web.library.dao.ex.entity.TBookInfoMapperEx.java
   * @return List<TBookInfoEx>
   */
  List<TBookInfoEx> selectCheckedBooksList(@Param("checkedList") String[] list);
}