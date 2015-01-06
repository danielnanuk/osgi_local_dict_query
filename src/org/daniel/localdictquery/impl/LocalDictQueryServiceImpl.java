package org.daniel.localdictquery.impl;

import java.util.HashMap;
import java.util.Map;

import org.daniel.dictquery.query.QueryService;

/**
 * 从本地字典中查询单词
 * 
 * @author daniel
 *
 */
public class LocalDictQueryServiceImpl implements QueryService {
	private static final Map<String, String> localDict = new HashMap<String, String>();
	static {
		localDict.put("China", "中国");
		localDict.put("test", "测试");
	}

	@Override
	public String queryWord(String word) {
		System.out.println("LocalDictQueryServiceImpl.queryWord called!");
		String result = localDict.get(word);
		if (result == null) {
			result = "N/A";
		}
		return result;
	}

}
