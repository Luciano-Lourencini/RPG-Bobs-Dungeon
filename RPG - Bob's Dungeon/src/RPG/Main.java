/*UPDATES

21/07/2021 - Adicionado o caminho 1 para o modo sem equipamentos com as suas probabilidades ajustadas
*/

package RPG;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //variáveis
        Random rand = new Random();
        rand.nextInt(100);

        Scanner in = new Scanner(System.in);

        String nome,equip,acao;
        int dificuldade=0,opcao,caminho=0,crianca=0;
        
        //programa
        System.out.println(" _______  _______  _______  __   _______     ______   __   __  __    _  _______  _______  _______  __    _ \n");
        System.out.println("|  _    ||       ||  _    ||  | |       |   |      | |  | |  ||  |  | ||       ||       ||       ||  |  | |\n");
        System.out.println("| |_|   ||   _   || |_|   ||__| |  _____|   |  _    ||  | |  ||   |_| ||    ___||    ___||   _   ||   |_| |\n");
        System.out.println("|       ||  | |  ||       |     | |_____    | | |   ||  |_|  ||       ||   | __ |   |___ |  | |  ||       |\n");
        System.out.println("|  _   | |  |_|  ||  _   |      |_____  |   | |_|   ||       ||  _    ||   ||  ||    ___||  |_|  ||  _    |\n");
        System.out.println("| |_|   ||       || |_|   |      _____| |   |       ||       || | |   ||   |_| ||   |___ |       || | |   |\n");
        System.out.println("|_______||_______||_______|     |_______|   |______| |_______||_|  |__||_______||_______||_______||_|  |__|\n");
        System.out.println("\t\t\t\tUma obra de Luciano Lourencini Jr");
        
        System.out.println("*lembre-se de não usar caracteres especiais, como 'ç' e acentos\n\n");
        System.out.println(">>Olá caro(a) aventureiro(a), seja muito bem-vindo à Masmorra do Bob!\n>>Eu sou o velho Jack, aquele que guia os novos aventureiros pela masmorra\n\n>>Antes de começarmos, diga-me seu nome: ");
        nome = in.nextLine();

        System.out.println("\n>>"+nome+", um belo nome!\n>>Agora me diga, você gostaria de receber o equipamento base?\n");
        equip = in.nextLine();
        do
        {
            if(equip.equals("Sim") || equip.equals("sim") || equip.equals("SIM"))
            {
                dificuldade=1;
                System.out.println("\n\n  +Espada\n  +Elmo de Ferro\n  +Couraça de Ferro\n  +Grebas de Ferro\n  +Escarpe de Ferro\n\n");

                System.out.println(">>Certo, agora vamos ao momento mais esperado:\n\n\t QUE A JORNADA SE INICIE\n\n\t\tANDAR 1\n\n>>Logo à sua frente, você encontra 3 caminhos, qual deseja seguir? (1|2|3)");
                opcao = in.nextInt();

                do
                {
                    switch(opcao)
                    {
                        case 1:
                            caminho=1;
                            System.out.println("\n\t\tCAMINHO 1\n>>Você se depara com um porco selvagem, A=ATACAR ou F=FUGIR?\n");
                            acao = in.nextLine();
                            acao = in.nextLine();  //repete por causa de um "bug" no Java
                            if(acao.equals("A") || acao.equals("a"))
                            {
                                System.out.println("\n\n---ATACA---\n\n");
                                if(rand.nextInt(100)<75)
                                {
                                    System.out.println("Você venceu!\n\n>>Ao andar pelo caminho, uma criança aparentemente abandonada pede sua ajuda, você:\n\t1-Aceita ou 2-Ignora");
                                    opcao = in.nextInt();
                                    do
                                    {
                                        switch(opcao)
                                        {
                                            case 1:
                                                crianca=1;
                                                System.out.println("\n\n---ACEITA---\n\n");
                                                if(rand.nextInt(100)>50)
                                                {
                                                    System.out.println(">>De repente a criança revela ser na verdade um anão astuto\n>>Por seu ato de heroísmo, ele te mostra um atalho para o 3º andar da masmorra!");
                                                    System.out.println("\n\n\t\tANDAR 3\n\n>>Ao chegar ao 3º andar, um minotauro enorme está sentado em seu trono\n>>Você: 1- ATACA ou 2- CONVERSA");
                                                    int i=0;
                                                    do
                                                    {
                                                        opcao = in.nextInt();
                                                        switch(opcao)
                                                        {
                                                            case 1:
                                                                i=1;
                                                                System.out.println("\n\n---ATACA---\n\n");
                                                                if(rand.nextInt(50)<10)
                                                                {
                                                                    System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                    System.out.println("                                          \n");
                                                                    System.out.println(" _______  ___   __   __ \n");
                                                                    System.out.println("|       ||   | |  |_|  |\n");
                                                                    System.out.println("|    ___||   | |       |\n");
                                                                    System.out.println("|   |___ |   | |       |\n");
                                                                    System.out.println("|    ___||   | |       |\n");
                                                                    System.out.println("|   |    |   | | ||_|| |\n");
                                                                    System.out.println("|___|    |___| |_|   |_|\n");
                                                                    System.out.println("                                          \n");
                                                                    System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                }
                                                                else
                                                                {
                                                                    System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                    System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                    System.out.println("                                          \n");
                                                                    System.out.println(" _____                  _____             \n");
                                                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                    System.out.println("                                          \n");
                                                                }
                                                            break;

                                                            case 2:
                                                                i=1;
                                                                System.out.println("\n\n---CONVERSA---\n\n");
                                                                System.out.println("MINOTAURO: Olá aventureiro, vejo que chegou até o final da masmorra!\nMINOTAURO: Devo te parabenizar por ter chagado tão longe!!");
                                                                System.out.println("Infelizmente você se esforçou tanto para nada pois chegaste teu fim! HAHAHAHAH");
                                                                System.out.println("\nOPÇÕES DE FALA:\n 1- Agradeço pela consideração demonstrada por mim! Aceitarei meu destino...\n 2- Cai dentro chifrudo!!\n 3- Deixa disso rapaz, bora beber um Dollynho e relaxar! :)\n\nOpção escolhida: ");
                                                                int op,fim=0;
                                                                do
                                                                {
                                                                    op = in.nextInt();
                                                                    switch(op)
                                                                    {
                                                                        case 1:
                                                                            fim=1;
                                                                            System.out.println("\n>>Realmente você é bem bobão...\nO minotauro te acerta em cheio\n");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println(" _______  ___   __   __ \n");
                                                                            System.out.println("|       ||   | |  |_|  |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |___ |   | |       |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |    |   | | ||_|| |\n");
                                                                            System.out.println("|___|    |___| |_|   |_|\n");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                        break;

                                                                        case 2:
                                                                            fim=1;
                                                                            System.out.println("\n\n>>DIGITE ALGO PARA O ATACAR!!\n");
                                                                            String atac = in.nextLine();
                                                                            atac = in.nextLine();
                                                                            if(rand.nextInt(50)<10)
                                                                            {
                                                                                System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _______  ___   __   __ \n");
                                                                                System.out.println("|       ||   | |  |_|  |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |___ |   | |       |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |    |   | | ||_|| |\n");
                                                                                System.out.println("|___|    |___| |_|   |_|\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                                System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _____                  _____             \n");
                                                                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                                System.out.println("                                          \n");
                                                                            }
                                                                        break;

                                                                        case 3:
                                                                            fim=1;
                                                                            System.out.println(">>O minotauro se sentiu comovido pelo delicioso Dollynho e te poupa de todo sofrimento\n>>Vocês se tornam grandes amigos e passam o resto de suas vidas jogando buraco e vendo vídeos no ZAP\n\n>>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println(" _______  ___   __   __ \n");
                                                                            System.out.println("|       ||   | |  |_|  |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |___ |   | |       |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |    |   | | ||_|| |\n");
                                                                            System.out.println("|___|    |___| |_|   |_|\n");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                        break;

                                                                        default:
                                                                            System.out.println("\n>>ESCOLHE AÍ SEU IMBECÍL!!");
                                                                        break;
                                                                    }
                                                                }
                                                                while(fim==0);
                                                            break;

                                                            default:
                                                                System.out.println(">>VOCÊ TEM DUAS OPÇÕES, NÃO ME ENCHE!!\n1- ATACA ou 2- CONVERSA?\n");
                                                            break;
                                                        }
                                                    }
                                                    while(i==0);
                                                }
                                                else
                                                {
                                                    System.out.println(">>De repente a criança revela ser na verdade um anão astuto\n>>Antes mesmo de sacar sua espada, ele o apunhala na barriga...\n\n");
                                                    System.out.println("                                          \n");
                                                    System.out.println(" _____                  _____             \n");
                                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                    System.out.println("                                          \n");
                                                }
                                            break;

                                            case 2:
                                                crianca = 1;
                                                System.out.println("\n\n---IGNORA---\n\n");
                                                if(rand.nextInt(100)>50)
                                                {
                                                    System.out.println(">>Você continua andando e deixa a criança para trás\n>>Que indivíduo desprezível...\n\n>>Mais a frente você encontra uma escada que te leva ao 2º andar da msamorra\n");
                                                    System.out.println("\t\tANDAR 2\n\n>>Ao final da escada, você é surpreendido por um velho troll que está bloqueando a passagem\n\nTROLL: Olá aventureiro, para passar você terá de acertar a minha charada!\n");
                                                    System.out.println("TROLL: Você tem 3 tentativas, se não acertar, você pagará com sua vida! heheh\nTROLL:Aí vai a charada: 'Abaixo fiquei, não há muito tempo clamei, a ti avisei e por ti morrerei'");
                                                    int i=0,certo=0;
                                                    String palavra;
                                                    palavra = in.nextLine();
                                                    for(i=0;i<3;i++)
                                                    {
                                                        palavra = in.nextLine();
                                                        if(palavra.equals("Crianca") || palavra.equals("crianca") || palavra.equals("CRIANCA"))
                                                        {
                                                            i=2;certo=1;
                                                            System.out.println("\nTROLL:Muito bem! Acertaste o enigma!\nTROLL: Vá em paz guerreiro!\n");
                                                            System.out.println(">>Aparentemente, o esse andar é só um longo corredor!\n>>Ao alcançar seu final, você encontra um elevador o qual apresenta uma tela te perguntando qual seria o próximo andar\n\nDIGITE: ");
                                                            opcao = in.nextInt();
                                                            if(opcao==3)
                                                            {
                                                                System.out.println("\n\n\t\tANDAR 3\n\n>>Ao chegar ao 3º andar, um minotauro enorme está sentado em seu trono\n>>Você: 1- ATACA ou 2- CONVERSA");
                                                                int j=0;
                                                                do
                                                                {
                                                                    opcao = in.nextInt();
                                                                    switch(opcao)
                                                                    {
                                                                        case 1:
                                                                            j=1;
                                                                            System.out.println("\n\n---ATACA---\n\n");
                                                                            if(rand.nextInt(50)<10)
                                                                            {
                                                                                System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _______  ___   __   __ \n");
                                                                                System.out.println("|       ||   | |  |_|  |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |___ |   | |       |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |    |   | | ||_|| |\n");
                                                                                System.out.println("|___|    |___| |_|   |_|\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                                System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _____                  _____             \n");
                                                                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                                System.out.println("                                          \n");
                                                                            }
                                                                        break;

                                                                        case 2:
                                                                            j=1;
                                                                            System.out.println("\n\n---CONVERSA---\n\n");
                                                                            System.out.println("MINOTAURO: Olá aventureiro, vejo que chegou até o final da masmorra!\nMINOTAURO: Devo te parabenizar por ter chagado tão longe!!");
                                                                            System.out.println("Infelizmente você se esforçou tanto para nada pois chegaste teu fim! HAHAHAHAH");
                                                                            System.out.println("\nOPÇÕES DE FALA:\n 1- Agradeço pela consideração demonstrada por mim! Aceitarei meu destino...\n 2- Cai dentro chifrudo!!\n 3- Deixa disso rapaz, bora beber um Dollynho e relaxar! :)\n\nOpção escolhida: ");
                                                                            int op,fim=0;
                                                                            do
                                                                            {
                                                                                op = in.nextInt();
                                                                                switch(op)
                                                                                {
                                                                                    case 1:
                                                                                        fim=1;
                                                                                        System.out.println("\n>>Realmente você é bem bobão...\nO minotauro te acerta em cheio\n");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println(" _______  ___   __   __ \n");
                                                                                        System.out.println("|       ||   | |  |_|  |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |___ |   | |       |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |    |   | | ||_|| |\n");
                                                                                        System.out.println("|___|    |___| |_|   |_|\n");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                                    break;

                                                                                    case 2:
                                                                                        fim=1;
                                                                                        System.out.println("\n\n>>DIGITE ALGO PARA O ATACAR!!\n");
                                                                                        String atac = in.nextLine();
                                                                                        atac = in.nextLine();
                                                                                        if(rand.nextInt(50)<10)
                                                                                        {
                                                                                            System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                            System.out.println("                                          \n");
                                                                                            System.out.println(" _______  ___   __   __ \n");
                                                                                            System.out.println("|       ||   | |  |_|  |\n");
                                                                                            System.out.println("|    ___||   | |       |\n");
                                                                                            System.out.println("|   |___ |   | |       |\n");
                                                                                            System.out.println("|    ___||   | |       |\n");
                                                                                            System.out.println("|   |    |   | | ||_|| |\n");
                                                                                            System.out.println("|___|    |___| |_|   |_|\n");
                                                                                            System.out.println("                                          \n");
                                                                                            System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                                            System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                                            System.out.println("                                          \n");
                                                                                            System.out.println(" _____                  _____             \n");
                                                                                            System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                                            System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                                            System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                                            System.out.println("                                          \n");
                                                                                        }
                                                                                    break;

                                                                                    case 3:
                                                                                        fim=1;
                                                                                        System.out.println(">>O minotauro se sentiu comovido pelo delicioso Dollynho e te poupa de todo sofrimento\n>>Vocês se tornam grandes amigos e passam o resto de suas vidas jogando buraco e vendo vídeos no ZAP\n\n>>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println(" _______  ___   __   __ \n");
                                                                                        System.out.println("|       ||   | |  |_|  |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |___ |   | |       |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |    |   | | ||_|| |\n");
                                                                                        System.out.println("|___|    |___| |_|   |_|\n");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                                    break;

                                                                                    default:
                                                                                        System.out.println("\n>>ESCOLHE AÍ SEU IMBECÍL!!");
                                                                                    break;
                                                                                }
                                                                            }
                                                                            while(fim==0);
                                                                        break;

                                                                        default:
                                                                            System.out.println(">>VOCÊ TEM DUAS OPÇÕES, NÃO ME ENCHE!!\n1- ATACA ou 2- CONVERSA?\n");
                                                                        break;
                                                                    }
                                                                }
                                                    while(i==0);
                                                            }
                                                            else
                                                            {
                                                                System.out.println("\n\nVOCÊ DIGITOU O ANDAR ERRADO!!\n>>Por causa de sua falta de atenção, você fica preso dentro do elevador até a sua morte...\n");
                                                                System.out.println("                                          \n");
                                                                System.out.println(" _____                  _____             \n");
                                                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                System.out.println("                                          \n");
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Errado! tentativa "+(i+1)+" desperdiçada!");
                                                        }
                                                    }
                                                    if(certo==0)
                                                    {
                                                        System.out.println("\nTROLL: Combinado é combinado... SINTA O PESO DO MARTELO!!\n");
                                                        System.out.println("                                          \n");
                                                        System.out.println(" _____                  _____             \n");
                                                        System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                        System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                        System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                        System.out.println("                                          \n");
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println(">>Você continua andando e deixa a criança para trás\n>>De repente ouve alguns passos que se tornam cada vez mais rápidos em sua direção\n>>Antes mesmo de sacar sua espada, ele o apunhala na barriga...\n\n");
                                                    System.out.println("                                          \n");
                                                    System.out.println(" _____                  _____             \n");
                                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                    System.out.println("                                          \n");
                                                }
                                            break;

                                            default:
                                                System.out.println("\n>>Ficar parado não vai adiantar! SE DECIDA!!\n\nVocê:\n\t1-Aceita ou 2-Ignora");
                                                opcao = in.nextInt();
                                            break;
                                        }
                                    }
                                    while(crianca==0);
                                }
                                else
                                {
                                    System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                    System.out.println("                                          \n");
                                    System.out.println(" _____                  _____             \n");
                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                    System.out.println("                                          \n");
                                }
                            }
                            else if(acao.equals("f")||acao.equals("F"))
                            {
                                System.out.println("\n\n---FOGE---\n\n");
                                if(rand.nextInt(100)>50)
                                {
                                    System.out.println(">>Você conseguiu escapar!\n\n");
                                    //colar o resto
                                }
                                else
                                {
                                    System.out.println(">>Você não conseguiu escapar...\n");
                                    System.out.println("                                          \n");
                                    System.out.println(" _____                  _____             \n");
                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                    System.out.println("                                          \n");
                                }
                            }
                            else
                            {
                                System.out.println(">>Como você nem atacou nem fugiu o porco selvagem te atingiu fatalmente...\n");
                                System.out.println("                                          \n");
                                System.out.println(" _____                  _____             \n");
                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                System.out.println("                                          \n");
                            }
                        break;

                        case 2:  //FALTA
                            caminho=1;
                            System.out.println("\n\t\tCAMINHO 2\n");

                            System.out.println("EM DESENVOLVIMENTO");
                        break;

                        case 3:  //FALTA
                            caminho=1;
                            System.out.println("\n\t\tCAMINHO 3\n");

                            System.out.println("EM DESENVOLVIMENTO");
                        break;

                        default:
                            System.out.println("\nCAMINHO INVÁLIDO!\n\n>>Qual deseja seguir? (1|2|3)\n");
                            opcao = in.nextInt();
                        break;
                    }
                }
                while(caminho==0);    
            }
            else if(equip.equals("Nao") || equip.equals("nao") || equip.equals("NAO")) //modo hard
            {
                dificuldade=1;
                System.out.println("\n\n>>Ora se não temos aqui um aventureiro rebelde!\n>>Que o seu poder seja tão grande quanto sua arrogância!\n\n\t QUE A JORNADA SE INICIE\n\n>>Logo à sua frente, você encontra 3 caminhos, qual deseja seguir? (1|2|3)");
                opcao = in.nextInt();
                
                do
                {
                    switch(opcao)
                    {
                        case 1:
                            caminho=1;
                            System.out.println("\n\t\tCAMINHO 1\n>>Você se depara com um porco selvagem, A=ATACAR ou F=FUGIR?\n");
                            acao = in.nextLine();
                            acao = in.nextLine();  //repete por causa de um "bug" no Java
                            if(acao.equals("A") || acao.equals("a"))
                            {
                                System.out.println("\n\n---ATACA---\n\n");
                                if(rand.nextInt(100)<40)
                                {
                                    System.out.println("Você venceu!\n\n>>Ao andar pelo caminho, uma criança aparentemente abandonada pede sua ajuda, você:\n\t1-Aceita ou 2-Ignora");
                                    opcao = in.nextInt();
                                    do
                                    {
                                        switch(opcao)
                                        {
                                            case 1:
                                                crianca=1;
                                                System.out.println("\n\n---ACEITA---\n\n");
                                                if(rand.nextInt(100)>90)
                                                {
                                                    System.out.println(">>De repente a criança revela ser na verdade um anão astuto\n>>Por seu ato de heroísmo, ele te mostra um atalho para o 3º andar da masmorra!");
                                                    System.out.println("\n\n\t\tANDAR 3\n\n>>Ao chegar ao 3º andar, um minotauro enorme está sentado em seu trono\n>>Você: 1- ATACA ou 2- CONVERSA");
                                                    int i=0;
                                                    do
                                                    {
                                                        opcao = in.nextInt();
                                                        switch(opcao)
                                                        {
                                                            case 1:
                                                                i=1;
                                                                System.out.println("\n\n---ATACA---\n\n");
                                                                if(rand.nextInt(50)<5)
                                                                {
                                                                    System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                    System.out.println("                                          \n");
                                                                    System.out.println(" _______  ___   __   __ \n");
                                                                    System.out.println("|       ||   | |  |_|  |\n");
                                                                    System.out.println("|    ___||   | |       |\n");
                                                                    System.out.println("|   |___ |   | |       |\n");
                                                                    System.out.println("|    ___||   | |       |\n");
                                                                    System.out.println("|   |    |   | | ||_|| |\n");
                                                                    System.out.println("|___|    |___| |_|   |_|\n");
                                                                    System.out.println("                                          \n");
                                                                    System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                }
                                                                else
                                                                {
                                                                    System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                    System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                    System.out.println("                                          \n");
                                                                    System.out.println(" _____                  _____             \n");
                                                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                    System.out.println("                                          \n");
                                                                }
                                                            break;

                                                            case 2:
                                                                i=1;
                                                                System.out.println("\n\n---CONVERSA---\n\n");
                                                                System.out.println("MINOTAURO: Olá aventureiro, vejo que chegou até o final da masmorra!\nMINOTAURO: Devo te parabenizar por ter chagado tão longe!!");
                                                                System.out.println("Infelizmente você se esforçou tanto para nada pois chegaste teu fim! HAHAHAHAH");
                                                                System.out.println("\nOPÇÕES DE FALA:\n 1- Agradeço pela consideração demonstrada por mim! Aceitarei meu destino...\n 2- Cai dentro chifrudo!!\n 3- Deixa disso rapaz, bora beber um Dollynho e relaxar! :)\n\nOpção escolhida: ");
                                                                int op,fim=0;
                                                                do
                                                                {
                                                                    op = in.nextInt();
                                                                    switch(op)
                                                                    {
                                                                        case 1:
                                                                            fim=1;
                                                                            System.out.println("\n>>Realmente você é bem bobão...\nO minotauro te acerta em cheio\n");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println(" _______  ___   __   __ \n");
                                                                            System.out.println("|       ||   | |  |_|  |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |___ |   | |       |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |    |   | | ||_|| |\n");
                                                                            System.out.println("|___|    |___| |_|   |_|\n");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                        break;

                                                                        case 2:
                                                                            fim=1;
                                                                            System.out.println("\n\n>>DIGITE ALGO PARA O ATACAR!!\n");
                                                                            String atac = in.nextLine();
                                                                            atac = in.nextLine();
                                                                            if(rand.nextInt(50)<5)
                                                                            {
                                                                                System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _______  ___   __   __ \n");
                                                                                System.out.println("|       ||   | |  |_|  |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |___ |   | |       |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |    |   | | ||_|| |\n");
                                                                                System.out.println("|___|    |___| |_|   |_|\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                                System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _____                  _____             \n");
                                                                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                                System.out.println("                                          \n");
                                                                            }
                                                                        break;

                                                                        case 3:
                                                                            fim=1;
                                                                            System.out.println(">>O minotauro se sentiu comovido pelo delicioso Dollynho e te poupa de todo sofrimento\n>>Vocês se tornam grandes amigos e passam o resto de suas vidas jogando buraco e vendo vídeos no ZAP\n\n>>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println(" _______  ___   __   __ \n");
                                                                            System.out.println("|       ||   | |  |_|  |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |___ |   | |       |\n");
                                                                            System.out.println("|    ___||   | |       |\n");
                                                                            System.out.println("|   |    |   | | ||_|| |\n");
                                                                            System.out.println("|___|    |___| |_|   |_|\n");
                                                                            System.out.println("                                          \n");
                                                                            System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                        break;

                                                                        default:
                                                                            System.out.println("\n>>ESCOLHE AÍ SEU IMBECÍL!!");
                                                                        break;
                                                                    }
                                                                }
                                                                while(fim==0);
                                                            break;

                                                            default:
                                                                System.out.println(">>VOCÊ TEM DUAS OPÇÕES, NÃO ME ENCHE!!\n1- ATACA ou 2- CONVERSA?\n");
                                                            break;
                                                        }
                                                    }
                                                    while(i==0);
                                                }
                                                else
                                                {
                                                    System.out.println(">>De repente a criança revela ser na verdade um anão astuto\n>>Antes mesmo de sacar sua espada, ele o apunhala na barriga...\n\n");
                                                    System.out.println("                                          \n");
                                                    System.out.println(" _____                  _____             \n");
                                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                    System.out.println("                                          \n");
                                                }
                                            break;

                                            case 2:
                                                crianca = 1;
                                                System.out.println("\n\n---IGNORA---\n\n");
                                                if(rand.nextInt(100)>75)
                                                {
                                                    System.out.println(">>Você continua andando e deixa a criança para trás\n>>Que indivíduo desprezível...\n\n>>Mais a frente você encontra uma escada que te leva ao 2º andar da msamorra\n");
                                                    System.out.println("\t\tANDAR 2\n\n>>Ao final da escada, você é surpreendido por um velho troll que está bloqueando a passagem\n\nTROLL: Olá aventureiro, para passar você terá de acertar a minha charada!\n");
                                                    System.out.println("TROLL: Você tem 3 tentativas, se não acertar, você pagará com sua vida! heheh\nTROLL:Aí vai a charada: 'Abaixo fiquei, não há muito tempo clamei, a ti avisei e por ti morrerei'");
                                                    int i=0,certo=0;
                                                    String palavra;
                                                    palavra = in.nextLine();
                                                    for(i=0;i<3;i++)
                                                    {
                                                        palavra = in.nextLine();
                                                        if(palavra.equals("Crianca") || palavra.equals("crianca") || palavra.equals("CRIANCA"))
                                                        {
                                                            i=2;certo=1;
                                                            System.out.println("\nTROLL:Muito bem! Acertaste o enigma!\nTROLL: Vá em paz guerreiro!\n");
                                                            System.out.println(">>Aparentemente, o esse andar é só um longo corredor!\n>>Ao alcançar seu final, você encontra um elevador o qual apresenta uma tela te perguntando qual seria o próximo andar\n\nDIGITE: ");
                                                            opcao = in.nextInt();
                                                            if(opcao==3)
                                                            {
                                                                System.out.println("\n\n\t\tANDAR 3\n\n>>Ao chegar ao 3º andar, um minotauro enorme está sentado em seu trono\n>>Você: 1- ATACA ou 2- CONVERSA");
                                                                int j=0;
                                                                do
                                                                {
                                                                    opcao = in.nextInt();
                                                                    switch(opcao)
                                                                    {
                                                                        case 1:
                                                                            j=1;
                                                                            System.out.println("\n\n---ATACA---\n\n");
                                                                            if(rand.nextInt(50)<5)
                                                                            {
                                                                                System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _______  ___   __   __ \n");
                                                                                System.out.println("|       ||   | |  |_|  |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |___ |   | |       |\n");
                                                                                System.out.println("|    ___||   | |       |\n");
                                                                                System.out.println("|   |    |   | | ||_|| |\n");
                                                                                System.out.println("|___|    |___| |_|   |_|\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                                System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                                System.out.println("                                          \n");
                                                                                System.out.println(" _____                  _____             \n");
                                                                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                                System.out.println("                                          \n");
                                                                            }
                                                                        break;

                                                                        case 2:
                                                                            j=1;
                                                                            System.out.println("\n\n---CONVERSA---\n\n");
                                                                            System.out.println("MINOTAURO: Olá aventureiro, vejo que chegou até o final da masmorra!\nMINOTAURO: Devo te parabenizar por ter chagado tão longe!!");
                                                                            System.out.println("Infelizmente você se esforçou tanto para nada pois chegaste teu fim! HAHAHAHAH");
                                                                            System.out.println("\nOPÇÕES DE FALA:\n 1- Agradeço pela consideração demonstrada por mim! Aceitarei meu destino...\n 2- Cai dentro chifrudo!!\n 3- Deixa disso rapaz, bora beber um Dollynho e relaxar! :)\n\nOpção escolhida: ");
                                                                            int op,fim=0;
                                                                            do
                                                                            {
                                                                                op = in.nextInt();
                                                                                switch(op)
                                                                                {
                                                                                    case 1:
                                                                                        fim=1;
                                                                                        System.out.println("\n>>Realmente você é bem bobão...\nO minotauro te acerta em cheio\n");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println(" _______  ___   __   __ \n");
                                                                                        System.out.println("|       ||   | |  |_|  |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |___ |   | |       |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |    |   | | ||_|| |\n");
                                                                                        System.out.println("|___|    |___| |_|   |_|\n");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                                    break;

                                                                                    case 2:
                                                                                        fim=1;
                                                                                        System.out.println("\n\n>>DIGITE ALGO PARA O ATACAR!!\n");
                                                                                        String atac = in.nextLine();
                                                                                        atac = in.nextLine();
                                                                                        if(rand.nextInt(50)<5)
                                                                                        {
                                                                                            System.out.println(">>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                            System.out.println("                                          \n");
                                                                                            System.out.println(" _______  ___   __   __ \n");
                                                                                            System.out.println("|       ||   | |  |_|  |\n");
                                                                                            System.out.println("|    ___||   | |       |\n");
                                                                                            System.out.println("|   |___ |   | |       |\n");
                                                                                            System.out.println("|    ___||   | |       |\n");
                                                                                            System.out.println("|   |    |   | | ||_|| |\n");
                                                                                            System.out.println("|___|    |___| |_|   |_|\n");
                                                                                            System.out.println("                                          \n");
                                                                                            System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            System.out.println(">>Sério mesmo que você pensou que ia dar certo??\n");
                                                                                            System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                                                                            System.out.println("                                          \n");
                                                                                            System.out.println(" _____                  _____             \n");
                                                                                            System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                                            System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                                            System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                                            System.out.println("                                          \n");
                                                                                        }
                                                                                    break;

                                                                                    case 3:
                                                                                        fim=1;
                                                                                        System.out.println(">>O minotauro se sentiu comovido pelo delicioso Dollynho e te poupa de todo sofrimento\n>>Vocês se tornam grandes amigos e passam o resto de suas vidas jogando buraco e vendo vídeos no ZAP\n\n>>Parabéns "+nome+", você venceu a masmorra!!\n>>Sua honra será lembrada por gerações!!");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println(" _______  ___   __   __ \n");
                                                                                        System.out.println("|       ||   | |  |_|  |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |___ |   | |       |\n");
                                                                                        System.out.println("|    ___||   | |       |\n");
                                                                                        System.out.println("|   |    |   | | ||_|| |\n");
                                                                                        System.out.println("|___|    |___| |_|   |_|\n");
                                                                                        System.out.println("                                          \n");
                                                                                        System.out.println("\t\tCréditos: Luciano Lourencini Jr\n");
                                                                                    break;

                                                                                    default:
                                                                                        System.out.println("\n>>ESCOLHE AÍ SEU IMBECÍL!!");
                                                                                    break;
                                                                                }
                                                                            }
                                                                            while(fim==0);
                                                                        break;

                                                                        default:
                                                                            System.out.println(">>VOCÊ TEM DUAS OPÇÕES, NÃO ME ENCHE!!\n1- ATACA ou 2- CONVERSA?\n");
                                                                        break;
                                                                    }
                                                                }
                                                    while(i==0);
                                                            }
                                                            else
                                                            {
                                                                System.out.println("\n\nVOCÊ DIGITOU O ANDAR ERRADO!!\n>>Por causa de sua falta de atenção, você fica preso dentro do elevador até a sua morte...\n");
                                                                System.out.println("                                          \n");
                                                                System.out.println(" _____                  _____             \n");
                                                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                                System.out.println("                                          \n");
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Errado! tentativa "+(i+1)+" desperdiçada!");
                                                        }
                                                    }
                                                    if(certo==0)
                                                    {
                                                        System.out.println("\nTROLL: Combinado é combinado... SINTA O PESO DO MARTELO!!\n");
                                                        System.out.println("                                          \n");
                                                        System.out.println(" _____                  _____             \n");
                                                        System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                        System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                        System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                        System.out.println("                                          \n");
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println(">>Você continua andando e deixa a criança para trás\n>>De repente ouve alguns passos que se tornam cada vez mais rápidos em sua direção\n>>Antes mesmo de sacar sua espada, ele o apunhala na barriga...\n\n");
                                                    System.out.println("                                          \n");
                                                    System.out.println(" _____                  _____             \n");
                                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                                    System.out.println("                                          \n");
                                                }
                                            break;

                                            default:
                                                System.out.println("\n>>Ficar parado não vai adiantar! SE DECIDA!!\n\nVocê:\n\t1-Aceita ou 2-Ignora");
                                                opcao = in.nextInt();
                                            break;
                                        }
                                    }
                                    while(crianca==0);
                                }
                                else
                                {
                                    System.out.println(">>Seu ataque foi muito fraco e você perdeu...\n");
                                    System.out.println("                                          \n");
                                    System.out.println(" _____                  _____             \n");
                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                    System.out.println("                                          \n");
                                }
                            }
                            else if(acao.equals("f")||acao.equals("F"))
                            {
                                System.out.println("\n\n---FOGE---\n\n");
                                if(rand.nextInt(100)>75)
                                {
                                    System.out.println(">>Você conseguiu escapar!\n\n");
                                    //colar o resto
                                }
                                else
                                {
                                    System.out.println(">>Você não conseguiu escapar...\n");
                                    System.out.println("                                          \n");
                                    System.out.println(" _____                  _____             \n");
                                    System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                    System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                    System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                    System.out.println("                                          \n");
                                }
                            }
                            else
                            {
                                System.out.println(">>Como você nem atacou nem fugiu o porco selvagem te atingiu fatalmente...\n");
                                System.out.println("                                          \n");
                                System.out.println(" _____                  _____             \n");
                                System.out.println("|   __|___ _____ ___   |     |_ _ ___ ___ \n");
                                System.out.println("|  |  | .'|     | -_|  |  |  | | | -_|  _|\n");
                                System.out.println("|_____|__,|_|_|_|___|  |_____|_ /|___|_|  \n");
                                System.out.println("                                          \n");
                            }
                        break;

                        case 2:  //FALTA
                            caminho=1;
                            System.out.println("\n\t\tCAMINHO 2\n");

                            System.out.println("EM DESENVOLVIMENTO");
                        break;

                        case 3:  //FALTA
                            caminho=1;
                            System.out.println("\n\t\tCAMINHO 3\n");

                            System.out.println("EM DESENVOLVIMENTO");
                        break;

                        default:
                            System.out.println("\nCAMINHO INVÁLIDO!\n\n>>Qual deseja seguir? (1|2|3)\n");
                            opcao = in.nextInt();
                        break;
                    }
                }
                while(caminho==0);
            }
            else
            {
                System.out.println("\n\n>>Isso não é uma resposta, diga Sim ou Não (Sem acento no 'Não')");
                equip = in.nextLine();
            }
        }
        while(dificuldade==0);
    }
}
