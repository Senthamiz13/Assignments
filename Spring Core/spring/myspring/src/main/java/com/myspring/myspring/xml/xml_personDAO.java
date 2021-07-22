package com.myspring.myspring.xml;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Component
//Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class xml_personDAO {

    //Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
