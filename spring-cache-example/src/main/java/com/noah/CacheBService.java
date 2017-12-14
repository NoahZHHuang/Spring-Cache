package com.noah;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
//In a class, if the results from all methods are stored in same cache, we can put @CacheConfig(cacheNames="***") in front of this class
@CacheConfig(cacheNames="CacheB")
public class CacheBService {

	@Cacheable
	public String getDataFromCacheB() {
		return "The number from \"Cache B\" is " + (int) (Math.random() * 100);
	}

}
