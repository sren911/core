package core.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午3:56
 * @Description:
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloImportSelector.class)
public @interface EnableHelloWorld {
}
