package models;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.*;
import java.util.ArrayList;

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
			public Date day;
			public Time starting;
			public Time finishing;
			public Boolean checked;
			@OneToMany(mappedBy = "slots")
			public ArrayList<challenges> ch = new ArrayList<challenges>();
			public static final Finder<Integer, reserved_slots> find = new Finder<>(reserved_slots.class);
}
