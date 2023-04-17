CREATE ROLE gr_app WITH
    LOGIN
    NOSUPERUSER
    CREATEDB
    NOCREATEROLE
    INHERIT
    NOREPLICATION
    CONNECTION LIMIT -1;

-- Role: regitra_user
-- DROP ROLE IF EXISTS regitra_user;

CREATE ROLE regitra_user WITH
    LOGIN
    NOSUPERUSER
    INHERIT
    CREATEDB
    NOCREATEROLE
    NOREPLICATION
    ENCRYPTED PASSWORD 'SCRAM-SHA-256$4096:Cd3lJvxzV3GuiIMIzrW9bA==$0SU0CENO7pfJwYemWQo87KXhDD3Nbxce4x/dTw9xulg=:t0B+uhBPpQEsa9qVq+yvdILhB0TefXq9bI+kiuxwARs=';

GRANT gr_app TO regitra_user;

COMMENT ON ROLE regitra_user IS 'User for our small regitra application';


CREATE DATABASE regitra
    WITH
    OWNER = gr_app
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

GRANT ALL ON DATABASE regitra TO gr_app;


CREATE SCHEMA IF NOT EXISTS public
    AUTHORIZATION gr_app;

COMMENT ON SCHEMA public
    IS 'standard public schema';

GRANT USAGE ON SCHEMA public TO PUBLIC;

GRANT ALL ON SCHEMA public TO gr_app;

ALTER DEFAULT PRIVILEGES FOR ROLE postgres IN SCHEMA public
    GRANT INSERT, DELETE, SELECT, UPDATE ON TABLES TO gr_app;

ALTER DEFAULT PRIVILEGES FOR ROLE postgres IN SCHEMA public
    GRANT ALL ON SEQUENCES TO gr_app;


CREATE TABLE public.person
(
    id bigint NOT NULL,
    name character varying(20) NOT NULL,
    surname character varying(50) NOT NULL,
    age smallint
);

ALTER TABLE IF EXISTS public.person
    OWNER to gr_app;


ALTER TABLE person DROP id;
ALTER TABLE person ADD id serial;
