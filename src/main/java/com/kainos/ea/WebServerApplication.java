package com.kainos.ea;

import com.kainos.ea.resources.WebService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.*;

public class WebServerApplication extends Application<WebServerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new WebServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "WebServer";
    }

    @Override
    public void initialize(final Bootstrap<WebServerConfiguration> bootstrap) {
        // TODO: application initialization
        bootstrap.addBundle(new SwaggerBundle<WebServerConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(WebServerConfiguration configuration) {
                return configuration.getSwagger();
            }
        });
    }

    @Override
    public void run(final WebServerConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new WebService());
        // TODO: implement application
    }


}
