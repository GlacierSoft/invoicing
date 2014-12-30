/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.basic.util;

import java.io.IOException;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * @ClassName: JackJson 
 * @Description: TODO(json转换辅助工具类) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:15:58
 */
public class JackJson {

    private static final Logger logger = LoggerFactory.getLogger(JackJson.class);

    /**
     * jackjson把json字符串转换为Java对象的实现方法
     * 
     * <pre>
     * return JackJson.fromJsonToObject(this.answersJson, new TypeReference&lt;List&lt;StanzaAnswer&gt;&gt;() {
     * });
     * </pre>
     * 
     * @param <T>
     *            转换为的java对象
     * @param json
     *            json字符串
     * @param typeReference
     *            jackjson自定义的类型
     * @return 返回Java对象
     */
    @SuppressWarnings("unchecked")
    public static <T> T fromJsonToObject(String json, TypeReference<T> typeReference) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (T) mapper.readValue(json, typeReference);
        } catch (JsonParseException e) {
            logger.error("JsonParseException: ", e);
        } catch (JsonMappingException e) {
            logger.error("JsonMappingException: ", e);
        } catch (IOException e) {
            logger.error("IOException: ", e);
        }
        return null;
    }

    /**
     * json转换为java对象
     * 
     * <pre>
     * return JackJson.fromJsonToObject(this.answersJson, JackJson.class);
     * </pre>
     * 
     * @param <T>
     *            要转换的对象
     * @param json
     *            字符串
     * @param valueType
     *            对象的class
     * @return 返回对象
     */
    public static <T> T fromJsonToObject(String json, Class<T> valueType) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, valueType);
        } catch (JsonParseException e) {
            logger.error("JsonParseException: ", e);
        } catch (JsonMappingException e) {
            logger.error("JsonMappingException: ", e);
        } catch (IOException e) {
            logger.error("IOException: ", e);
        }
        return null;
    }

    /**
     * java对象转换为json字符串
     * 
     * @param object
     *            Java对象
     * @return 返回字符串
     */
    public static String fromObjectToJson(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(Include.NON_NULL);
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            logger.error("JsonGenerationException: ", e);
        } catch (JsonMappingException e) {
            logger.error("JsonMappingException: ", e);
        } catch (IOException e) {
            logger.error("IOException: ", e);
        }
        return null;
    }

    /**
     * java对象转换为json字符串
     * 
     * @param object
     *            要转换的对象
     * @param filterName
     *            过滤器的名称
     * @param properties
     *            要过滤哪些字段
     * @return
     */
    public static String fromObjectToJson(Object object, String filterName, Set<String> properties) {
        ObjectMapper mapper = new ObjectMapper();
        FilterProvider filters = new SimpleFilterProvider().addFilter(filterName, SimpleBeanPropertyFilter.serializeAllExcept(properties));
        mapper.setSerializationInclusion(Include.NON_NULL);
        mapper.setFilters(filters);
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            logger.error("JsonGenerationException: ", e);
        } catch (JsonMappingException e) {
            logger.error("JsonMappingException: ", e);
        } catch (IOException e) {
            logger.error("IOException: ", e);
        }
        return null;
    }

    /**
     * java对象转换为json字符串
     * 
     * @param object
     *            要转换的对象
     * @param filterName
     *            过滤器的名称
     * @param properties
     *            要过滤的字段名称
     * @return
     */
    public static String fromObjectToJson(Object object, String filterName, String property) {
        ObjectMapper mapper = new ObjectMapper();
        FilterProvider filters = new SimpleFilterProvider().addFilter(filterName, SimpleBeanPropertyFilter.serializeAllExcept(property));
        mapper.setSerializationInclusion(Include.NON_NULL);
        mapper.setFilters(filters);
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            logger.error("JsonGenerationException: ", e);
        } catch (JsonMappingException e) {
            logger.error("JsonMappingException: ", e);
        } catch (IOException e) {
            logger.error("IOException: ", e);
        }
        return null;
    }

}
