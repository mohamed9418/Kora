package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class teams extends Model{
			@Id @GeneratedValue
			public Integer TID;
			public String team_name;
			@ManyToOne
			@JoinColumn(name = "CID")
			public city inCity;
			public Boolean traveling;
			@OneToMany(mappedBy = "invTeam")
			public ArrayList<challenges> chByMe = new ArrayList<challenges>();
			@OneToMany(mappedBy = "chTeam")
			public ArrayList<challenges> chByO = new ArrayList<challenges>();
			@OneToMany(mappedBy = "team")
			public ArrayList<team_members> members = new ArrayList<team_members>();
			public static final Finder<Integer, teams> find = new Finder<>(teams.class);
			}
