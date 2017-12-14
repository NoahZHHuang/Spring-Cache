package com.noah;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheAService {

	@Cacheable(cacheNames="CacheA")
	public String getDataFromCacheA() {
		return "The number from \"Cache A\" is " + (int) (Math.random() * 100);
	}
	
	/*
	 there are two common cache annotation @CachePut & @CacheEvict
	 scenarios
	 #1 if you update or save a record in DB table called "Student", and you want to make it take effect in cache at once, then 
	    @CachePut(value="studentCache",key="#student.getId()")
	 #2 if you remove a recode in DB table called "Student", then
	    @CacheEvict(value="studentCache",key="#student.getId()")
	 #3 if you want to clear all the student cache, then you can do it like
	    @CacheEvict(value="studentCache",allEntries=true)
        public void reload() {
     		reloadAll()
		}
	 * */
	
	//Spring integrate with EhCache , detail can refer to
	//http://blog.csdn.net/whatlookingfor/article/details/51833378

}
