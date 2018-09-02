package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;

@Entity
public class playground extends Model{
		@Id @GeneratedValue
		public Integer GID;
		public String name;
		public String address;
		public Integer phone_num;
		public Double price;
		@ManyToOne
		@JoinColumn(name = "CID")
		public city c;
		@OneToMany(mappedBy = "pg")
		public ArrayList<reserved_slots> reserved_slot = new ArrayList<reserved_slots>();
		public static final Finder<Integer, playground> find = new Finder<>(playground.class);
}
