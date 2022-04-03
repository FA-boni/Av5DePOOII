create database transporte;
use transporte
create table passageiros(
cpf varchar(15) not null unique,
senha varchar(50) not null,
acesso enum ("administrador","usuário","motorista"));
describe passageiros

alter table passageiros 
add column username varchar(50) after cpf;

describe passageiros

insert into passageiros 
values("000.000.000-00","Luiz Augusto","12345","administrador");
