package com.napster;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.*;

public class ApplicationIinitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletCxt) throws ServletException {
        // ------------------ region RootContext creation and registration ----------------------
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class);
        rootContext.refresh();

        servletCxt.addListener(new ContextLoaderListener(rootContext));
        // ------------------- endregion RootContext creation and registration ----------------------

        // ------------------ region ServletContext creation and registration ----------------------
        AnnotationConfigWebApplicationContext servletRegisterer = new AnnotationConfigWebApplicationContext();
        servletRegisterer.register(WebMvcConfig.class);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("servlet",
                new DispatcherServlet(servletRegisterer));
        // ------------------ endregion ServletContext creation and registration ----------------------

        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
