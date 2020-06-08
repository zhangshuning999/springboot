package com.jk.model;


public class Talents {

    private Integer   id;
    private String    name;
    private Integer   count;
    private Integer   verifie;
    private Integer   intervie;
    private Integer   preliminay;
    private Integer   eexamin;
    private Integer   pening;
    private Integer   processed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getVerifie() {
        return verifie;
    }

    public void setVerifie(Integer verifie) {
        this.verifie = verifie;
    }

    public Integer getIntervie() {
        return intervie;
    }

    public void setIntervie(Integer intervie) {
        this.intervie = intervie;
    }

    public Integer getPreliminay() {
        return preliminay;
    }

    public void setPreliminay(Integer preliminay) {
        this.preliminay = preliminay;
    }

    public Integer getEexamin() {
        return eexamin;
    }

    public void setEexamin(Integer eexamin) {
        this.eexamin = eexamin;
    }

    public Integer getPening() {
        return pening;
    }

    public void setPening(Integer pening) {
        this.pening = pening;
    }

    public Integer getProcessed() {
        return processed;
    }

    public void setProcessed(Integer processed) {
        this.processed = processed;
    }

    @Override
    public String toString() {
        return "Talents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", verifie=" + verifie +
                ", intervie=" + intervie +
                ", preliminay=" + preliminay +
                ", eexamin=" + eexamin +
                ", pening=" + pening +
                ", processed=" + processed +
                '}';
    }
}
