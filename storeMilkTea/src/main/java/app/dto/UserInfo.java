package app.dto;

public class UserInfo {
	private Integer id;
	private String name;
	private String userName;
	private String email;
	private RoleInfo role;
	
	public UserInfo(Integer id, String name, String userName, String email, RoleInfo role) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.role = role;
	}
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RoleInfo getRole() {
		return role;
	}
	public void setRole(RoleInfo role) {
		this.role = role;
	}
}
