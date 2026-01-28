create database if not exists instagram character set = utf8mb4 
collate utf8mb4_0900_ai_ci;
use instagram;
create table if not exists instagram.posts(
	id int not null primary key auto_increment,
    user_name varchar(15) not null unique,
    post_type varchar(10) not null,
    posted_on datetime default current_timestamp,
    message text null
);
create table if not exists instagram.post_likes(
	post_id int not null,
    user_name varchar(15) not null,
    foreign key(post_id) references instagram.posts(id) on delete cascade on update cascade
);
create table if not exists instagram.post_comments(
	post_id int not null,
    user_name varchar(15) not null,
    comment text not null,
    foreign key(post_id) references instagram.posts(id) on delete cascade on update cascade
);


INSERT INTO instagram.posts (user_name, post_type, message) VALUES
('alice01', 'image', 'Sunset at the beach 🌅'),
('bob_the_builder', 'video', 'DIY home project complete!'),
('charlieX', 'text', 'Feeling grateful today 🙏'),
('diana_love', 'image', 'My new puppy 🐶'),
('edward99', 'video', 'Workout routine for beginners'),
('fiona_star', 'text', 'Book recommendations for 2026?'),
('george_k', 'image', 'Delicious homemade pizza 🍕'),
('hannah_q', 'video', 'Travel vlog: Exploring Kyoto'),
('ivan_dev', 'text', 'Coding late night again 💻'),
('julia_art', 'image', 'Finished my new painting 🎨');

INSERT INTO instagram.post_likes (post_id, user_name) VALUES
(1, 'bob_the_builder'),
(1, 'charlieX'),
(2, 'alice01'),
(2, 'diana_love'),
(3, 'fiona_star'),
(4, 'george_k'),
(5, 'hannah_q'),
(6, 'ivan_dev'),
(7, 'julia_art'),
(8, 'alice01'),
(9, 'bob_the_builder'),
(10, 'charlieX');

INSERT INTO instagram.post_comments (post_id, user_name, comment) VALUES
(1, 'diana_love', 'Wow, that sunset looks amazing!'),
(2, 'george_k', 'Great job on the project 👏'),
(3, 'alice01', 'Gratitude is everything 💖'),
(4, 'fiona_star', 'Your puppy is adorable!'),
(5, 'ivan_dev', 'I’ll try this workout routine!'),
(6, 'julia_art', 'Check out “Project Hail Mary” – loved it!'),
(7, 'bob_the_builder', 'Pizza night at your place? 🍕'),
(8, 'charlieX', 'Kyoto is on my bucket list!'),
(9, 'hannah_q', 'Keep coding, you’ll nail it 💻'),
(10, 'edward99', 'Your painting is stunning!');

