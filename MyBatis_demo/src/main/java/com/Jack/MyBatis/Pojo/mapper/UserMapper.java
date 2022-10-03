package com.Jack.MyBatis.Pojo.mapper;
//創建 Mapper 接口，當等於Dao 為了映射文件
public interface UserMapper {
    /***
     * MyBatis 面向接口編程兩個一致
     * 1.映射文件的namespace 要和 mapper接口的package 一致
     * 2.映射文件中的SQL語句的ID要和Mapper 接口中方法名一致
     * Table->POJO->Mapper接口->映射文件xml
     */
    /***
     * insert
     */
    int insertUser();
}
