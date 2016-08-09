package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.model.AdBase;

/**
 * 广告Dao
 * 
 * @author wangyc
 *
 */
public interface AdDao {
	@Select("select * from ad_base")
	@ResultMap("BaseResultMap")
	List<AdBase> findAll();

	AdBase getAdBaseById(long id);

	int save(AdBase adBase);

	int delete(AdBase adBase);

	int update(AdBase adBase);

	@Select("select * from ad_base where ad_name like CONCAT('%',#{name},'%')")
	@ResultMap("BaseResultMap")
	AdBase getAdBaseByName(String name);
}
