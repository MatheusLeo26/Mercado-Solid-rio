# ♻️ Coleta ProgAção (Mercado Solidário) - Projeto acadêmico FACENS - Faculdade de Engenharia de Sorocaba

> Sistema em Java desenvolvido para gerenciar o cadastro de colaboradores e endereços em iniciativas de coleta social e reciclagem.

## 📖 Sobre o Projeto

O **Coleta ProgAção** (hospedado no repositório *Mercado Solidário*) é uma aplicação interativa via terminal que visa estruturar e organizar o cadastro de pessoas interessadas em participar de campanhas de reciclagem. O sistema aplica conceitos sólidos de Programação Orientada a Objetos (POO) para gerenciar dados com eficiência e clareza.

### 🎓 Contexto Acadêmico
Este projeto foi desenvolvido como parte da **UPX (Usina de Projetos Experimentais)** do curso de **Análise e Desenvolvimento de Sistemas (ADS)** da **Facens** (5º Semestre), focado no eixo de Transformação Digital.

## 🚀 Funcionalidades

- **Cadastro via Console:** Interface interativa via terminal para coleta de dados do usuário passo a passo.
- **Gestão de Perfil:** Armazenamento de dados pessoais como Nome, E-mail, Senha e Telefone.
- **Gestão de Localização:** Módulo isolado para o cadastro do endereço de coleta (Rua, CEP e Número).
- **Resumo de Operação:** Exibição formatada dos dados do colaborador após o sucesso do registro.

## 🏗️ Arquitetura e Estrutura do Código

O projeto foi construído separando as responsabilidades em classes distintas, utilizando os princípios de **Encapsulamento** e **Composição**:

- `Main.java`: Classe principal responsável por instanciar o `Scanner`, interagir com o usuário no terminal e orquestrar o fluxo de cadastro.
- `DadosColaboradores.java`: Classe modelo que encapsula as credenciais e o contato do usuário.
- `enderecoColeta.java`: Classe dedicada a gerenciar os dados de localização, integrada como um objeto dentro da classe de colaboradores.
- `.gitignore`: Configurado para ignorar arquivos de compilação da IDE (`.idea/`, `out/`, etc.), mantendo o repositório do GitHub limpo.

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java (JDK 15)
- **Entrada de Dados:** `java.util.Scanner`
- **Paradigma:** Orientação a Objetos
- **IDE Utilizada:** IntelliJ IDEA
- **Controle de Versão:** Git / GitHub

## ⚙️ Como executar o projeto

### Pré-requisitos
- [Java Development Kit (JDK) 15+](https://jdk.java.net/) instalado na máquina.
- Uma IDE de sua preferência (recomendamos o IntelliJ IDEA) ou terminal configurado para compilar arquivos `.java`.

### Passo a Passo

1. Clone este repositório para a sua máquina local:
   ```bash
   git clone [https://github.com/MatheusLeo26/Mercado-Solid-rio.git](https://github.com/MatheusLeo26/Mercado-Solid-rio.git)

2. Abra a pasta do projeto na sua IDE.

3. Navegue até o diretório fonte: src/com/meusistema/clientes/.

4. Execute o arquivo Main.java.

5. Siga as instruções no console para preencher os dados do colaborador de teste.

🤝 Desenvolvedores
Equipe responsável pelo desenvolvimento do sistema:

Matheus Leonardo Guia

Amanda

Adriano

Guilherme
