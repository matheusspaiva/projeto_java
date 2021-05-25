create table usuario(
	Email varchar(50) primary key,
	Nome varchar(100) not null,
	Idade varchar(2) not null,
	Senha varchar(20) not null
);

create table sac(
	Email varchar(50) references usuario(Email),	
	Mensagem varchar(400) not null
);
