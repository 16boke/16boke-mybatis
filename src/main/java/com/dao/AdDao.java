package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
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
	
	//使用list参数来查询多个id
	List<AdBase> findByIdsList(List<Long>ids);
	
	//使用Array参数来查询多个id
	List<AdBase> findByIdsArray(Long[]ids);
	
	/**
	 * 有多个参数的情况，且一个参数为id数组
	 * 当查询的参数有多个时,例如 findByNameAndIds(String adName, Long[] ids)
	 * 这种情况需要特别注意，在传参数时，一定要改用Map方式, 这样在collection属性可以指定名称也就是为ids
	 * @param params
	 * @return
	 */
	List<AdBase> findByNameAndIds(Map<String, Object> params);
	
	List<AdBase> findByNameAndId1(String adName,Long id);
	List<AdBase> findByNameAndId2(@Param("adName") String adName,@Param("id") Long id);
}
