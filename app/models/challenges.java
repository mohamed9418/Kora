package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class challenges extends Model{
			@Id @GeneratedValue
			public Integer CID;
			@ManyToOne
			@JoinColumn(name = "RID")
			public reserved_slots slots;
			@ManyToOne
			@JoinColumn(name = "TID")
			public teams invTeam;
			@ManyToOne
			@JoinColumn(name = "TID")
			public teams chTeam;
			public Boolean teamAcceptance;
			public static final Finder<Integer, challenges> find = new Finder<>(challenges.class);
			}