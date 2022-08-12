package cn.zfy.custom.spring.boot.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;


@Configuration
@ConditionalOnProperty(prefix = "cn.zfy.custom", name = "enabled", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(CustomProperties.class)
public class CustomAutoConfiguration {


    @Resource
    private CustomProperties customProperties;

    @Bean
    @ConditionalOnMissingBean
    public CustomTemplate customTemplate() {
        return new CustomTemplate(customProperties.getPrefix(), customProperties.getSuffix());
    }


}
