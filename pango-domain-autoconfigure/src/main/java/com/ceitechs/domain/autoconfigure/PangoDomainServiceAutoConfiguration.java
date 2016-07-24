package com.ceitechs.domain.autoconfigure;

import com.ceitechs.domain.service.config.PangoDomainServiceConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author iddymagohe
 * @since 1.0
 */
@Configuration
@EnableConfigurationProperties(PangoDomainServiceProperties.class)
@Import(PangoDomainServiceConfig.class)
public class PangoDomainServiceAutoConfiguration {


}
