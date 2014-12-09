package social.mic.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class System {

	@Id
	@Column(name="system_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int system_id;
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "system")
	private List<UserSystem> userSystem;


	public int getId() {
		return system_id;
	}

	public void setId(int system_id) {
		this.system_id = system_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
