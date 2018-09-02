package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class team_members extends Model{
			@ManyToOne
			@JoinColumn(name = "TID")
			public teams team;
			@ManyToOne
			@JoinColumn(name = "PlayerID")
			public player play;
			public String role;
			public Boolean c_acceptance;
			public Boolean p_acceptance;
			public static final Finder<Integer, team_members> find = new Finder<>(team_members.class);
}
