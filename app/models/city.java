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
	public ArrayList<playground> playgrounds = new ArrayList<playground>();
	@OneToMany(mappedBy = "inCity")
	public ArrayList<teams> cityTeam = new ArrayList<teams>();
	public static final Finder<Integer, city> find = new Finder<>(city.class);
}
