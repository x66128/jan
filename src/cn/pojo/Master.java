package cn.pojo;
/**
 * 主人
 * @author mybatis
 *
 */
public class Master {
    private Integer id;//id

    private String name;//名字

    private String password;//密码

    private Integer state;//状态 1.管理员   2.用户

    public Master() {
    	
    	
    }
    
    
    public Master(Integer id, String name, String password, Integer state) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.state = state;
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
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}