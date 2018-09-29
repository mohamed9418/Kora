# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table activate (
  aid                           integer auto_increment not null,
  pid                           integer,
  constraint pk_activate primary key (aid)
);

create table challenges (
  cid                           integer auto_increment not null,
  rid                           integer,
  tid                           integer,
  team_acceptance               tinyint(1) default 0,
  constraint pk_challenges primary key (cid)
);

create table city (
  cid                           integer auto_increment not null,
  name                          varchar(255),
  gid                           integer,
  constraint pk_city primary key (cid)
);

create table government (
  gid                           integer auto_increment not null,
  name                          varchar(255),
  constraint pk_government primary key (gid)
);

create table player (
  pid                           integer auto_increment not null,
  screen_id                     integer,
  name                          varchar(255),
  email                         varchar(255),
  b_date                        datetime(6),
  pass                          varchar(255),
  activate                      tinyint(1) default 0 not null,
  cid                           integer,
  constraint pk_player primary key (pid)
);

create table playground (
  gid                           integer auto_increment not null,
  name                          varchar(255),
  address                       varchar(255),
  phone_num                     integer,
  price                         double,
  cid                           integer,
  constraint pk_playground primary key (gid)
);

create table reserved_slots (
  rid                           integer auto_increment not null,
  gid                           integer,
  pid                           integer,
  day                           date,
  start_at                      time,
  duration                      integer not null,
  checked                       integer not null,
  constraint pk_reserved_slots primary key (rid)
);

create table sessions (
  sid                           integer auto_increment not null,
  statue                        integer,
  opendin                       datetime(6),
  pid                           integer,
  constraint pk_sessions primary key (sid)
);

create table team_members (
  tid                           integer,
  pid                           integer,
  role                          varchar(255),
  c_acceptance                  integer not null,
  p_acceptence                  integer not null
);

create table teams (
  tid                           integer auto_increment not null,
  team_name                     varchar(255),
  cid                           integer,
  traveling                     tinyint(1) default 0,
  constraint pk_teams primary key (tid)
);

alter table activate add constraint fk_activate_pid foreign key (pid) references player (pid) on delete restrict on update restrict;
create index ix_activate_pid on activate (pid);

alter table challenges add constraint fk_challenges_rid foreign key (rid) references reserved_slots (rid) on delete restrict on update restrict;
create index ix_challenges_rid on challenges (rid);

alter table challenges add constraint fk_challenges_tid foreign key (tid) references teams (tid) on delete restrict on update restrict;
create index ix_challenges_tid on challenges (tid);

alter table city add constraint fk_city_gid foreign key (gid) references government (gid) on delete restrict on update restrict;
create index ix_city_gid on city (gid);

alter table player add constraint fk_player_cid foreign key (cid) references city (cid) on delete restrict on update restrict;
create index ix_player_cid on player (cid);

alter table playground add constraint fk_playground_cid foreign key (cid) references city (cid) on delete restrict on update restrict;
create index ix_playground_cid on playground (cid);

alter table reserved_slots add constraint fk_reserved_slots_gid foreign key (gid) references playground (gid) on delete restrict on update restrict;
create index ix_reserved_slots_gid on reserved_slots (gid);

alter table reserved_slots add constraint fk_reserved_slots_pid foreign key (pid) references player (pid) on delete restrict on update restrict;
create index ix_reserved_slots_pid on reserved_slots (pid);

alter table sessions add constraint fk_sessions_pid foreign key (pid) references player (pid) on delete restrict on update restrict;
create index ix_sessions_pid on sessions (pid);

alter table team_members add constraint fk_team_members_tid foreign key (tid) references teams (tid) on delete restrict on update restrict;
create index ix_team_members_tid on team_members (tid);

alter table team_members add constraint fk_team_members_pid foreign key (pid) references player (pid) on delete restrict on update restrict;
create index ix_team_members_pid on team_members (pid);

alter table teams add constraint fk_teams_cid foreign key (cid) references city (cid) on delete restrict on update restrict;
create index ix_teams_cid on teams (cid);


# --- !Downs

alter table activate drop foreign key fk_activate_pid;
drop index ix_activate_pid on activate;

alter table challenges drop foreign key fk_challenges_rid;
drop index ix_challenges_rid on challenges;

alter table challenges drop foreign key fk_challenges_tid;
drop index ix_challenges_tid on challenges;

alter table city drop foreign key fk_city_gid;
drop index ix_city_gid on city;

alter table player drop foreign key fk_player_cid;
drop index ix_player_cid on player;

alter table playground drop foreign key fk_playground_cid;
drop index ix_playground_cid on playground;

alter table reserved_slots drop foreign key fk_reserved_slots_gid;
drop index ix_reserved_slots_gid on reserved_slots;

alter table reserved_slots drop foreign key fk_reserved_slots_pid;
drop index ix_reserved_slots_pid on reserved_slots;

alter table sessions drop foreign key fk_sessions_pid;
drop index ix_sessions_pid on sessions;

alter table team_members drop foreign key fk_team_members_tid;
drop index ix_team_members_tid on team_members;

alter table team_members drop foreign key fk_team_members_pid;
drop index ix_team_members_pid on team_members;

alter table teams drop foreign key fk_teams_cid;
drop index ix_teams_cid on teams;

drop table if exists activate;

drop table if exists challenges;

drop table if exists city;

drop table if exists government;

drop table if exists player;

drop table if exists playground;

drop table if exists reserved_slots;

drop table if exists sessions;

drop table if exists team_members;

drop table if exists teams;

