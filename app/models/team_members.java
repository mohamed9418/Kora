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
			@JoinColumn(name = "PID")
			public player play;
			public String role;
			public int c_acceptance;
			public int p_acceptence;
			public static final Finder<Integer, team_members> find = new Finder<>(team_members.class);
}
