# Monorepo Project
Integração Backend e Frontend

# Sobre o projeto

Esse projeto faz parte da semana Spring Boot de 2022 do canal DevSuperior. 

A aplicação integra Backend e Frontend, consistindo em uma interface renderizada pelo ReactJS, com endpoints para acesso ao banco de dados e envio de notificação via SMS utilizando o Twilio.

## Aplicação:
<img src="/../readme/images/aplicacao.gif" alt="image 2" width=550 height=500>

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Banco de dados: H2
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- Axios
## Implantação em produção
- Front end web: Netlify
- Back end: Heroku
## Teste API REST
- Postman
- Twilio

# Como executar o projeto

## clonar repositório
git clone https://github.com/MarcosAndreBueno/dsmeta.git

## Back end
Pré-requisitos: 
  - Java 17
  - Conta no Twilio
  
```bash
# entrar na pasta resource do projeto back end
cd backend/src/main/resources

# configurar application.properties
notepad application.properties
```
Preencher com seus dados:   

- twilio.sid=${TWILIO_SID}  
- twilio.key=${TWILIO_KEY}  
- twilio.phone.from=${TWILIO_PHONE_FROM}  
- twilio.phone.to=${TWILIO_PHONE_TO}  

```bash
# executar o projeto na pasta backend
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# entrar na pasta do projeto front end web
cd frontend

# instalar dependências package.json
yarn

# instalar react-datepicker
yarn add react-datepicker@4.8.0 @types/react-datepicker@4.4.2

# executar o projeto
yarn dev
```
