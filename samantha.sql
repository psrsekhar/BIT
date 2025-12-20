create database samantha;
use samantha;

create table samantha.users(
  id int not null primary key auto_increment,
  name varchar(200) not null,
  email text not null,
  created_on timestamp not null default current_timestamp
);

create table samantha.user_accounts(
	user_name varchar(15) not null primary key,
    pin int (4) not null,
    user_id int not null unique,
    foreign key(user_id) references samantha.users(id) on update cascade,
    foreign key(user_id) references samantha.users(id) on delete cascade
);

create table samantha.user_posts(
    user_id int not null,
    message text not null,
    posted_on timestamp not null default current_timestamp,
    foreign key(user_id) references samantha.users(id) on update cascade,
    foreign key(user_id) references samantha.users(id) on delete cascade
);

create table samantha.user_followers(
    user_id int not null,
    follower_id int not null,
    foreign key(user_id) references samantha.users(id) on update cascade,
    foreign key(user_id) references samantha.users(id) on delete cascade,
    foreign key(follower_id) references samantha.users(id) on update cascade,
    foreign key(follower_id) references samantha.users(id) on delete cascade
);


select user_id, message from user_posts where user_id = 1 OR user_id IN 
 (select user_id, follower_id from user_followers where  user_id = 1)

















select * from samantha.user_accounts;
select * from samantha.users;
select * from samantha.user_posts;