package com.i2i.config;


   import org.springframework.stereotype.Component;
   import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

   import javax.servlet.Filter;

public class EmployeeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[]{WebConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[0];
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] {"/"};
        }

        @Override
        protected Filter[] getServletFilters() {
            return new Filter[]{new EmployeeFilter()};
        }
    }
