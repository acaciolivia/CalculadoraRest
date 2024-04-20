# API de Calculadora com Spring

Esta API é um sistema de calculadora desenvolvido em Java com o framework Spring. Ela fornece endpoints RESTful para realizar operações matemáticas básicas, como adição, subtração, multiplicação e divisão.

## Funcionalidades Principais

- **Operações Matemáticas**: A API oferece endpoints para realizar operações de adição, subtração, multiplicação e divisão.
- **Flexibilidade de Uso**: Os usuários podem enviar solicitações HTTP para realizar cálculos com diferentes números e operadores.
- **Padrão RESTful**: A API segue as práticas recomendadas para criar uma interface de serviço web RESTful.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Framework**: Utilizado para desenvolver a API RESTful.
- **Spring Boot**: Facilita a configuração e o desenvolvimento de aplicativos Spring.

## Como Usar

Para utilizar esta API em seu ambiente local, siga estas etapas:

1. **Clonar o Repositório**:

git clone 


2. **Compilar e Executar**:
- Navegue até o diretório do projeto e execute:


3. **Realizar Operações Matemáticas**:
- Utilize um cliente HTTP, como o Postman, para enviar solicitações para os endpoints da API.
- Exemplos de endpoints:
  - Adição: `POST /api/calculadora/somar`
  - Subtração: `POST /api/calculadora/subtrair`
  - Multiplicação: `POST /api/calculadora/multiplicar`
  - Divisão: `POST /api/calculadora/dividir`

## Endpoints Disponíveis

- **POST /api/calculadora/soma**: Realiza uma operação de adição.
- **POST /api/calculadora/subtrair**: Realiza uma operação de subtração.
- **POST /api/calculadoramultiplicar**: Realiza uma operação de multiplicação.
- **POST /api/calculadora/dividir**: Realiza uma operação de divisão.
- **GET /api/calculadora**: Busca todos os resultados das operações feitas e que foram salvas no banco de dados

