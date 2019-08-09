package com.weiwei.typee.domain;

public class Typee {
private Integer tid;
private String tname;
public Typee(Integer tid, String tname) {
	super();
	this.tid = tid;
	this.tname = tname;
}
@Override
public String toString() {
	return "Typee [tid=" + tid + ", tname=" + tname + "]";
}
public Integer getTid() {
	return tid;
}
public void setTid(Integer tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public Typee() {
	super();
	// TODO Auto-generated constructor stub
}
}
