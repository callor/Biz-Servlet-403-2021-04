package com.callor.todo.service;

import java.util.List;
import java.util.Map;

public interface TodoService {

	public List<Map<String,Object>> selectAll();
	public Map<String,Object> findById(Long seq);
	
	public Integer insert(Map<String,Object> vo);
	public Integer update(Map<String,Object> vo);
	public Integer delete(Long seq);
	
}
