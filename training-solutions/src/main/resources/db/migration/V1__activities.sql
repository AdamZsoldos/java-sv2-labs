create table activities (
    id bigint auto_increment,
    start_time datetime,
    activity_desc varchar(255),
    activity_type varchar(20),
    primary key (id)
);
