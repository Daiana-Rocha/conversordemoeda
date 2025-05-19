![logo](https://github.com/user-attachments/assets/bf37ec76-a8e2-4ae4-acbb-831969f86435)

# conversordemoeda2
💱 Conversor de Moedas (Java + API)
Este projeto é um conversor de moedas desenvolvido em Java com interação via console. Ele consome uma API pública para realizar conversões de câmbio em tempo real, salvando os resultados em arquivos .txt e mantendo um log de erros.

🧾 Objetivo
Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão é obtida dinamicamente via API, garantindo dados atualizados e precisos.

📌 Funcionalidades
Menu interativo no terminal para escolha das moedas
Conversão de valores com base em cotação atual
Mínimo de 6 opções de conversão (USD ↔ BRL, EUR ↔ USD etc.)
Salvamento das conversões em arquivo conversoes.txt
Registro de erros no arquivo log.txt
Integração com API pública (ex: ExchangeRate API ou AwesomeAPI)
🏗 Estrutura do Projeto
image

🧰 Requisitos
Java 11 ou superior
Biblioteca Gson (JSON)
📦 Dependência
Este projeto utiliza a biblioteca Gson para manipulação de JSON. O .jar foi adicionado manualmente ao projeto.

Arquivo: gson-2.13.1.jar
Caminho: File -> Project Structure -> Modules -> Dependencies -> Add.
🌐 APIs suportadas ExchangeRate API – requer chave (gratuita)
