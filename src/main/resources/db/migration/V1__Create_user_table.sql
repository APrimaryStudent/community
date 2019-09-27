create table user
(
    id int auto_increment,
    name varchar(50),
    token varchar(36),
    gmt_create bigint,
    gmt_modified bigint,
    account_id varchar(100),
    bio varchar(256),
    constraint user_pk
        primary key (id)
);

