/**
 * 
 */
package com.example.userservice.domain;

/**
 * @author Grissom
 *
 */
public class UserVO {
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	private String host;
	private Long id;

	private String name;

	private String pwd;

	public UserVO() {

	}

	public UserVO(Long id, String name, String pwd,String host) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.host = host;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
