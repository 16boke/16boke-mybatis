package com.dao;

import java.util.List;

import com.model.AdpBase;

/**
 * 广告位Dao
 * 
 * @author wangyc
 *
 */
public interface AdpDao {
	AdpBase getAdpBaseById(long id);

	List<AdpBase> findAll();

	int save(AdpBase adpBase);

	int delete(AdpBase adpBase);

	int update(AdpBase adpBase);
}
