package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class city extends Model{
	@Id @GeneratedValue
	public Integer CID;
	public String name;

	@ManyToOne
	@JoinColumn(name = "GID")
	public government govern;
	@OneToMany(mappedBy = "c")
	public List<playground> playgrounds;
	@OneToMany(mappedBy = "c")
	public List<player> playrs;
	@OneToMany(mappedBy = "inCity")
	public List<teams> cityTeam;
	public static final Finder<Integer, city> find = new Finder<>(city.class);
	public String getName() {
		 return name;
 }
 public List<playground> getplaygrounds(){
	 return playgrounds;
 }
}
