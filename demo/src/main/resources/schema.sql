create table reservation (
id integer NOT NULL AUTO_INCREMENT,
user_id integer NOT NULL,
party_size integer NOT NULL,
date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
restaurant_id integer NOT NULL,
PRIMARY KEY (id)
);