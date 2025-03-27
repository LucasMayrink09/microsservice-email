# Email Sender Microservice

Este é um microserviço para envio de e-mails via SMTP, desenvolvido com Java e Spring Boot. Ele recebe requisições HTTP contendo os detalhes do e-mail e os envia utilizando um servidor SMTP configurado.

## Tecnologias utilizadas
- Java 17+
- Spring Boot
- Spring Mail
- SMTP

## Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/email-sender-microservice.git
   cd email-sender-microservice
Configure as credenciais SMTP no application.properties:

spring.mail.host=smtp.seuprovedor.com
spring.mail.port=587
spring.mail.username=seuemail@dominio.com
spring.mail.password=suasenha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

Execute o serviço:

mvn spring-boot:run


Como usar
Faça uma requisição POST para o endpoint /send-email com o seguinte payload:

{
  "to": "destinatario@exemplo.com",
  "subject": "Assunto do e-mail",
  "body": "Conteúdo do e-mail"
}
Exemplo de requisição usando cURL:
bash
Copiar
Editar
curl -X POST http://localhost:8080/send-email \
     -H "Content-Type: application/json" \
     -d '{
           "to": "destinatario@exemplo.com",
           "subject": "Teste de e-mail",
           "body": "Este é um e-mail enviado pelo microserviço"
         }'
