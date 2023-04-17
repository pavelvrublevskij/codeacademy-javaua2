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
