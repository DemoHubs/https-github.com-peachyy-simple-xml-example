package com.peachyy.simplexml;

import org.simpleframework.xml.*;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Root
public class Example {   
  
        @Element
        private String text;   
  
        @Attribute
        private int index;   
  
        @Element()   
        private boolean flag;   
  
        @Element(required = false)   
        private Integer num;   
  
        @ElementList(required = false, entry = "strs",type = String.class,inline=false)
        private List<String> slist = new ArrayList<String>();
  
        public Example() {   
                super();   
        }   
  
        public Example(String text, int index) {   
                this.text = text;   
                this.index = index;   
               slist.add("sdf");
                slist.add("sdf1");
        }   
  
        public String getMessage() {   
                return text;   
        }   
  
        public int getId() {   
                return index;   
        }   
  
  
        public static void main(String[] args) throws Exception {   
                Serializer serializer = new Persister();
                Example example = new Example("ExampleText", 222);
                File result = new File("d://ExampleText.xml");
                serializer.write(example, result);   
  
  
                Example _obj = serializer.read(Example.class, result);   
                System.out.println(_obj.getMessage());   
  
  
        }   
}  