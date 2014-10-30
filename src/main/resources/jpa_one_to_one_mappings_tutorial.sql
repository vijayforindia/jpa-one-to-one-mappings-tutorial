CREATE DATABASE jpa_one_to_one_mappings_tutorial;
USE jpa_one_to_one_mappings_tutorial;

CREATE TABLE artists (
artist_id INT PRIMARY KEY,
artist_name VARCHAR(30)
);

CREATE TABLE websites (
website_id INT PRIMARY KEY,
website_url VARCHAR(50),
artist_id INT UNIQUE,
FOREIGN KEY (artist_id) REFERENCES artists (artist_id)
);

INSERT INTO artists VALUES (1, 'Franz Ferdinand');
INSERT INTO websites VALUES (1, 'www.franzferdinand.com', 1);