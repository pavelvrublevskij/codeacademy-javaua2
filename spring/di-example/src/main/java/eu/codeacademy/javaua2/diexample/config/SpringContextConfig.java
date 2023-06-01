package eu.codeacademy.javaua2.diexample.config;

import eu.codeacademy.javaua2.diexample.dao.ExternalMarksDao;
import eu.codeacademy.javaua2.diexample.dao.InternalMarksDao;
import eu.codeacademy.javaua2.diexample.dao.MarksDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"eu.codeacademy.javaua2.diexample.*"})
public class SpringContextConfig {

    @Bean
    public MarksDao marksInternalDao() {
        return new InternalMarksDao();
    }

    @Bean
    public MarksDao marksExternalDao() {
        return new ExternalMarksDao();
    }
}
