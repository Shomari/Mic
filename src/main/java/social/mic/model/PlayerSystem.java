package social.mic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PlayerSystem {
		
	@Id
	@Column(name="playerSystem_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int playerSystem_id;	

	@ManyToOne
	@JoinColumn(name="player_id")
	private Player player;
	
	@ManyToOne
	@JoinColumn(name="system_id")
	private System system;
	
	@Column(name="gamertag")
	private String gamerTag;
	
	public int getPlayerSystem_id() {
		return playerSystem_id;
	}

	public void setPlayerSystem_id(int playerSystem_id) {
		this.playerSystem_id = playerSystem_id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
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

	public void setGameTag(String gameTag) {
		this.gamerTag = gameTag;
	}
	
	
}
