/**
 * @date 2018/06/03
 * @class: cCommonSessionFactory.java
 * @discription:
 *
 */
package com.web.library.domain.service.common;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * セッションファクトリ.
 *
 */
public class CommonFactory {


  /**
   * sqlSessionFactory
   */
  private static SqlSessionFactory sqlSessionFactory;


  /**
   * @method: CommonFactory
   * @discription: ファクトリのインスタンスの取得.
   * @projectPass: library_web.com.web.library.domain.service.common.CommonFactory.java
   * @return
   * SqlSessionFactory
   */
  public static SqlSessionFactory getSqlSessionFactory() {

    if (sqlSessionFactory == null) {
      try {
        // resources直下のmybatis-config.xmlを読み込み
        Reader r = Resources.getResourceAsReader("mybatis-config.xml");

        // 読み込んだ設定ファイルからSqlSessionFactoryを生成
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(r);

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return sqlSessionFactory;
  }

  /**
   * @method: CommonFactory
   * @discription:
   * @projectPass: library_web.com.web.library.domain.service.common.CommonFactory.java
   * @return SqlSession
   */
  public static SqlSession openSession() {
    return getSqlSessionFactory().openSession();
  }
}
