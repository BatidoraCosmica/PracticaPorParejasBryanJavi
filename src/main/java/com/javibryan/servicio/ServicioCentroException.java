package com.javibryan.servicio;

public class ServicioCentroException {
    public ServicioCentroException(String msg, Exception e) {
        super(msg, e);
    }
    public ServicioCentroException(String msg) {
        super(msg);
    }
}
