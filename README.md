Sistema de Gerenciamento de Aeroporto
Este projeto é um sistema desktop desenvolvido em Java Swing para gerenciamento de operações em um aeroporto. Ele permite o controle de passageiros, voos, aeronaves, check-ins, bagagens e passagens, utilizando uma arquitetura baseada em MVC (Model-View-Controller).

Funcionalidades
Cadastro e gerenciamento de Passageiros

Registro e controle de Voos

Gestão de Aeronaves

Processos de Check-in e Bagagem

Emissão e controle de Passagens

Interface gráfica com Java Swing

Integração com banco de dados via JDBC

Tecnologias Utilizadas
Java 8+

Java Swing (interface gráfica)

JDBC (acesso a banco de dados)

Ant (via build.xml)

IDE recomendada: IntelliJ IDEA ou NetBeans

Estrutura do Projeto
bash
Copiar
Editar
SistemaAeroporto/
├── src/
│   ├── model/         # Entidades do sistema (POJOs)
│   ├── controller/    # Lógica de controle (MVC)
│   └── view/          # Interfaces Swing (não exibido aqui, mas presumido)
├── db.properties      # Configuração do banco de dados
├── build.xml          # Script de build (Ant)
└── manifest.mf        # Manifesto para criação de JAR executável
Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/Ruivoooo/SistemaAeroporto.git
cd SistemaAeroporto
Abra o projeto em sua IDE (IntelliJ ou NetBeans)

Configure o banco de dados

Edite o arquivo db.properties com os dados corretos de conexão

Compile e execute

Via IDE: Execute a classe principal (Main, por exemplo)

Via terminal (se configurado):

bash
Copiar
Editar
ant run
Banco de Dados
O sistema utiliza um banco relacional.

As credenciais e URL estão no arquivo db.properties.

Requisitos
Java JDK 8 ou superior

Ant (opcional, para build via terminal)

Banco de dados compatível com JDBC (ex: MySQL, PostgreSQL)

