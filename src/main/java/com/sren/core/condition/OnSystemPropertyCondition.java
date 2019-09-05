package com.sren.core.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午4:32
 * @Description:
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName = String.valueOf(attributes.get("name"));
        String propertyValue = String.valueOf(attributes.get("value"));

        String javaPropertyValue = "Mercy";
        return propertyValue.equals(javaPropertyValue);
    }
}
