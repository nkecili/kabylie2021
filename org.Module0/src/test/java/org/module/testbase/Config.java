package org.module.testbase;

import base.WebAPI;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config extends WebAPI {


    //    public static Connection conect ;
    //com.statefarm.project.qa.pages
    public Properties loadProperties() throws IOException {
        Properties prop = new Properties();

        //InputStream ism = new FileInputStream("/secret.properties");
        InputStream ism = new FileInputStream("src/main/resources/config.properties");
        prop.load(ism);
        //    conect=  DriverManager.getConnection(String url,String os,);
        boolean useCloudEnv = Boolean.parseBoolean(prop.getProperty("module0.useCloudEnv "));
        String cloudEnvName = prop.getProperty("module0.cloudEnvName");
        String os = prop.getProperty("module0.os");
        String os_version = prop.getProperty("module0.os_version");
        String browserName = prop.getProperty("module0.browserName");
        String browserVersion = prop.getProperty("module0.browserVersion");
        String url = prop.getProperty("module0.url");
        // System.out.println(useCloudEnv + " and   " + cloudEnvName + " and " + url + " and  " + os + "  and " + os_version + "  " + browserName + " and " + browserVersion);
        setUp(useCloudEnv , cloudEnvName, os, os_version, browserName, browserVersion, url);
        ism.close();
        return prop;
    }
}
