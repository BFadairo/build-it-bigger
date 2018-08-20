package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)

public class MyEndpoint {

    /**
     * Endpoint method used to retrieve joke
     */
    @ApiMethod(name = "getJokeData")
    public MyBean getJokeData() {
        MyBean response = new MyBean();
        //response.getJokeData();
        response.setData(response.getJokeData());

        return response;
    }

}
