package io.restfulness.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@NewAnnotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NewAnnotation2 {
}
