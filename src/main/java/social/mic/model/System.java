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
import javax.persistence.Table;

@Entity
@Table(name="system")
public class System {

	@Id
	@Column(name="system_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int system_id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "system")
	private List<UserSystem> userSystem;
	
	@ManyToMany(targetEntity = Game.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name="systems_game",
				joinColumns = { @JoinColumn(name="system_id") },
				inverseJoinColumns = { @JoinColumn(name="game_id") })
	private List<Game> Game;
	
	public List<Game> getGame(){
		return Game;
	}
	
	public void setGames(List<Game> Game) {
		this.Game = Game;
	}

	public int getSystem_id() {
		return system_id;
	}

	public void setSystem_id(int system_id) {
		this.system_id = system_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
