package org.cskj.springbootStudent.bean;

public class YuanGongBiao {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String xingge;
	private String jineng;
	private String leibie;
	private String yifuwu;
	public YuanGongBiao(int id, String name, String sex, int age, String xingge, String jineng, String leibie,
			String yifuwu) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.xingge = xingge;
		this.jineng = jineng;
		this.leibie = leibie;
		this.yifuwu = yifuwu;
	}
	public YuanGongBiao() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getXingge() {
		return xingge;
	}
	public void setXingge(String xingge) {
		this.xingge = xingge;
	}
	public String getJineng() {
		return jineng;
	}
	public void setJineng(String jineng) {
		this.jineng = jineng;
	}
	public String getLeibie() {
		return leibie;
	}
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	public String getYifuwu() {
		return yifuwu;
	}
	public void setYifuwu(String yifuwu) {
		this.yifuwu = yifuwu;
	}
	@Override
	public String toString() {
		return "YuanGongBiao [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", xingge=" + xingge
				+ ", jineng=" + jineng + ", leibie=" + leibie + ", yifuwu=" + yifuwu + "]";
	}
	
}
