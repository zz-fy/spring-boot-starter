package cn.zfy.custom.spring.boot.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("cn.zfy.custom")
public class CustomProperties {

    private String prefix;

    private String suffix;

}
