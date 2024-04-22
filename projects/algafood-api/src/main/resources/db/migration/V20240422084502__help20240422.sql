
CREATE TABLE grupo (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE permissao (
  id bigint NOT NULL AUTO_INCREMENT,
  descricao varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE grupo_permissao (
  grupo_id bigint NOT NULL,
  permissao_id bigint NOT NULL,
  KEY FKh21kiw0y0hxg6birmdf2ef6vy (permissao_id),
  KEY FKta4si8vh3f4jo3bsslvkscc2m (grupo_id),
  CONSTRAINT FKh21kiw0y0hxg6birmdf2ef6vy FOREIGN KEY (permissao_id) REFERENCES permissao (id),
  CONSTRAINT FKta4si8vh3f4jo3bsslvkscc2m FOREIGN KEY (grupo_id) REFERENCES grupo (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE usuario (
  data_cadastro datetime NOT NULL,
  id bigint NOT NULL AUTO_INCREMENT,
  email varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  senha varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE usuario_grupo (
  grupo_id bigint NOT NULL,
  usuario_id bigint NOT NULL,
  KEY FKk30suuy31cq5u36m9am4om9ju (grupo_id),
  KEY FKdofo9es0esuiahyw2q467crxw (usuario_id),
  CONSTRAINT FKdofo9es0esuiahyw2q467crxw FOREIGN KEY (usuario_id) REFERENCES usuario (id),
  CONSTRAINT FKk30suuy31cq5u36m9am4om9ju FOREIGN KEY (grupo_id) REFERENCES grupo (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
