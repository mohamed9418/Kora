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
			public List<challenges> chByMe ;
			@OneToMany(mappedBy = "chTeam")
			public List<challenges> chByO ;
			@OneToMany(mappedBy = "team")
			public List<team_members> members ;
			public static final Finder<Integer, teams> find = new Finder<>(teams.class);
			public List<challenges> getchByMe(){
				return chByMe;
			}
			public List<challenges> getchByO(){
				return chByO;
			}
			public List<team_members> getTeammembers(){
				return members;
			}

			}
