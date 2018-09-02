package models;
import javax.persistence.*;
import java.util.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
 public class player extends Model{
   @Id
   public Integer PID;
   public String name;
   public String email;
   public String pic;
   public Date b_date;
   public String pass;
   public boolean activate;
   @OneToMany(mappedBy = "play")
   public ArrayList<team_members> myTeam = new ArrayList<team_members>();
   @OneToMany(mappedBy = " rPlayer")
   public ArrayList<reserved_slots> myReserve = new ArrayList<reserved_slots>();
   @OneToMany(mappedBy = "p")
   public ArrayList<sessions> mysessions = new ArrayList<sessions>();
   @OneToMany(mappedBy = "p")
   public ArrayList<activate> active = new ArrayList<activate>();
   public static Finder <Integer,player> find=new Finder<>(player.class);
 }
