package com.peachyy.simplexml.fz;

import org.simpleframework.xml.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xsTao on 2016/7/27.
 */
@Root( strict=false)
@Namespace(reference="http://blog.seoui.com/simple-demo")
public class AdvancedLure {
    @Attribute
    private String type;

    @Element
    private String company;

    @Element
    private int quantityInStock;

    @Element
    private String model;

    @Element
    private ConfigurationScheme configurationScheme;
    @ElementList(required = false,entry = "sch",inline=false)
    private List<ConfigurationScheme> schemes;
    public String getType() {
        return type;
    }

    public List<ConfigurationScheme> getSchemes() {
        return schemes;
    }

    public void setSchemes(List<ConfigurationScheme> schemes) {
        this.schemes = schemes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ConfigurationScheme getConfigurationScheme() {
        return configurationScheme;
    }

    public void setConfigurationScheme(ConfigurationScheme configurationScheme) {
        this.configurationScheme = configurationScheme;
    }
}
