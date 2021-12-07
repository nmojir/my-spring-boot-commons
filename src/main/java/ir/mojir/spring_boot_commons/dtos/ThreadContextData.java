package ir.mojir.spring_boot_commons.dtos;

import java.util.Set;

public class ThreadContextData {
	
	private long userId;
	
	private String username;
	
	private String accessToken;
	
	private Set<String> roles;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "ThreadContextData [userId=" + userId + ", username=" + username + ", accessToken=" + accessToken
				+ ", roles=" + roles + "]";
	}
	
	
	
	
	
	
}
