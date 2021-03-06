package social.mic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
public class GameSession {
	
	@Id
	@Column(name="session_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int session_id;
	
	@ManyToOne
	@JoinColumn(name="userSystem_id")
	private UserSystem userSystem;
	
	@ManyToOne
	@JoinColumn(name="systemsGame_id")	
	private SystemsGame systemsGame;
	
	
	@Generated(GenerationTime.INSERT)	
	@Column(name="created_at")
	private Date created;

	public int getSession_id() {
		return session_id;
	}

	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}

	public UserSystem getUserSystem() {
		return userSystem;
	}

	public void setUserSystem(UserSystem userSystem) {
		this.userSystem = userSystem;
	}

	public SystemsGame getSystemsGame() {
		return systemsGame;
	}

	public void setSystemsGame(SystemsGame systemsGame) {
		this.systemsGame = systemsGame;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	

	
	
	

}
