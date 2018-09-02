package models;

import java.util.*;
import java.time.LocalTime;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class reserved_slots extends Model{
			@Id @GeneratedValue
			public Integer RID;
			@ManyToOne
			@JoinColumn(name = "GID")
			public playground pg;
			@ManyToOne
			@JoinColumn(name = "PID")
			public player rPlayer;
			public Date date;
			public LocalTime starting;
			public LocalTime finishing;
			public Boolean checked;
			@OneToMany(mappedBy = "slots")
			public ArrayList<challenges> ch = new ArrayList<challenges>();
			public static final Finder<Integer, reserved_slots> find = new Finder<>(reserved_slots.class);
}
