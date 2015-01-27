package ru.somecompany;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * API is available here:        http://localhost:8080/gretty-jersey-app/rest/
 * Swagger is available here:    http://localhost:8080/gretty-jersey-app/rest/api-docs
 * WADL is available here:       http://localhost:8080/gretty-jersey-app/rest/application.wadl
 *
 * @author elwood
 */
public class WebAppListener implements ServletContextListener {
    private BeanConfig beanConfig;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setBasePath("http://localhost:8080/api");

        // This doesn't work
        //beanConfig.setResourcePackage("ru.somecompany.rest1,ru.somecompany.rest2");

        // This works, but publishes ru.somecompany.rest2 and ru.somecompany too
        beanConfig.setResourcePackage("ru.somecompany.rest1");

        beanConfig.setScan(true);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
