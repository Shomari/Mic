package social.mic.model;

import java.util.ArrayList;
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

@Entity
public class Game {
	
	@Id
	@Column(name="game_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int game_id;
	@Column(name="name")
	private String name;
	
	@ManyToMany(targetEntity = System.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name="Systems_game",
				joinColumns = { @JoinColumn(name="game_id") },
				inverseJoinColumns = { @JoinColumn(name="system_id") })
	private List<System> listOfSystems;

	public List<System> getListOfSystems() {
		return listOfSystems;
	}
	public void setListOfSystems(List<System> listOfSystems) {
		this.listOfSystems = listOfSystems;
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
