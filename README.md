# Atividade Prática 01 – Calculadora e Calculador de Viagem

Este repositório contém um projeto Android em Java desenvolvido como parte da disciplina Desenvolvimento para Dispositivos Móveis I. O aplicativo foi pensado para exercitar o uso de múltiplas activities, navegação entre telas e manipulação de interface com o Android Studio. O projeto oferece duas funcionalidades principais: uma calculadora aritmética simples e um cálculo de custo de viagem.

## Funcionalidades principais
- Tela inicial (MainActivity) – apresenta a mensagem de boas‑vindas e oferece dois botões: um para entrar na calculadora e outro para acessar o cálculo de viagem. A tela utiliza ConstraintLayout com um LinearLayout centralizado. Os botões btnCalculadora e btnViagem são configurados para abrir as telas apropriadas via Intent.
- Menu de operações (HomeActivity) – após escolher a calculadora, o usuário é direcionado para uma tela com quatro botões (somar, subtrair, multiplicar e dividir). Cada botão define, via Intent, a operação que será calculada. Essa tela é responsável apenas por selecionar a operação.
- Tela de cálculo (CalculaActivity) – recebe a operação selecionada, exibe um título dinâmico e permite informar dois números. Ao tocar em Calcular, o aplicativo obtém os valores digitados, realiza a operação (soma, subtração, multiplicação ou divisão) e mostra o resultado por meio de um Toast. Também há um botão Voltar que retorna à tela anterior.
- Tela de viagem (ViagemActivity) – calcula o custo de uma viagem informando distância, valor do combustível e média de consumo. A operação divide a distância pela média para obter os litros necessários e multiplica pelo valor do combustíveç. O resultado é exibido em um Toast. Um botão Voltar retorna à tela inicial.

Além das telas, o projeto define temas com Material 3 DayNight, arquivos de recursos (strings.xml, colors.xml), regras ProGuard e a estrutura padrão de um projeto Android.

## Organização do projeto
- app/src/main/java/com/example/calculadora – contém as classes das quatro activities (MainActivity, HomeActivity, CalculaActivity e ViagemActivity).
- app/src/main/res/layout – layouts XML para cada tela. Por exemplo, a activity_home.xml define um LinearLayout com botões para cada operação da calculadora, enquanto activity_viagem.xml dispõe os campos de entrada de distância, valor do combustível e média por litro.
- app/build.gradle.kts – define o namespace, compileSdk 36, minSdk 24 e dependências como appcompat, material, activity e constraintlayout.

## Pré‑requisitos

Para compilar e executar este projeto, você precisará de:

- JDK 11 ou superior – compatível com as configurações de sourceCompatibility e targetCompatibility definidas no build.gradle.
- Android Studio Hedgehog (ou versão recente) – para abrir o projeto, sincronizar as dependências e rodar o aplicativo. O projeto utiliza compileSdk 36 e targetSdk 36.
- Emulador ou dispositivo Android com Android 7.0 (API 24) ou superior.

## Como executar

1. Clone ou baixe este repositório e abra a pasta no Android Studio (Arquivo → Abrir). Não se esqueça de permitir que o Android Studio importe o projeto como um projeto Gradle.
2. Aguarde a sincronização do Gradle. Caso seja solicitado, aceite a instalação das dependências e das ferramentas do Android SDK.
3. Escolha um dispositivo físico conectado via ADB ou um emulador configurado, clique em Run e selecione a app module para compilar e instalar o aplicativo.
4. Navegue pelo aplicativo. Na tela inicial, escolha entre Calculadora ou Viagem. Se selecionar Calculadora, escolha a operação desejada e informe os números. Se selecionar Viagem, informe a distância, o preço do combustível e a média de consumo para obter o valor aproximado da viagem.

## Contribuindo

Sinta‑se livre para propor melhorias ou abrir issues. Este projeto é um exercício acadêmico, mas correções de bugs e sugestões de aprimoramento são bem‑vindas.
