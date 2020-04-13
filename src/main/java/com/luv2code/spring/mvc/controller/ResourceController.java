package com.luv2code.spring.mvc.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;


public class ResourceController {
    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/images/{imageName}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody  byte[] getImage(@PathVariable String imageName) throws IOException {
        InputStream in = servletContext.getResourceAsStream("/images/" + imageName + ".png");
        return IOUtils.toByteArray(in);
    }

    @RequestMapping(value = "/css/{cssName}", method = RequestMethod.GET,
            produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody  byte[] getCss(@PathVariable String cssName) throws IOException {
        InputStream in = servletContext.getResourceAsStream("/css/" + cssName + ".css");
        return IOUtils.toByteArray(in);
    }

}
