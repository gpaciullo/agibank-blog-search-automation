# Agibank - Automação de Testes Web (Busca de Artigos)

## 📌 Objetivo

Automatizar cenários relevantes da funcionalidade de busca de artigos do Blog do Agi, garantindo a validação do comportamento esperado tanto para termos válidos quanto inválidos.

---

## 🧪 Cenários Automatizados

### 1. Busca com termo válido

* Realiza a busca por um termo existente (ex: "FGTS")
* Valida que resultados relevantes são retornados

### 2. Busca com termo inexistente

* Realiza a busca por um termo inválido
* Valida que o sistema não retorna resultados ou exibe mensagem apropriada

---

## 🛠️ Tecnologias Utilizadas

* Java 17
* Maven
* Selenium WebDriver
* JUnit 5
* WebDriverManager

---

## 📁 Estrutura do Projeto

* `base`: configuração base dos testes
* `pages`: Page Object Model
* `tests`: cenários automatizados

---

## ▶️ Como Executar

```bash
mvn clean test
```

---

## 📊 Estratégia de Automação

Inicialmente foi avaliada a automação via interação com o ícone de busca (lupa).
Porém, devido à implementação dinâmica do componente (JavaScript e animações), optou-se por utilizar a navegação direta via URL de busca.

Essa abordagem garante:

* maior estabilidade da automação
* redução de flakiness
* foco na validação da funcionalidade principal

A URL segue o padrão do WordPress:
https://blog.agibank.com.br/?s=termo

---

## 💡 Considerações

A solução prioriza:

* estabilidade
* legibilidade do código
* fácil execução em diferentes ambientes (Windows/Linux/Mac)
* boas práticas com Page Object Model
