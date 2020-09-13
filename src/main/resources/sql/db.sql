CREATE DATABASE Product_DB;

-- switch to Product_DB and execute follow query
DROP TABLE public.Product;
CREATE TABLE public.Product (
  ID     BIGSERIAL PRIMARY KEY NOT NULL,
  NAME   TEXT                  NOT NULL,
  PRICE  FLOAT
);