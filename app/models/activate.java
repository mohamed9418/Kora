package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class activate extends Model{
	@Id
	public Integer AID;
	@ManyToOne
	@JoinColumn(name = "PID")
	public player p;
	 public static final Finder<Integer, activate> find = new Finder<>(activate.class);
}
