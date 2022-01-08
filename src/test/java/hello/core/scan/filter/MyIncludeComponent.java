package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)   // TYPE : Class Level에 붙음
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
