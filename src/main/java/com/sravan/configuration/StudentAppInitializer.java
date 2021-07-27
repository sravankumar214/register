package com.sravan.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] configfiles = { StudentConfiguration.class };
		return configfiles;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mappings = { "/" };
		return mappings;
	}

}
