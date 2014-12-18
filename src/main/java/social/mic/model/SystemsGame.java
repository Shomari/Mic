package social.mic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="systemsgame")
public class SystemsGame {
	
	@Id
	@Column(name="systemsGame_id")
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int systemsGame_id;
	
	@ManyToOne
	@JoinColumn(name="game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name="system_id")
	private System system;	
	
	public int getSystemsGame_id() {
		return systemsGame_id;
	}

	public void setSystemsGame_id(int systemGame_id) {
		this.systemsGame_id = systemGame_id;
	}

	public Game getGame() {		
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(System system) {
		this.system = system;
	}	

}
