package com.jk.model;

public class PositionModel {

    private Integer positionid;
    private String positionpost;
    private String positionname;
    private Integer positioncount;
    private Integer positionIntegral;
    private String positiondate;
    private Integer positiontop;

    @Override
    public String toString() {
        return "PositionModel{" +
                "positionid=" + positionid +
                ", positionpost='" + positionpost + '\'' +
                ", positionname='" + positionname + '\'' +
                ", positioncount=" + positioncount +
                ", positionIntegral=" + positionIntegral +
                ", positiondate='" + positiondate + '\'' +
                ", positiontop=" + positiontop +
                '}';
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public String getPositionpost() {
        return positionpost;
    }

    public void setPositionpost(String positionpost) {
        this.positionpost = positionpost;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public Integer getPositioncount() {
        return positioncount;
    }

    public void setPositioncount(Integer positioncount) {
        this.positioncount = positioncount;
    }

    public Integer getPositionIntegral() {
        return positionIntegral;
    }

    public void setPositionIntegral(Integer positionIntegral) {
        this.positionIntegral = positionIntegral;
    }

    public String getPositiondate() {
        return positiondate;
    }

    public void setPositiondate(String positiondate) {
        this.positiondate = positiondate;
    }

    public Integer getPositiontop() {
        return positiontop;
    }

    public void setPositiontop(Integer positiontop) {
        this.positiontop = positiontop;
    }
}
