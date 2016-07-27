package com.peachyy.simplexml.fz;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xsTao on 2016/7/27.
 */
public class fzTest {
    public static void main(String[] args) {
        try {
            Serializer serializer = new Persister();
            AdvancedLure lure = new AdvancedLure();
            lure.setCompany("Donzai");
            lure.setModel("Marlin Buster");
            lure.setQuantityInStock(23);
            lure.setType("Trolling");

            ConfigurationScheme configurationScheme = new ConfigurationScheme();
            configurationScheme.setColor("Blue");
            configurationScheme.setSize(3);
            lure.setConfigurationScheme(configurationScheme);
            ConfigurationScheme configurationScheme2 = new ConfigurationScheme();
            configurationScheme2.setColor("Blue");
            configurationScheme2.setSize(3);
            List<ConfigurationScheme> lures = new ArrayList<ConfigurationScheme>();
            lures.add(configurationScheme);
            lures.add(configurationScheme2);
            lure.setSchemes(lures);
            File result = new File("d:/advancedlure.xml");
            serializer.write(lure, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
