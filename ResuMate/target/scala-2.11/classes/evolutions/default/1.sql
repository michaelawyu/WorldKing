# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment_and_rating (
  unique_comment_id         varchar(255) not null,
  user_id                   varchar(255),
  date_and_time             timestamp,
  content                   varchar(255),
  rating                    integer,
  resume_id                 varchar(255),
  constraint pk_comment_and_rating primary key (unique_comment_id))
;

create table job_category (
  job_category_id           varchar(255) not null,
  job_category_name         varchar(255),
  job_category_description  varchar(255),
  constraint pk_job_category primary key (job_category_id))
;

create table resume_list (
  resume_unique_id          varchar(255) not null,
  location                  varchar(255),
  resume_name               varchar(255),
  checked                   varchar(255),
  constraint pk_resume_list primary key (resume_unique_id))
;

create table user (
  email                     varchar(255) not null,
  password                  varchar(255),
  constraint pk_user primary key (email))
;

create sequence comment_and_rating_seq;

create sequence job_category_seq;

create sequence resume_list_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists comment_and_rating;

drop table if exists job_category;

drop table if exists resume_list;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists comment_and_rating_seq;

drop sequence if exists job_category_seq;

drop sequence if exists resume_list_seq;

drop sequence if exists user_seq;

