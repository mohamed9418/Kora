package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class government extends Model{
	@Id @GeneratedValue
	public Integer GID;
	public String name;
	@OneToMany(mappedBy = "govern")
	public ArrayList<city> cites = new ArrayList<city>();
	public static final Finder<Integer, government> find = new Finder<>(government.class);
}
