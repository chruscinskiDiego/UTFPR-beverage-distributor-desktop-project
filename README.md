# Distribuidora de bebidas — aplicação desktop

Projeto acadêmico da UTFPR que simula rotinas de uma distribuidora de bebidas em uma aplicação Java com interface Swing.

## Recursos

- Interfaces para clientes, fornecedores e produtos.
- Telas e entidades relacionadas a compras e vendas.
- Modelos de listagem para os registros.
- Camada DAO para acesso ao PostgreSQL.

## Tecnologias

Java, Swing/JFrame, JDBC e PostgreSQL.

## Preparar o ambiente

1. Importe os fontes na IDE Java de sua preferência, preservando os pacotes DAO, entidades, model e view.
2. Adicione o driver JDBC do PostgreSQL ao classpath.
3. Revise a conexão em DAO/ConexaoDao.java e disponibilize um banco com as tabelas esperadas pelos DAOs.
4. Confira os recursos de imagens usados pelas telas e a inicialização em view/MenuPrincipal.java.

## Organização

- `DAO/`: conexão e persistência.
- `entidades/`: modelos do domínio.
- `model/`: modelos de apresentação das listas.
- `view/`: formulários, telas e imagens.

## Limitações

O repositório não fornece um projeto Maven/Gradle nem um roteiro completo de criação do banco. Portanto, sua preparação requer configuração manual das dependências e do schema. É um registro acadêmico de aplicação desktop e padrão DAO.
