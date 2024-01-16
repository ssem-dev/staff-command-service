CREATE TABLE IF NOT EXISTS staff
(
    id
    bigint
    not
    null
    auto_increment
    primary
    key,
    email
    varchar
(
    30
) not null,
    nick_name varchar
(
    20
) not null,
    create_by bigint not null,
    create_at timestamp not null default CURRENT_TIMESTAMP,
    update_by bigint not null,
    update_at timestamp not null default CURRENT_TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS staff_social
(
    id
    bigint
    not
    null
    auto_increment
    primary
    key,
    social_key
    varchar
(
    1000
) not null,
    type varchar
(
    10
) not null,
    staff_id bigint not null,
    create_by bigint not null,
    create_at timestamp not null default CURRENT_TIMESTAMP,
    FOREIGN KEY
(
    staff_id
) REFERENCES staff
(
    id
)
    );