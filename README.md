# WebSearch – Padrão Strategy aplicado

## 📖 Descrição
Este projeto simula um mecanismo de busca que lê consultas de um arquivo (`Hamlet.txt`) e notifica observadores interessados nessas consultas.

O código original notificava **todos os observadores para todas as consultas**.  
Com as modificações, aplicamos o **padrão Strategy**, de forma que cada observador só recebe notificações quando um **filtro (Strategy)** decidir que a consulta é relevante.

---

## 🎯 Objetivo da Atividade
- Reestruturar o código usando o padrão **Strategy**.
- Criar diferentes estratégias de filtragem de consultas:
    - `FriendFilter`: considera interessante qualquer consulta que contenha a palavra **"friend"** (sem diferenciar maiúsculas).
    - `LongQueryFilter`: considera interessante qualquer consulta com mais de **60 caracteres**.
- Demonstrar que o **modelo (WebSearchModel)** não conhece a lógica dos filtros, apenas executa a estratégia fornecida.

---

## 🛠️ Estrutura do Projeto
**src/<br>**
├─ **Main.java** # Cliente – registra observadores e executa a leitura<br>
├─ **Snooper.java** # Observador concreto – imprime consultas<br>
├─ **WebSearchModel.java** # Modelo – processa consultas e aplica filtros<br>
├─ **QueryObserver.java** # Interface Observer<br>
├─ **QueryFilter.java** # Interface Strategy<br>
├─ **FriendFilter.java** # Strategy concreta (palavra "friend")<br>
├─ **LongQueryFilter.java** # Strategy concreta (consultas > 60 chars)<br>
**Hamlet.txt** # Arquivo de entrada (simula consultas)<br>
**PROMPTS.md** # Registro de prompts feitos à IA<br>
**AJUSTES.md** # Registro dos ajustes manuais após respostas da IA<br>


---

## ▶️ Como Executar

1. Compile os arquivos:
   ```bash
   javac src/*.java

2. Execute o programa:
   ```bash
   java -cp src Main

3. Saída esperada (exemplo):
   ```bash
   Oh Yes! Friends to this ground.
   So long Enter KING CLAUDIUS, QUEEN GERTRUDE, HAMLET...
   Oh Yes! And let thine eye look like a friend on Denmark.
   ...

## 🧩 Aplicação do Padrão Strategy

Strategy (QueryFilter)
Define a interface que decide se uma consulta é interessante.

Concrete Strategies (FriendFilter, LongQueryFilter)
Implementam diferentes políticas de filtragem de consultas.

Context (WebSearchModel)
Lê o arquivo, aplica a Strategy e notifica apenas os observadores interessados.

Observer (Snooper)
Apenas imprime a consulta, mas só é chamado quando o filtro (Strategy) retornar true.

✅ Com isso, novos filtros podem ser adicionados sem alterar WebSearchModel, bastando criar uma nova classe que implemente QueryFilter.

## 📑 Documentação com IA

Durante o desenvolvimento, foi exigido que todo o uso de IA fosse documentado. Para isso, usamos dois arquivos:

### 🔹 PROMPTS.md

Contém todos os prompts enviados à IA.

Registra a resposta resumida da IA para cada prompt.

Serve como histórico de como a IA contribuiu para a solução.

### 🔹 AJUSTES.md

Registra os ajustes manuais feitos após a resposta da IA.

Explica por que a resposta da IA não foi suficiente ou correta.

Justifica como o ajuste manual melhorou a solução.

Esses arquivos garantem transparência no uso da IA e ajudam a entender o raciocínio seguido até a solução final.

## 📌 Histórico de Commits

O desenvolvimento foi dividido em pequenos commits que contam a história da solução:

1. adicionar código base do projeto (src.zip)

2. criar interfaces QueryObserver e QueryFilter

3. alterar WebSearchModel para aceitar filtros de consulta

4. implementar filtros concretos FriendFilter e LongQueryFilter

5. adaptar Snooper para imprimir mensagens customizadas

6. atualizar Main para registrar Snoopers com filtros

7. adicionar histórico de prompts e ajustes da IA

Cada commit foi acompanhado de comentários no código e referência em **PROMPTS.md** e **AJUSTES.md**.

## 👨‍💻 Autores

- Pedro Victor da Silva Pereira
- Valéria Cristina