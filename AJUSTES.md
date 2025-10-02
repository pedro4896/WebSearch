# Ajustes feitos sobre as respostas da IA

---

### Ajuste 1 – Estrutura de pacotes
- **Problema:** IA gerou código no pacote `websearch`, mas meus arquivos estavam em `src/data`.
- **Por que não serviu:** O compilador não encontrou `QueryObserver` e `QueryFilter`.
- **Ajuste aplicado:** Reorganizei arquivos dentro de `src/websearch` para manter coerência com o enunciado.
- **Melhora:** Agora o projeto compila corretamente e mantém boa organização de pacotes.

---

### Ajuste 2 – Comentários no código
- **Problema:** A IA entregou código funcional, mas sem comentários detalhados sobre Strategy.
- **Por que não serviu totalmente:** O professor exige documentação que conte a história da solução.
- **Ajuste aplicado:** Adicionei comentários em cada classe (`QueryFilter`, `WebSearchModel`, `Snooper`, etc.).
- **Melhora:** Agora o código explica claramente o papel de cada classe e a aplicação do padrão Strategy.

---

### Ajuste 3 – Histórico de commits
- **Problema:** IA entregou solução em bloco único.
- **Por que não serviu totalmente:** A atividade exige commits curtos e progressivos.
- **Ajuste aplicado:** Dividi a implementação em 7 commits lógicos (base, interfaces, refactor, filtros, Snooper, Main, docs).
- **Melhora:** O histórico agora conta a evolução da solução, como se fosse um diário de desenvolvimento.

---
