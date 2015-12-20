# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment_and_rating (
  unique_comment_id         varchar(40) not null,
  user_id                   varchar(255),
  date_and_time             timestamp,
  date_and_time_tran        varchar(255),
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

create table resume (
  full_name                 varchar(255) not null,
  email_address             varchar(255),
  phone_no                  varchar(255),
  street                    varchar(255),
  city                      varchar(255),
  zip                       varchar(255),
  schooladd1                varchar(255),
  date_range1               varchar(255),
  school_name1              varchar(255),
  school_title1             varchar(255),
  schooladd2                varchar(255),
  date_range2               varchar(255),
  school_name2              varchar(255),
  school_title2             varchar(255),
  schooladd3                varchar(255),
  date_range3               varchar(255),
  school_name3              varchar(255),
  school_title3             varchar(255),
  expadd1                   varchar(255),
  date_range_exp1           varchar(255),
  exp_name1                 varchar(255),
  exp_desc1                 varchar(255),
  expadd2                   varchar(255),
  date_range_exp2           varchar(255),
  exp_name2                 varchar(255),
  exp_desc2                 varchar(255),
  expadd3                   varchar(255),
  date_range_exp3           varchar(255),
  exp_name3                 varchar(255),
  exp_desc3                 varchar(255),
  constraint pk_resume primary key (full_name))
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

create sequence job_category_seq;

create sequence resume_seq;

create sequence resume_list_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists comment_and_rating;

drop table if exists job_category;

drop table if exists resume;

drop table if exists resume_list;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists job_category_seq;

drop sequence if exists resume_seq;

drop sequence if exists resume_list_seq;

drop sequence if exists user_seq;

