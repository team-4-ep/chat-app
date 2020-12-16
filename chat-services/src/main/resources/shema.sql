DROP TABLE IF EXISTS messages;

CREATE TABLE message (
  id         SERIAL PRIMARY KEY NOT NULL,
  code        VARCHAR(100) UNIQUE NOT NULL,
  type        VARCHAR(100) UNIQUE NOT NULL,
  'to'        VARCHAR(100) UNIQUE NOT NULL,
  message                   TEXT NOT NULL,
	CONSTRAINT message_pkey PRIMARY KEY (id));

CREATE SEQUENCE message START 1;

