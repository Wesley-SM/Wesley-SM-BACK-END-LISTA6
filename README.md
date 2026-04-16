# Lista 006 - Spring Web (Exercícios)

focado no desenvolvimento de APIs REST utilizando Java e Spring Boot. O projeto abrange desde manipulação de query strings e path variables até o armazenamento de dados em memória.

##  Tecnologias Utilizadas
* **Java 17+**
* **Spring Boot 3.x**
* **Maven**
* **IntelliJ IDEA**

---

##  Como executar o projeto
1. Clone o repositório.
2. Certifique-se de que o Maven baixou todas as dependências no seu IntelliJ.
3. Execute a classe principal: `DemoApplication.java`.
4. O servidor estará rodando em: `http://localhost:8080`.

---

##  Exercícios e Como Testar

### 1. Recomendador de Viagem
Recebe clima e estilo por query strings e retorna um destino.
* **URL:** `GET /recomendar?clima=calor&estilo=natureza`
* **Teste:** [http://localhost:8080/recomendar?clima=calor&estilo=natureza](http://localhost:8080/recomendar?clima=calor&estilo=natureza)

### 2. Gerador de Jogador
Gera um jogador aleatório com base no time e posição informados na URL.
* **URL:** `GET /jogador/{time}/{posicao}`
* **Exemplo:** [http://localhost:8080/jogador/criciuma/goleiro](http://localhost:8080/jogador/criciuma/goleiro)

### 3. Gerenciamento de Estudantes
Cadastro e listagem de estudantes em memória.
* **Cadastrar (POST):** `http://localhost:8080/estudantes`
    * *Body (JSON):*
        ```json
        {
          "nome": "Rivaldo",
          "codigo": 123456,
          "curso": "Engenharia de Software",
          "email": "rivaldo@email.com",
          "telefone": "11999999999"
        }
        ```
* **Listar Todos (GET):** [http://localhost:8080/estudantes](http://localhost:8080/estudantes)

### 4. Playlist Web
Gerenciamento de playlists e músicas.
* **Criar Playlist (POST):** `http://localhost:8080/playlists`
    * *Body (JSON):* `{"id": 1, "nome": "Rock Anos 80"}`
* **Adicionar Música (POST):** `http://localhost:8080/playlists/1/musica`
    * *Body (JSON):*
        ```json
        {
          "id": 10,
          "nome": "Sweet Child O' Mine",
          "artista": "Guns N' Roses",
          "album": "Appetite for Destruction",
          "duracao": 254,
          "genero": "Rock"
        }
        ```
* **Ver Músicas da Playlist (GET):** `http://localhost:8080/playlists/1`

---
**Nota:** Para testar as rotas do tipo **POST**, utilize ferramentas como Postman ou Insomnia.
