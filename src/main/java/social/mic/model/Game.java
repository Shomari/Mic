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
import javax.persistence.Table;

@Entity
@Table(name="game")
public class Game {
	
	@Id
	@Column(name="game_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int game_id;
	@Column(name="name")
	private String name;
	
	@ManyToMany(mappedBy="Game")
	private List<System> systems;

	public List<System> getSystems() {
		return systems;
	}
	public void setSystems(List<System> systems) {
		this.systems = systems;
	}
	public int getId() {
		return game_id;
	}
	public void setId(int game_id) {
		this.game_id = game_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
