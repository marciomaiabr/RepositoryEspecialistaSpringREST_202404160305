
CREATE TABLE estado (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE cidade (
  estado_id bigint NOT NULL,
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  PRIMARY KEY (id),
  KEY FKkworrwk40xj58kevvh3evi500 (estado_id),
  CONSTRAINT FKkworrwk40xj58kevvh3evi500 FOREIGN KEY (estado_id) REFERENCES estado (id)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
