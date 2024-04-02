package br.com.professordanilo.aula01;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class HelloBean implements Serializable {

    private String hello = "Olá mundo";

    public String getHello() {
        return hello;
    }

}
