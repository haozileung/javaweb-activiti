package com.haozileung.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.haozileung.test.pojo.apply.Apply;

/**
 * 
 * <p>
 * 类的简介说明
 * </p>
 * 创建时间：2014年3月3日 下午2:51:52
 * 
 * @author lianghaopeng
 * @version V1.0
 */
public interface ApplyRepository extends CrudRepository<Apply, Integer> {
	public Apply findOneByStatus(Integer status);
}
