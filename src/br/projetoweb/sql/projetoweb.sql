CREATE TABLE public.aluno
(
  "idAluno" integer NOT NULL DEFAULT nextval('"aluno_idAluno_seq"'::regclass),
  nome character varying(80),
  idade integer,
  cpf character varying(15),
  curso character varying(50),
  CONSTRAINT "idPK" PRIMARY KEY ("idAluno")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.aluno
  OWNER TO postgres;
