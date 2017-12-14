package com.noah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {
	
	@Autowired
	private CacheAService cacheAService;

	@Autowired
	private CacheBService cacheBService;
	
	@RequestMapping("/CacheA")
	private String getCacheA(){
		return cacheAService.getDataFromCacheA();
	}
	
	@RequestMapping("/CacheB")
	private String getCacheB(){
		return cacheBService.getDataFromCacheB();
	}

}
