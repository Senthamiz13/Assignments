package spring.q6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {

    //from property file
    @Value("${driverClassName}")
    private String className;
    @Value("${dbUrl}")
    private String url;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Override
    public String toString() {
        return "SomeExternalService [className=" + className + ", url=" + url + ", username=" + username + ", password="
                + password + "]";
    }
    public String getClassName() {
        return className;
    }
    public String getUrl() {
        return url;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }





}