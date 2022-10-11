/**
* AGENDA DE CONTATOS
@author massanorik
*/

-- Comandopara verificar os bancos criados
 show databases;

-- Comando para criar um novo banco de dados

create database agenda;
-- Comando para selecionar um banco de dados
use agenda;

-- Comando usado para excluir um banco de dados
drop database nome_do_banco;

-- Comando usado para criar uma tabela

-- auto_increment (numeração automática)
-- varchar(50) (tipo de dados String - 50 caracteres)
-- not null (campo obrigatório)
create table contatos  (
id int primary key auto_increment,
nome varchar(50) not null,
fone varchar(15) not null,
email varchar(50) 

);

-- verificar tabelas de bano de dados
show tables;
describe contatos;
