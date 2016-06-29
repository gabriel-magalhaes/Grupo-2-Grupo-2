## Clonando o projeto

Pela linha de comando, na pasta onde deseja fazer o download do projeto deve-se executar o seguinte comando:
```sh
git clone https://github.com/gabriel-magalhaes/Grupo-2-Grupo-2.git
```
É criada uma pasta com o nome "Grupo-2-Grupo-2" com o conteúdo do projeto

## Executando o projeto

Na pasta `raiz/src` execute o comando
```sh
mvn compile tomcat7:run
```

Após finalizada a execução acesse o link <http://localhost:8084/MaxMove/>

## Rodando os testes

Na pasta `raiz/src` execute o comando
```sh
mvn test-compile test
```

---

## Nome do projeto

* **MaxMove**

## Banco de dados utilizado

* Derby

## Organização dos diretórios

| Diretório | Descrição |
| --------- | --------- |
| raiz/docs | Documentação do projeto |
| raiz/scripts | Scripts SQL |
| raiz/src | Códigos-fonte do projeto |
