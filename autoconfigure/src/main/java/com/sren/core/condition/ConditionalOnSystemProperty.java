package core.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午4:30
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    String name();

    String value();
}
