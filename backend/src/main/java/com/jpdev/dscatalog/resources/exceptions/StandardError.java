package com.jpdev.dscatalog.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	private Instant timesStanp;
	private Integer status;
	private String error;
	private String msg;
	private String path;
	
	public StandardError() {
	}

	public Instant getTimesStanp() {
		return timesStanp;
	}

	public void setTimesStanp(Instant timesStanp) {
		this.timesStanp = timesStanp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
