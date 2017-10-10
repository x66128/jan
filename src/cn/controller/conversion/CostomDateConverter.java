package cn.controller.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 将请求字符串转换成java的日期类型
 * 
 * @author mybatis
 *
 */
public class CostomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		//将日期串转换成日期类型
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
