create table track_points (
    id bigint auto_increment,
    time date,
    lat float,
    lon float,
    activity_id bigint,
    primary key (id),
    foreign key (activity_id) references activities(id)
);
