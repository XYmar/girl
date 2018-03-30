package com.xy.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String prettyLevel;

    private Integer age;

    public String getPrettyLevel() {
        return prettyLevel;
    }

    public void setPrettyLevel(String prettyLevel) {
        this.prettyLevel = prettyLevel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
