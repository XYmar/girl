package com.xy.girl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Girl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String prettyLevel;

    @Min(value = 18,message = "未成年少女禁止入内")
    private Integer age;

    @NotNull(message = "金额必传")
    private Double money;

    public Girl() {
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", prettyLevel='" + prettyLevel + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
