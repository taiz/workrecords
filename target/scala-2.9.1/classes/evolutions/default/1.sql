# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_category primary key (id))
;

create table record (
  id                        bigint not null,
  start_time                timestamp,
  end_time                  timestamp,
  elapse_time               bigint,
  category_id               bigint,
  item                      varchar(255),
  constraint pk_record primary key (id))
;

create sequence category_seq;

create sequence record_seq;

alter table record add constraint fk_record_category_1 foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_record_category_1 on record (category_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists category;

drop table if exists record;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists category_seq;

drop sequence if exists record_seq;

