package com.peachyy.simplexml.fz;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.filter.Filter;
import org.simpleframework.xml.filter.MapFilter;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xsTao on 2016/7/27.
 */
public class MapFilterTeset {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("lure.company", "笑笑笑");//变量值替换XML中的表达式
        Filter filter = new MapFilter(map);

        Serializer serializer = new Persister(filter);
        URL url=MapFilterTeset.class.getClassLoader().getResource("lure2.xml");
        File source = new File(url.getFile());

        Lure lure = null;
        try {
            lure = serializer.read(Lure.class, source);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(lure.getCompany());
        System.out.println(lure.getModel());
        System.out.println(lure.getQuantityInStock());
        System.out.println(lure.getType());
    }
}
