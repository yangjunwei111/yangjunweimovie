package com.weiwei.typee.domain;

public class Zw {
private Integer zid;
private String zname;
private String ms;
private int tid;
@Override
public String toString() {
	return "Zw [zid=" + zid + ", zname=" + zname + ", ms=" + ms + ", tid=" + tid + "]";
}
public Integer getZid() {
	return zid;
}
public void setZid(Integer zid) {
	this.zid = zid;
}
public String getZname() {
	return zname;
}
public void setZname(String zname) {
	this.zname = zname;
}
public String getMs() {
	return ms;
}
public void setMs(String ms) {
	this.ms = ms;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public Zw() {
	super();
	// TODO Auto-generated constructor stub
}
public Zw(Integer zid, String zname, String ms, int tid) {
	super();
	this.zid = zid;
	this.zname = zname;
	this.ms = ms;
	this.tid = tid;
}
}
