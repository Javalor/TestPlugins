package io.restfulness.stereotype;

import io.javalor.componentscanner.annotation.JustTetsting;
import io.restfulness.microservice.annotation.stereotype.Microservice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Microservice
@Target({ElementType.TYPE, ElementType. ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JustTetsting(primtiveInt = 2, value = {"Hello123","Hi"})
public @interface NewAnnotation
{
}
