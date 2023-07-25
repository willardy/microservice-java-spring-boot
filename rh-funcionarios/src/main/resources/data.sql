CREATE TABLE FUNCIONARIO
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    nome         VARCHAR(100),
    renda_diaria DECIMAL(10, 2)
);

INSERT INTO FUNCIONARIO (nome, renda_diaria) VALUES ('Chico', 2100.0);
INSERT INTO FUNCIONARIO (nome, renda_diaria) VALUES ('Maria', 3000.0);
INSERT INTO FUNCIONARIO (nome, renda_diaria) VALUES ('Jose', 500.0);