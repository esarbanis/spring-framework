package org.springframework.context.annotation;

import org.springframework.beans.support.YamlPropertySourceFactory;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@PropertySource(value = {}, factory = YamlPropertySourceFactory.class)
public @interface YamlPropertySource {

	@AliasFor(annotation = PropertySource.class)
	String value();

}
