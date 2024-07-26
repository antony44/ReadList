CREATE DATABASE readlist_db;

CREATE TABLE BOOK
(
    ID      INTEGER      NOT NULL PRIMARY KEY,
    TITLE   VARCHAR(128) NOT NULL,
    AUTHOR  VARCHAR(45)  NOT NULL,
    GENRE   VARCHAR(45)  NOT NULL,
    MARK    INTEGER      NOT NULL,
    COMMENT VARCHAR(128) NOT NULL
);