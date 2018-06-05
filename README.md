# sistemalogin


necessario um banco de dados MySql

deve se criar o database : sistemalogin

basta executar o comando: CREATE DATABASE sistemalogin;

Após fazer isso abra o projeto no IntelliJ ou no STS

no intellij provavelmente irá reconhecer que o projeto é Maven no Eclipse STS provavelmente terá que converter o projeto para Maven e baixar as dependencias

execute o projeto pois ele estará configurado para criar a tabela e inserir um usuario valido na tabela

As credenciais criadas são:

email: rodrigo@intelipost.com
senha: admin

depois de executar o projeto é só testar no Postman

URL para autenticar na API

URI: http://localhost:8080/api/auth/
Metodo: POST
Content-Type: application-json
Body Raw:
{
	"email":"rodrigo@rodrigo.com",
	"password":"admin"
}


Após autenticar na API basta testar os entry points privados usando o token que irá retornar no header

use no header a key "Authorization" com o value igual ao token que retornar

entry points privados para testes


URI: http://localhost:8080/home
Metodo: GET
Content-type: application-json

URI: http://localhost:8080/users
Metodo: GET
Content-type: application-json


caso o servidor tenha problema com a porta basta mudar no arquivo application.properties o atributo server.port o padrão está a porta 8080





