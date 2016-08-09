package com.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dao.AdDao;
import com.model.AdBase;
import com.utils.MyBatisUtil;

public class MyBatisTest {
	private SqlSession sqlSession;

	@Before
	public void before() {
		sqlSession = MyBatisUtil.getSessionFactory().openSession();
	}

	@Test
	public void findAll() {
		System.out.println(sqlSession);
		AdDao adDao = sqlSession.getMapper(AdDao.class);
		List<AdBase> adBases = adDao.findAll();
		System.out.println(adBases);
	}

	@Test
	public void getAdBaseById() {
		System.out.println(sqlSession);
		AdDao adDao = sqlSession.getMapper(AdDao.class);
		AdBase adBase = adDao.getAdBaseById(100);
		System.out.println(adBase);
	}
	
	@Test
	public void getAdBaseByName() {
		System.out.println(sqlSession);
		AdDao adDao = sqlSession.getMapper(AdDao.class);
		AdBase adBase = adDao.getAdBaseByName("test");
		System.out.println(adBase);
	}

	@Test
	public void save(){
		AdBase adBase = new AdBase();
		adBase.setAdName("广告1");
		adBase.setPdateFrom(new Date());
		adBase.setPdateEnd(new Date());
		adBase.setCreateTime(new Date());
		AdDao adDao = sqlSession.getMapper(AdDao.class);
		System.out.println(adDao.save(adBase));
		sqlSession.commit();
	}
	@Test
	public void update(){
		AdBase adBase = new AdBase();
		adBase.setId(100);
		adBase.setAdName("广告w23rw");
		adBase.setPdateFrom(new Date());
		adBase.setPdateEnd(new Date());
		AdDao adDao = sqlSession.getMapper(AdDao.class);
		adDao.update(adBase);
		sqlSession.commit();
	}
	@After
	public void after() {
		sqlSession.close();
	}

}
