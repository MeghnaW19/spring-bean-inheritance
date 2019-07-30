package com.stackroute;

import com.stackroute.annotationbasedbeandefinitioninheritance.config.AppConfig;
import com.stackroute.annotationbasedbeandefinitioninheritance.domain.EPubBook;
import com.stackroute.xmlbasedbeandefinitioninheritance.domain.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanDefinitionInheritanceDemoApplication {

    public static void main(String[] args) {
        //XML based Bean Definition Test
        System.out.println("XML based Bean Definition Inheritance Test");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Book book = (Book) context.getBean("BookBean");
        System.out.println("Book Details: " + book);
    }

}
