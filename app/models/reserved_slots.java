package models;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.*;
import java.util.ArrayList;

import io.ebean.*;

@Entity
public class reserved_slots extends Model{
			@Id @GeneratedValue
			public int RID;
			@ManyToOne
			@JoinColumn(name = "GID")
			public playground pg;
			@ManyToOne
			@JoinColumn(name = "PID")
			public player rPlayer;
			public Date day;
			public Time start_at;
			public int duration;
			public int checked;
			@OneToMany(mappedBy = "slots")
			public ArrayList<challenges> ch = new ArrayList<challenges>();
			public static final Finder<Integer, reserved_slots> find = new Finder<>(reserved_slots.class);
}
