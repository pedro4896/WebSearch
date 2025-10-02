# Registro de uso de IA (ChatGPT)

> Ferramenta utilizada: ChatGPT (GPT-5)  
> Datas: 01/10/2025 – 02/10/2025  
> Disciplina: Padrões de Projeto

---

## Prompt 1
**Pergunta:**  
"O pacote websearch no código inicial contém código parcial... Altere o código para que ele use o padrão Strategy [...]"

**Resposta (resumo da IA):**
- Criar interface `QueryFilter` com método `isInteresting(String query)`.
- Alterar `WebSearchModel` para receber observadores com filtro.
- Criar `FriendFilter` e `LongQueryFilter`.
- Alterar `Snooper` para imprimir com prefixo.
- Alterar `Main` para registrar dois observadores com filtros distintos.

---

## Prompt 2
**Pergunta:**  
"Vou enviar os arquivos que tenho para que você faça a modificação."

**Resposta (resumo da IA):**
- A IA adaptou os arquivos enviados (`Main.java`, `Snooper.java`, `WebSearchModel.java`).
- Criou novas classes (`QueryFilter`, `QueryObserver`, `FriendFilter`, `LongQueryFilter`).
- Mostrou código final com Strategy.

---

## Prompt 3
**Pergunta:**  
"cannot find symbol class QueryObserver / QueryFilter"

**Resposta (resumo da IA):**
- IA identificou que os arquivos estavam faltando e sugeriu criar `QueryObserver.java` e `QueryFilter.java`.
- Explicou problema de **estrutura de pacotes** e duas soluções: mudar `package` ou mover arquivos para pasta correta (`websearch/`).

---

## Prompt 4
**Pergunta:**  
"Quero que gere os commits parte por parte e adicione explicações no código"

**Resposta (resumo da IA):**
- IA gerou um plano de 7 commits progressivos.
- Adicionou comentários explicativos no código mostrando **quando imprimir (Strategy)** e **como imprimir (Observer)**.  
