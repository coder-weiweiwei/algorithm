package com.cyw.demo.ioc.Test;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class ApplicationContext {
        //bean配置文件路径
        private String path;

        public ApplicationContext(String path){
                this.path = path;
        }

        public Object getObject(String beanId) throws DocumentException {
                // 加载配置文件
                SAXReader saxReader =  new SAXReader();
                Document document = saxReader.read(this.getClass().getClassLoader().getResourceAsStream(path));
                // 获取根节点
                Element element = document.getRootElement();
                // 获取子节点
                List<Element> sonElements = element.elements();
                return null;
        }
}
