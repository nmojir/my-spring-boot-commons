package ir.mojir.spring_boot_commons.dtos;

public class ThreadContextData {
	
	private long userId;
	
	private String username;
	
	private String accessToken;
	
	
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
	@Override
	public String toString() {
		return "ThreadContextData [username=" + username + ", accessToken=" + accessToken + "]";
	}
	
	
	
	
}
