package br.com.home.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MeuListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Contexto inicializou");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
