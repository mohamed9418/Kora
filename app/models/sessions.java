package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class sessions extends Model{
	@Id @GeneratedValue
	public Integer SID;
	public Integer statue;
	@Column(name="opendIN")
	public Date opendIN;
	@ManyToOne
	@JoinColumn(name = "PID")
	public player p;
	 public static final Finder<Integer, sessions> find = new Finder<>(sessions.class);
}
