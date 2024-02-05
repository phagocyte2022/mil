drop table if exists weapons_assigned cascade;
drop table if exists people cascade;
drop table if exists ranks cascade;
drop table if exists weapons cascade;

create table people (
    id bigserial not null,
    last_name varchar(255),
    first_name varchar(255),
    middle_name varchar(255),
    primary key (id)
);

create table ranks (
    id bigserial not null,
    rank varchar(255),
    rank_group varchar(255),
	person_id bigint,
    date_granted date,
	primary key (id),
    foreign key (person_id) references people(id)
);

create table weapons (
    id bigserial not null,
    weapon_type varchar(255),
	weapon_number varchar(255),
	person_id bigint,
	primary key (id),
    foreign key (person_id) references people(id)
);

create table weapons_assigned (
    id bigserial not null,
    weapon_id bigint,
    person_id bigint,
	date_granted date,
    date_returned date,
    primary key (id),
    foreign key (person_id) references people(id),
    foreign key (weapon_id) references weapons(id)
);

