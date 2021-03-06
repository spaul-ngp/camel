/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.redis;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RedisEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("host", java.lang.String.class);
        map.put("port", java.lang.Integer.class);
        map.put("channels", java.lang.String.class);
        map.put("command", org.apache.camel.component.redis.Command.class);
        map.put("connectionFactory", org.springframework.data.redis.connection.RedisConnectionFactory.class);
        map.put("redisTemplate", org.springframework.data.redis.core.RedisTemplate.class);
        map.put("serializer", org.springframework.data.redis.serializer.RedisSerializer.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("listenerContainer", org.springframework.data.redis.listener.RedisMessageListenerContainer.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RedisEndpoint target = (RedisEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channels": target.getConfiguration().setChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "command": target.getConfiguration().setCommand(property(camelContext, org.apache.camel.component.redis.Command.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.getConfiguration().setConnectionFactory(property(camelContext, org.springframework.data.redis.connection.RedisConnectionFactory.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "listenercontainer":
        case "listenerContainer": target.getConfiguration().setListenerContainer(property(camelContext, org.springframework.data.redis.listener.RedisMessageListenerContainer.class, value)); return true;
        case "redistemplate":
        case "redisTemplate": target.getConfiguration().setRedisTemplate(property(camelContext, org.springframework.data.redis.core.RedisTemplate.class, value)); return true;
        case "serializer": target.getConfiguration().setSerializer(property(camelContext, org.springframework.data.redis.serializer.RedisSerializer.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RedisEndpoint target = (RedisEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channels": return target.getConfiguration().getChannels();
        case "command": return target.getConfiguration().getCommand();
        case "connectionfactory":
        case "connectionFactory": return target.getConfiguration().getConnectionFactory();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "listenercontainer":
        case "listenerContainer": return target.getConfiguration().getListenerContainer();
        case "redistemplate":
        case "redisTemplate": return target.getConfiguration().getRedisTemplate();
        case "serializer": return target.getConfiguration().getSerializer();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

