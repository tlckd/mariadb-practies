package vo;

public class MemberVo {

	private long no;
	private String name;
	private String tell;
	private String email;
	private String password;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", name=" + name + ", tell=" + tell + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
}
