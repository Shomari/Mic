package social.mic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Player {
	
	@Id
	@Column(name="player_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy = "player")
	private List<PlayerSystem> playerSystem;
	
//	@ManyToMany(targetEntity = System.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
//	@JoinTable(name="Players_system",
//				joinColumns = { @JoinColumn(name="player_id") },
//				inverseJoinColumns = { @JoinColumn(name="system_id") })
//	private List<System> playerSystems;
//
//	public List<System> playerSystems() {
//		return playerSystems;
//	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	

}
