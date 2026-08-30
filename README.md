# FKFactions

Início de um plugin de facções em Kotlin — ficou só na camada de dados, nunca saiu do papel além disso.

O que existe:

- `Faction` / `FactionMember` — estrutura básica de uma facção e seus membros
- `FactionRole` — papéis dentro da facção (ex: líder, oficial, membro)
- `FactionAccess` — níveis de permissão sobre território/recursos
- `TerritoryType` — tipos de terreno que uma facção pode reivindicar

Não tem listener, comando ou persistência implementados — é o modelo de domínio que eu desenhei antes de parar o projeto.
