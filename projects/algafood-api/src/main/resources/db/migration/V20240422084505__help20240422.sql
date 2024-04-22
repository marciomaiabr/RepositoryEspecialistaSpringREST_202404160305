
CREATE TABLE restaurante (
  taxa_frete decimal(38,2) NOT NULL,
  cozinha_id bigint NOT NULL,
  data_atualizacao datetime NOT NULL,
  data_cadastro datetime NOT NULL,
  endereco_cidade_id bigint DEFAULT NULL,
  id bigint NOT NULL AUTO_INCREMENT,
  endereco_bairro varchar(255) DEFAULT NULL,
  endereco_cep varchar(255) DEFAULT NULL,
  endereco_complemento varchar(255) DEFAULT NULL,
  endereco_logradouro varchar(255) DEFAULT NULL,
  endereco_numero varchar(255) DEFAULT NULL,
  nome varchar(255) NOT NULL,
  PRIMARY KEY (id),
  KEY FK76grk4roudh659skcgbnanthi (cozinha_id),
  KEY FKbc0tm7hnvc96d8e7e2ulb05yw (endereco_cidade_id),
  CONSTRAINT FK76grk4roudh659skcgbnanthi FOREIGN KEY (cozinha_id) REFERENCES cozinha (id),
  CONSTRAINT FKbc0tm7hnvc96d8e7e2ulb05yw FOREIGN KEY (endereco_cidade_id) REFERENCES cidade (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE produto (
  ativo bit(1) NOT NULL,
  preco decimal(38,2) NOT NULL,
  id bigint NOT NULL AUTO_INCREMENT,
  restaurante_id bigint NOT NULL,
  descricao varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  PRIMARY KEY (id),
  KEY FKb9jhjyghjcn25guim7q4pt8qx (restaurante_id),
  CONSTRAINT FKb9jhjyghjcn25guim7q4pt8qx FOREIGN KEY (restaurante_id) REFERENCES restaurante (id)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE restaurante_forma_pagamento (
  forma_pagamento_id bigint NOT NULL,
  restaurante_id bigint NOT NULL,
  KEY FK7aln770m80358y4olr03hyhh2 (forma_pagamento_id),
  KEY FKa30vowfejemkw7whjvr8pryvj (restaurante_id),
  CONSTRAINT FK7aln770m80358y4olr03hyhh2 FOREIGN KEY (forma_pagamento_id) REFERENCES forma_pagamento (id),
  CONSTRAINT FKa30vowfejemkw7whjvr8pryvj FOREIGN KEY (restaurante_id) REFERENCES restaurante (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
