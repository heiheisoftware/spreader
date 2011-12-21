package com.nali.spreader.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;


/**
 * 图片处理帮助类
 * 
 * @author xiefei
 * 
 */
public class PhotoHelper {
	private static final Logger logger = Logger.getLogger(PhotoHelper.class);

	/**
	 * 获取某个配置文件的键值对
	 * 
	 * @param url
	 * @return
	 */
	public static Map<Object, Object> getPropertiesMap(String url) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		InputStream is = PhotoHelper.class.getResourceAsStream(url);
		try {
			if (is != null) {
				Properties prop = new Properties();
				prop.load(is);
				Set<Entry<Object, Object>> set = prop.entrySet();
				for (Entry<Object, Object> entry : set) {
					map.put(entry.getKey(), entry.getValue());
				}
			} else {
				logger.info("InputStream为空,请检查配置文件");
			}
		} catch (Exception e) {
			logger.info("未能读取头像类别配置文件", e);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					logger.info(e);
				}
			}
		}
		return map;
	}

	/**
	 * 获取随机整数
	 * 
	 * @param size
	 * @return
	 */
	public static int getRandomNum(int size) {
		Random rd = new Random();
		int t = rd.nextInt(size);
		return t;
	}
}
