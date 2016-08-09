package com.test;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dao.AdDao;
import com.model.AdBase;
import com.utils.MyBatisUtil;

public class MyBatisTest {
	private SqlSession sqlSession;
	private AdDao adDao;

	@Before
	public void before() {
		sqlSession = MyBatisUtil.getSessionFactory().openSession();
		adDao = sqlSession.getMapper(AdDao.class);
	}

	@Test
	public void findAll() {
		List<AdBase> adBases = adDao.findAll();
		System.out.println(adBases);
	}

	@Test
	public void getAdBaseById() {
		AdBase adBase = adDao.getAdBaseById(100);
		System.out.println(adBase);
	}

	@Test
	public void getAdBaseByName() {
		AdBase adBase = adDao.getAdBaseByName("test");
		System.out.println(adBase);
	}

	@Test
	public void save() {
		AdBase adBase = new AdBase();
		adBase.setAdName("广告1");
		adBase.setPdateFrom(new Date());
		adBase.setPdateEnd(new Date());
		adBase.setCreateTime(new Date());
		System.out.println(adDao.save(adBase));
		sqlSession.commit();
	}

	@Test
	public void update() {
		AdBase adBase = new AdBase();
		adBase.setId(100);
		adBase.setAdName("广告w23rw");
		adBase.setPdateFrom(new Date());
		adBase.setPdateEnd(new Date());
		adDao.update(adBase);
		sqlSession.commit();
	}

	@Test
	public void findByIdsList() {
		List<AdBase> adBases = adDao.findByIdsList(Arrays.asList(new Long[] { 100L, 102L }));
		System.out.println(adBases);
	}

	@Test
	public void findByIdsArray() {
		List<AdBase> adBases = adDao.findByIdsArray(new Long[] { 100L, 102L });
		System.out.println(adBases);
	}

	@Test
	public void findByNameAndIds() {
		Map<String, Object> params = new HashMap<String, Object>(2);
		params.put("adName", "w");
		params.put("ids", Arrays.asList(new Long[] { 100L, 102L }));
		//params.put("ids", new Long[] { 100L, 102L });
		List<AdBase> adBases = adDao.findByNameAndIds(params);
		System.out.println(adBases);
	}
	
	@Test
	public void findByNameAndId1() {
		List<AdBase> adBases = adDao.findByNameAndId1("w",100L);
		System.out.println(adBases);
	}
	@Test
	public void findByNameAndId2() {
		List<AdBase> adBases = adDao.findByNameAndId2("w",100L);
		System.out.println(adBases);
	}

	@After
	public void after() {
		sqlSession.close();
	}

}
