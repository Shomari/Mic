package social.mic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserSystem {
		
	@Id
	@Column(name="userSystem_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userSystem_id;	

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="system_id")
	private System system;
	
	@Column(name="gamertag")
	private String gamerTag;

	public int getUserSystem_id() {
		return userSystem_id;
	}

	public void setUserSystem_id(int userSystem_id) {
		this.userSystem_id = userSystem_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	public String getGamerTag() {
		return gamerTag;
	}

	public void setGamerTag(String gamerTag) {
		this.gamerTag = gamerTag;
	}
	

	
	
}