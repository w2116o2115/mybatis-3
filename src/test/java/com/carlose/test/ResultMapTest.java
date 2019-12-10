package com.carlose.test;

import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.Configuration;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author Carlose wei
 * @version 1.0
 * @date 2019/11/29 17:35
 */
public class ResultMapTest {
  @Test
  public void printResultMapInfo() throws Exception {
    Configuration configuration = new Configuration();
    String resource = "com/carlose/test/ArticleMapper.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    XMLMapperBuilder builder = new XMLMapperBuilder(inputStream, configuration, resource, configuration.getSqlFragments());
    builder.parse();

    ResultMap resultMap = configuration.getResultMap("BaseResultMap");

    System.out.println("\n-------------------+✨ mappedColumns ✨+--------------------");
    System.out.println(resultMap.getMappedColumns());

    System.out.println("\n------------------+✨ mappedProperties ✨+------------------");
    System.out.println(resultMap.getMappedProperties());

    System.out.println("\n------------------+✨ idResultMappings ✨+------------------");
    resultMap.getIdResultMappings().forEach(rm -> System.out.println(simplify(rm)));

    System.out.println("\n---------------+✨ propertyResultMappings ✨+---------------");
    resultMap.getPropertyResultMappings().forEach(rm -> System.out.println(simplify(rm)));

    System.out.println("\n-------------+✨ constructorResultMappings ✨+--------------");
    resultMap.getConstructorResultMappings().forEach(rm -> System.out.println(simplify(rm)));

    System.out.println("\n-------------------+✨ resultMappings ✨+-------------------");
    resultMap.getResultMappings().forEach(rm -> System.out.println(simplify(rm)));

    inputStream.close();
  }

  /** 简化 ResultMapping 输出结果 */
  private String simplify(ResultMapping resultMapping) {
    return String.format("ResultMapping{column='%s', property='%s', flags=%s, ...}",
      resultMapping.getColumn(), resultMapping.getProperty(), resultMapping.getFlags());
  }
}
