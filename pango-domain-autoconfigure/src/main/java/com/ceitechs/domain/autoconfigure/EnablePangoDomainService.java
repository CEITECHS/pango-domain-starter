package com.ceitechs.domain.autoconfigure;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author iddymagohe
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(PangoDomainServiceAutoConfiguration.class)
@Documented
public @interface EnablePangoDomainService {
}
