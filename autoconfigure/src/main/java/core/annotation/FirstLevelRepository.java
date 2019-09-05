package core.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午2:14
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";
}
