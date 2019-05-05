package com.blog.entity;

import java.util.Date;

public class Visitor {
    private String visitor_ip;
    private Date visit_time;

    public Date getVisit_time() {
        return visit_time;
    }

    public String getVisitor_ip() {
        return visitor_ip;
    }

    public void setVisit_time(Date visit_time) {
        this.visit_time = visit_time;
    }

    public void setVisitor_ip(String visitor_ip) {
        this.visitor_ip = visitor_ip;
    }
}
