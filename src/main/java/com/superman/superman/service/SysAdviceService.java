package com.superman.superman.service;

import com.superman.superman.model.SysAdvice;
import com.superman.superman.model.SysJhAdviceOder;
import com.superman.superman.utils.PageParam;

import java.util.List;
import java.util.Map;

/**
 * @author heguoliang
 * @Description: TODO(通知表)
 * @date 2018-12-22 18:05:59
 */
public interface SysAdviceService {
	
	SysAdvice queryObject(Integer id);
	
	List<SysAdvice> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	Integer countListOderAdvice(Long uid);
	
	void save(SysAdvice advice);
	
	void update(SysAdvice advice);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);


	List<SysJhAdviceOder> queryListOderAdvice(Long uid,PageParam pageParam);

}
