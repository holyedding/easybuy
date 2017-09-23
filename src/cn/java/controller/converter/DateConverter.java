/**
 * Project Name:springmvc-1
 * File Name:DateConverter.java
 * Package Name:cn.java.controller.converter
 * Date:Sep 17, 20172:16:13 PM
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * Description: <br/>
 * Date: Sep 17, 2017 2:16:13 PM <br/>
 * 
 * @author huMZ
 * @version
 * @see
 */

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {

		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
					.parse(source);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}

	}

}
