package cn.zfy.custom.spring.boot.autoconfigure;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

@AllArgsConstructor
@NoArgsConstructor
public class CustomTemplate {

    private static final Logger logger = LoggerFactory.getLogger(CustomTemplate.class);

    private String prefix;

    private String suffix;


    public String wrap(String target) {
        checkPrefixOrSuffixEmpty();
        logger.info("前缀:{},目标字符串:{},后缀:{}", prefix, target, suffix);
        return prefix.concat(target).concat(suffix);
    }

    private void checkPrefixOrSuffixEmpty() {
        if (StringUtils.isEmpty(prefix) || StringUtils.isEmpty(suffix))
            throw new RuntimeException("prefix or suffix may empty....");
    }


}
