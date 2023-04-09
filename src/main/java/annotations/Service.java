package annotations;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Service {
    String name();

    boolean lazyLoad() default false;

}
